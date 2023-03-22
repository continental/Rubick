import os
import sys
import copy
import glob
import json
import string

import z3
import pprint

import nfa
import utils

if __name__ == '__main__':
	import a2dg

from ipdb import launch_ipdb_on_exception

pp = pprint.PrettyPrinter(indent=2)

class BasicEvent(object):
	def __init__(self):
		pass
	
	def signature(self):
		raise Exception('not implemented')

	def __eq__(self, other):
		return self.signature() == other.signature()
	
	def __hash__(self):
		return hash(self.signature())

class EpsilonEvent(BasicEvent):
	def __init__(self, ejson):
		self.index = ejson['idx']
		self.id = ('E', self.index)

	def signature(self):
		return self.id

class FuncCallEvent(BasicEvent):
	def __init__(self, fjson):
		self.funcSig = fjson['func']
		self.id = ('F', self.funcSig)
	
	def signature(self):
		return self.id

class ConstraintEvent(BasicEvent):
	def __init__(self, ipath):
		self.rawIpath = ipath
		self.flattenIpath = ' && '.join([ ConstraintEvent.flatIexpr(iexpr) for iexpr in ipath ])
		self.id = ('C', self.flattenIpath)
	
	def signature(self):
		return self.id

	@staticmethod
	def flatIopr(iopr):
		ty = iopr['type']
		if ty == 'binop':
			return iopr['op']
		elif ty == 'unop':
			return iopr['op']
		else:
			raise Exception('this cannot happen')

	@staticmethod
	def flatIexpr(iexpr):
		ty = iexpr['type'] 
		if ty == 'binexpr':
			return '(' + ConstraintEvent.flatIexpr(iexpr['lop']) + ConstraintEvent.flatIopr(iexpr['opr']) + ConstraintEvent.flatIexpr(iexpr['rop']) + ')'
		elif ty == 'unexpr':
			return '(' + ConstraintEvent.flatIopr(iexpr['opr']) + ConstraintEvent.flatIexpr(iexpr['op']) + ')'
		elif ty == 'valueexpr':
			return iexpr['value']
		else:
			raise Exception('this cannot happen')

	@staticmethod
	def isValueExprIntroduceNewVar(iexpr):
		ty = iexpr['type'] 
		value = iexpr['value'].strip()
		if ty == 'valueexpr':
			# TODO: fix this, make more general later
			# here is to identify the taint variables
			if value.endswith('.RET') or value.endswith('.ITR'):
				return True

		return False

	@staticmethod
	def getDefinitions(iexpr):
		# find definitions of taint variables
		# TODO: the taint mark should be refined later for recognition & harness synthesis
		defs = set([])

		ty = iexpr['type'] 
		if ty == 'binexpr':
			defs.update(ConstraintEvent.getDefinitions(iexpr['lop']))
			defs.update(ConstraintEvent.getDefinitions(iexpr['rop']))
		elif ty == 'unexpr':
			defs.update(ConstraintEvent.getDefinitions(iexpr['op']))
		elif ty == 'valueexpr':
			if ConstraintEvent.isValueExprIntroduceNewVar(iexpr):
				defs.add(iexpr['value'].strip())
		else:
			raise Exception('this cannot happen')

		return defs

	@staticmethod
	def _realToZ3Expr(iexpr):
		ty = iexpr['type'] 
		if ty == 'binexpr':
			opr = iexpr['opr']['op'].strip()
			if opr == '&&':
				return 'z3.And(' + ConstraintEvent._realToZ3Expr(iexpr['lop']) + ', ' + ConstraintEvent._realToZ3Expr(iexpr['rop']) + ')'
			elif opr == '||':
				return 'z3.Or(' + ConstraintEvent._realToZ3Expr(iexpr['lop']) + ', ' + ConstraintEvent._realToZ3Expr(iexpr['rop']) + ')'
			else:
				return '(' + ConstraintEvent._realToZ3Expr(iexpr['lop']) + opr + ConstraintEvent._realToZ3Expr(iexpr['rop']) + ')'

		elif ty == 'unexpr':
			opr = iexpr['opr']['op'].strip()
			if opr == '!':
				return 'z3.Not(' + ConstraintEvent._realToZ3Expr(iexpr['op']) + ')'
			elif opr.startswith('CAST'):
				# N.B. we ignore CAST now
				return ConstraintEvent._realToZ3Expr(iexpr['op']) 
			else:
				return '(' + opr + ConstraintEvent._realToZ3Expr(iexpr['op']) + ')'

		elif ty == 'valueexpr':
			value = iexpr['value'].strip()
			if value.isdigit() or utils.isfloat(value):
				return value
			# For java:
			# if there is sth that is not constant numbers and not null, then
			# it must be a taint variable
			return 'def2vars["%s"]' % (value)

		else:
			raise Exception('this cannot happen')

	@staticmethod
	def toZ3Expr(def2vars, cevent):
		z3exprs = []
		for iexpr in cevent.rawIpath:
			z3expr = ConstraintEvent._realToZ3Expr(iexpr)
			z3exprs.append(z3expr)
		
		finalExpr = z3exprs[0]
		for expr in z3exprs[1:]:
			finalExpr = "z3.And(" + finalExpr + ", " + expr + ")"

		# print('==========')
		# print(cevent.signature())
		# print('++++++++++')
		# TODO: currently we skip the evaluation of unsupported iExpr
		CROSS_SIGN = "╳";
		RECT_SIGN = "🞮";
		if (CROSS_SIGN in finalExpr) or (RECT_SIGN in finalExpr):
			return None

		try:
			x = eval(finalExpr)
			x = z3.simplify(x)
			# print(x)
			# print(z3.simplify(x))
			# print('----------')
			return x
		except Exception as e:
			print('meet exception when evaluating finalExpr: %s, Exception is: %s' % (finalExpr, e))
			return None

class Z3ConstraintEvent(BasicEvent):
	def __init__(self, z3expr, relatedDefs, refreshCondDefs, globalDef2varInfo):
		self.z3expr = z3expr
		self.globalDef2varInfo = globalDef2varInfo
		self.relatedDefs = tuple(list(relatedDefs))
		self.refreshCondDefs = tuple(list(refreshCondDefs))
		self.id = ('Z', str(self.z3expr), self.relatedDefs, self.refreshCondDefs)
	
	def signature(self):
		return self.id

class Automata:
	# parse an automata from json
	def __init__(self, nfa):
		# print(nfa)
		self.name = nfa['name']
		self.initials = set(nfa['initial'])
		self.states = set(nfa['states'])

		# alphabets are events
		self.events = set([])
		# init alias related for events
		self.__initAliasesList()
		# parse events and naming them
		self.sig2event = {}
		# trans are based on alias
		self.trans = {}

		# we parse transition map directly, no need to parse alphabets first
		warned = False
		for frm, info in nfa['map'].items():
			for to, letter in info.items():
				# for cond letter, it (ipaths) can be splitted into several events
				# N.B. one ipath <=> one event
				ty = letter['type']
				if ty == 'call':
					event = FuncCallEvent(letter)
					alias = self.__addEvent(event, None)
					self.__addTransition(frm, to, alias)

				elif ty == 'epsilon':
					event = EpsilonEvent(letter)
					alias = self.__addEvent(event, None)
					self.__addTransition(frm, to, alias)

				elif ty == 'cond':
					# letter['cond'] is ipaths, a list of ipath
					if len(letter['cond']) > 1:
						# warn this for future investigation
						if not warned:
							print("WARN: there is a letter contains more than one ipath in %s" % (nfa['name']))
							warned = True

					for ipath in letter['cond']:
						event = ConstraintEvent(ipath)
						alias = self.__addEvent(event, None)
						self.__addTransition(frm, to, alias)

				else:
					raise Exception('this cannot happen')
				
	def __initAliasesList(self):
		##  Aliases name list
		#self.fAliases = set(string.ascii_uppercase)
		#self.fAliases.discard('E')
		## E is reserved for epsilon
		#self.cAliases = set(string.ascii_lowercase)
		self.fAliasCount =  0
		self.eAliasCount =  0
		self.cAliasCount =  0
		self.alias2sig = {}
		self.sig2alias = {}

	def __registerNewAlias(self, eventsig, alias):
		if (alias in self.alias2sig) or (eventsig in self.sig2alias):
			raise Exception('conflict alias or eventsig')

		self.alias2sig[alias] = eventsig
		self.sig2alias[eventsig] = alias

	def __assignNewAlias(self, eventsig):
		alias = None

		ty = eventsig[0]
		if ty == 'F':
			self.fAliasCount += 1
			alias =  'f_%s' % (self.fAliasCount)
		elif ty == 'E':
			self.eAliasCount += 1
			alias =  'E_%s' % (self.eAliasCount)
		elif ty == 'C':
			self.cAliasCount += 1
			alias =  'c_%s' % (self.cAliasCount)
		elif ty == 'Z':
			raise Exception('Z3ConstraintEvent is not allowed to be added in this way')
		else:
			raise Exception('this should not happen')

		self.__registerNewAlias(eventsig, alias)

		return alias

	# add an event if is a new event & return the alias of that event
	def __addEvent(self, event, alias=None):
		if alias == None:
			if event not in self.events:
				eventsig = event.signature()
				alias = self.__assignNewAlias(eventsig)

				self.sig2event[eventsig] = event
				self.events.add(event)
			else:
				eventsig = event.signature()
				alias = self.sig2alias[eventsig]

			return alias
		else:
			if event not in self.events:
				eventsig = event.signature()
				self.__registerNewAlias(eventsig, alias)

				self.sig2event[eventsig] = event
				self.events.add(event)
			else:
				eventsig = event.signature()
				registered_alias = self.sig2alias[eventsig]
				if registered_alias != alias:
					raise Exception('eventsig %s registered with alias %s already has an alias %s' % (eventsig, registered_alias, alias))

			return alias

	def __addTransition(self, frm, to, eventAlias):
		if frm not in self.trans:
			self.trans[frm] = {}
		if to not in self.trans[frm]:
			self.trans[frm][to] = set([])

		self.trans[frm][to].add(eventAlias)

	def __delTransition(self, frm, to, eventAlias):
		if (frm in self.trans) and (to in self.trans[frm]):
			aliases = self.trans[frm][to]
			aliases.discard(eventAlias)

	# get a new automata by transforming existings
	def align(self, oldsig2newsig, newsig2newalias, newalias2newevents):
		aligned = copy.deepcopy(self)

		# reset alias & event related 
		aligned.events = set([])
		aligned.sig2event = {}
		aligned.trans = {}
		aligned.__initAliasesList()

		# align
		for frm, info in self.trans.items():
			for to, oldaliases in self.trans[frm].items():
				for oldalias in oldaliases:
					oldsig = self.alias2sig[oldalias]
					if oldsig in oldsig2newsig:
						# event that need align
						newsig = oldsig2newsig[oldsig]
						newalias = newsig2newalias[newsig]
						newevent = copy.deepcopy( newalias2newevents[newalias] )
						aligned.__addEvent(newevent, newalias)
						aligned.__addTransition(frm, to, newalias)
					else:
						# event that just copy (currently it is only epsilon event)
						oldevent = copy.deepcopy( self.sig2event[oldsig] )
						aligned.__addEvent(oldevent, oldalias)
						aligned.__addTransition(frm, to, oldalias)

						if not isinstance(oldevent, EpsilonEvent):
							raise Exception('this cannot happen: old event that is not epsilon event')
		
		return aligned

	def disableUselessCondsAfterAlign(self):
		# identify useless conds, replace them as epsilon events
		# 1. identify
		replaces = set([])
		maps = {}
		for frm, info in self.trans.items():
			maps[frm] = {}
			for to, aliases in info.items():
				for alias in aliases:
					if alias not in maps[frm]:
						maps[frm][alias] = set([])
					maps[frm][alias].add(to)

		for frm, info in self.trans.items():
			for to, aliases in info.items():
				# TODO: now we only check complement cond pairs
				if len(aliases) == 2:
					l = list(aliases)
					aa, ab = l[0], l[1]

					siga = self.alias2sig[aa]
					sigb = self.alias2sig[ab]
					if siga[0] == 'Z' and sigb[0] == 'Z':
						if len(maps[frm][aa]) != 1 or len(maps[frm][ab]) != 1:
							# the 2 conds are not only used in frm -> to, also in frm -> others
							# we skip this kind of cases
							continue

						# both are conditions, and from same startS to same endS
						# check whether they are complement
						expra = siga[1]
						exprb = sigb[1]
						if ('Not(' + expra + ')' == exprb) or ('Not(' + exprb + ')' == expra):
							# they are complement, replace them to epsilon events
							replaces.add( (frm, to, aa) )
							replaces.add( (frm, to, ab) )

		# 2. replace
		disabled = copy.deepcopy(self)
		if len(replaces) != 0:

			if 'Ɛ' not in disabled.alias2sig:
				eEvent = EpsilonEvent({'idx': -1})
				disabled.__addEvent(eEvent, "Ɛ")

			for f, t, a in replaces:
				disabled.__addTransition(f, t, "Ɛ")
				disabled.__delTransition(f, t, a)
			
		return disabled
		

	def eliminateEpsilon(self):
		# NOTE: this is supposed to be called on aligned automata
		removed = copy.deepcopy(self)

		# remove the epsilon in transitions
		new_initials = copy.deepcopy(removed.initials)
		while True:
			# find an epsilon tran
			eTran = None
			for frm, info in removed.trans.items():
				for to, aliases in info.items():
					if "Ɛ" in aliases:
						eTran = (frm, to)
			# if no epsilon tran, break
			if eTran == None:
				break

			# find all preStates of that epsilon tran
			eFrm, eTo = eTran
			preStates = set([])
			worklist = set([])
			for frm, info in removed.trans.items():
				for to, aliases in info.items():
					if to == eFrm:
						preState = frm
						# link preStates to the eTo state
						for alias in aliases:
							worklist.add((preState, eTo, alias))
			for preState, eTo, alias in worklist:
				removed.__addTransition(preState, eTo, alias)

			# remove the epsilon tran
			removed.__delTransition(eFrm, eTo, "Ɛ")

			# transit the initial state from eFrm 2 eTo
			if eFrm in new_initials:
				new_initials.add(eTo)

		indegrees, outdegrees = { s:0 for s in removed.states }, { s:0 for s in removed.states }
		for frm, info in removed.trans.items():
			for to, aliases in info.items():
				count = len(aliases)
				indegrees[to] += count
				outdegrees[frm] += count

		# recalculate initial states
		#removed.initials = set([ s for s, c in indegrees.items() if c == 0 ])
		removed.initials = new_initials

		# remove isolated states
		for isoState in set([ s for s in removed.states if (indegrees[s] == 0) and (outdegrees[s] == 0) ]):
			# this is a isolated state now
			removed.states.remove(isoState)
			removed.initials.remove(isoState)

		# remove epsilon events
		epsilonEvents = []
		for e in removed.events:
			if isinstance(e, EpsilonEvent):
				epsilonEvents.append(e)
		if len(epsilonEvents) > 1:
			raise Exception('aligned automata has more than one kind of epsilonEvent')
		
		for e in epsilonEvents:
			sig = e.signature()
			del removed.sig2event[sig]
			del removed.alias2sig["Ɛ"]
			del removed.sig2alias[sig]
			removed.events.remove(e)
		
		return removed

	def toTxt(self):
		txt = '# name\n'
		# TODO: fix the name later
		txt += '%s\n' % (self.name)
		txt += '# initial\n'
		txt += '%s\n' % (','.join( [ i for i in self.initials ]) )
		txt += '# finals\n'
		# naively set all states as finals, we can filter empty string later while traversing
		finals = [ s for s in self.states ]
		txt = txt + ','.join(finals) + '\n'
		txt += '# map\n'
		for frm, info in self.trans.items():
			for to, aliases in info.items():
				for alias in aliases:
					txt += '%s,%s,%s\n' % (frm, alias, to)
		txt += '$$$\n'
		return txt

def loadJsonfiles(files):
	objs = {}
	for file in files:
		with open(file, 'r') as f:
			obj = json.load(f)
			objs[file] = obj
	return objs

def simplifyConditions(allFEvents, allCEvents):
	# collect defs in all cevents
	
	loopvarGroups = {}
	for fevent in allFEvents:
		sig = fevent.funcSig
		if "_LOOPVAR_" in sig:
			k = sig.split("_LOOPVAR_")[0]
			if k not in loopvarGroups:
				loopvarGroups[k] = set([])
			# loopvar mock api only has ret
			loopvarGroups[k].add(sig + ".RET")
	#
	# prepare def2varInfo
	consRelatedDefs = {}
	refreshConDefs = {}
	for cevent in allCEvents:
		for iexpr in cevent.rawIpath:
			_defs = ConstraintEvent.getDefinitions(iexpr)

			if cevent not in consRelatedDefs:
				consRelatedDefs[cevent] = set([])
				refreshConDefs[cevent] = set([])
			consRelatedDefs[cevent].update(_defs)
			refreshConDefs[cevent].update(_defs)

			for _def in _defs:
				if '_LOOPVAR_' in _def:
					# find groups of _LOOPVAR_
					k = _def.split('_LOOPVAR_')[0]
					refreshConDefs[cevent].update(loopvarGroups[k])
	
	# naming for defs among all exprs
	loopvars = {}
	def2varName = {}
	idx = 0
	for fevent in allFEvents:
		sig = fevent.funcSig
		dret = sig + ".RET"
		ditr = fevent.funcSig + ".ITR"

		if 'LOOPVAR' in sig:
			# if exists, reuse
			k = sig.split('_LOOPVAR_')[0]
			if k in loopvars:
				def2varName[dret] = loopvars[k]
				continue

		# we just naively assign each func a ret var name
		def2varName[dret] = 'v_%s_' % (idx)

		if 'LOOPVAR' in sig:
			k = sig.split('_LOOPVAR_')[0]
			loopvars[k] = def2varName[dret]
		else:
			# loopvar doesn't have ITR
			def2varName[ditr] = 'v_%s_itr_' % (idx)

		idx += 1

	def2vars = {}
	for d, varName in def2varName.items():
		# def2vars[d] = z3.Int(varName)
		def2vars[d] = z3.BitVec(varName, 32)

	# fake for JAVA null
	# null = z3.Int('null')
	null = z3.BitVec('null', 32)
	null = 0
	def2varName['null'] = 'null'
	def2vars['null'] = null

	def2varInfo = {}
	for d in def2varName.keys():
		varName = def2varName[d]
		var = def2vars[d]
		def2varInfo[d] = (varName, var)

	#
	# prepare new cevent
	ceventOldSig2NewSig = {}
	ceventNewSig2NewEvent = {}

	for cevent in allCEvents:
		# one z3expr is one constraint we used in if/while directly
		z3expr = ConstraintEvent.toZ3Expr(def2vars, cevent)

		newEvent = None
		if z3expr == None:
			# we met unsupported iExpr, degrade this cevent to epsilon event
			newEvent = EpsilonEvent({'idx': -1})
		else:
			newEvent = Z3ConstraintEvent(z3expr, consRelatedDefs[cevent], refreshConDefs[cevent], def2varInfo)

		oldSig = cevent.signature()
		newSig = newEvent.signature()
		ceventOldSig2NewSig[oldSig] = newSig
		ceventNewSig2NewEvent[newSig] = newEvent

	# TODO: here can add more cevent simplify strategies
	#       e.g., check the conflict or implication relation among cevents

	#print('# of cevents: %s' % (len(allCEvents)))
	#print('# of z3exprs: %s' % (len(z3exprs)))

	#print('-------------')
	#print('\n'.join([ str(v) + " => " + d for d, v in def2varName.items() ]))
	#print('-------------')
	#print('\n'.join([ str(e) for e in list(z3exprs) ]))
	
	return def2varInfo, ceventOldSig2NewSig, ceventNewSig2NewEvent

def unifyEvents(automatas, a2dgAutomatas):
	# analyze (handle/merge events)

	oldCEvents = set([])
	oldEEvents = set([])
	allFEvents = set([])

	for a in automatas:
		for event in a.events:
			if isinstance(event, ConstraintEvent):
				oldCEvents.add(event)
			elif isinstance(event, FuncCallEvent):
				allFEvents.add(event)
			elif isinstance(event, EpsilonEvent):
				oldEEvents.add(event)
			elif isinstance(event, Z3ConstraintEvent):
				raise Exception('this cannot happen')
			else:
				raise Exception('this cannot happen')

	# sometimes a2dg automatas may contain different functions (e.g., some analysis of our tool failed)
	for a in a2dgAutomatas:
		for event in a.events:
			if isinstance(event, FuncCallEvent):
				allFEvents.add(event)
			elif isinstance(event, EpsilonEvent):
				pass
			else:
				raise Exception('this cannot happen')

	# merge cevents
	def2varInfo, ceventOldSig2NewSig, ceventNewSig2NewEvent = simplifyConditions(allFEvents, oldCEvents)

	allCEvents = set([])
	allEEvents = copy.deepcopy(oldEEvents)
	for newsig, newevent in ceventNewSig2NewEvent.items():
		if isinstance(newevent, EpsilonEvent):
			allEEvents.add(newevent)
		elif isinstance(newevent, Z3ConstraintEvent):
			allCEvents.add(newevent)
		else:
			raise Exception("this is impossible")

	# Till now, we've settle done all events
	# start to prepare all things align needs: oldsig2newsig, newsig2newalias, newevents

	# old/new sig mapping table
	oldSig2NewSig = ceventOldSig2NewSig
	for fevent in allFEvents:
		oldSig2NewSig[fevent.signature()] = fevent.signature()
	for eevent in oldEEvents:
		oldSig2NewSig[eevent.signature()] = eevent.signature()

	# assign aliases
	# aliasSource = list(string.ascii_letters)
	aliasSource = list(string.ascii_letters)
	# part of the chinese characters
	aliasSource.extend([ chr(c) for c in range(0x3400, 0x4DBF) ])
	#aliasSource.extend(string.punctuation)
	#aliasSource.remove(',')
	#aliasSource.remove('\\')
	#aliasSource.remove("'")
	#aliasSource.remove('"')
	aliasSource = list(set(aliasSource))

	# we use special character Ɛ for all EpsilonEvent, therefore no need assign from here
	# needAssign = len(allCEvents) + len(allFEvents) + len(allEEvents)
	needAssign = len(allCEvents) + len(allFEvents)
	if len(aliasSource) < needAssign:
		raise Exception('please provide a larger aliasSource (now %d < # of event %d' % (len(aliasSource), needAssign))
	
	newSig2NewAliases = {}
	newAlias2NewEvents = {}
	for cevent in allCEvents:
		# lower case letters first
		alias = aliasSource.pop(0)
		newSig2NewAliases[cevent.signature()] = alias
		newAlias2NewEvents[alias] = cevent
	for fevent in allFEvents:
		# upper case letters first
		alias = aliasSource.pop()
		newSig2NewAliases[fevent.signature()] = alias
		newAlias2NewEvents[alias] = fevent
	for eevent in allEEvents:
		# alias = aliasSource.pop(0)
		alias = "Ɛ"
		newSig2NewAliases[eevent.signature()] = alias
		newAlias2NewEvents[alias] = eevent

	alignedAutomatas = []
	for a in automatas:
		alignedAutomatas.append( a.align(oldSig2NewSig, newSig2NewAliases, newAlias2NewEvents).disableUselessCondsAfterAlign() )
	
	return def2varInfo, newAlias2NewEvents, alignedAutomatas

def eliminateEpsilon(alphabets, automatas):
	newAlphabets = copy.deepcopy(alphabets)
	del newAlphabets['alias2event']['Ɛ']

	newAutomatas = []
	for a in automatas:
		newAutomatas.append(a.eliminateEpsilon())

	return newAlphabets, newAutomatas

def genFuzzGenA2DGAutomatas(alphabets, automatas):
	# prepare new automatas
	assignedFeventAlias = {}
	for letter, eventsiglist in alphabets['alias2event'].items():
		# this is because json turns tuples to list
		eventsig = tuple(eventsiglist)
		ty = eventsig[0]
		if ty == 'F':
			assignedFeventAlias[eventsig] = letter

	# analyze (handle/merge events)
	allEEvents = set([])
	allFEvents = set([])

	for a in automatas:
		for event in a.events:
			if isinstance(event, FuncCallEvent):
				allFEvents.add(event)
			elif isinstance(event, EpsilonEvent):
				allEEvents.add(event)
			elif isinstance(event, ConstraintEvent):
				raise Exception('a2dg doesn\'t have this')
			elif isinstance(event, Z3ConstraintEvent):
				raise Exception('this cannot happen')

	# start to prepare all things align needs: oldsig2newsig, newsig2newalias, newevents
	# old/new sig mapping table
	oldSig2NewSig = {}
	for fevent in allFEvents:
		oldSig2NewSig[fevent.signature()] = fevent.signature()
	for eevent in allEEvents:
		oldSig2NewSig[eevent.signature()] = eevent.signature()

	# reuse aliases assigned before
	newSig2NewAliases = {}
	newAlias2NewEvents = {}
	for fevent in allFEvents:
		alias = assignedFeventAlias[fevent.signature()]
		newSig2NewAliases[fevent.signature()] = alias
		newAlias2NewEvents[alias] = fevent
	for eevent in allEEvents:
		alias = "Ɛ"
		newSig2NewAliases[eevent.signature()] = alias
		newAlias2NewEvents[alias] = eevent

	#
	# 3. prepare automatas
	newAutomatas = []
	for a in automatas:
		newAutomata = a.align(oldSig2NewSig, newSig2NewAliases, newAlias2NewEvents)
		newAutomatas.append(newAutomata.eliminateEpsilon())

	return newAutomatas

def dumpOutputs(out_dir, full_libmeta, alphabets, automatas):
	# prepare out dirs
	outLibMetaPath = os.path.join(out_dir, 'meta.json')
	outAlphabetPath = os.path.join(out_dir, 'alphabet.json')
	outNFAsPath = os.path.join(out_dir, 'nfa')
	os.makedirs(out_dir, exist_ok=True)
	os.makedirs(outNFAsPath, exist_ok=True)

	# dump merged libmeta
	with open(outLibMetaPath, 'w') as f:
		json.dump(full_libmeta, f, indent=2, sort_keys=True)
	#pp.pprint(full_libmeta)

	# dump alphabets
	with open(outAlphabetPath, 'w') as f:
		json.dump(alphabets, f, indent=2, sort_keys=True)
	#pp.pprint(alphabets)

	nameTable = {}
	for a in automatas:
		if a.name not in nameTable:
			nameTable[a.name] = []
		nameTable[a.name].append(a)

	for nm, alist in nameTable.items():
		for a in alist:
			if len(alist) == 1:
				nfaFileName = nm + ".txt"
			else:
				nfaFileName = nm + "-" + str(alist.index(a)) + ".txt"

			outOneNFAPath = os.path.join(outNFAsPath, nfaFileName)
			atxt = a.toTxt()
			with open(outOneNFAPath, 'w') as f:
				f.write(atxt)
			#print(atxt)

# if fm1 is superset of or equals fm2, return true; if fm1 is subset of fm2, return false
# if there are some differences bewteen two fm, raise Exception
def isfm1Includefm2(fm1, fm2):
	meetUnknown = False
	meetDifference = False
		
	if fm1['name'] != fm2['name'] or fm1['isStatic'] != fm2['isStatic']:
		meetDifference = True

	for tag, info2 in fm2['ins'].items():
		if tag not in fm1:
			meetUnknown = True
		else:
			info1 = fm1['ins']
			if info1['tag'] != info2['tag'] or info1['type'] != info2['type']:
				meetDifference = True

	for tag, info2 in fm2['outs'].items():
		if tag not in fm1:
			meetUnknown = True
		else:
			info1 = fm1['outs']
			if info1['tag'] != info2['tag'] or info1['type'] != info2['type']:
				meetDifference = True
	
	# for loopvar mock api funcs
	if '_LOOPVAR_' in fm1['name']:
		# TODO: not check argTable & expr, add this if needed
		if ('code' in fm1) != ('code' in fm2):
			meetDifference = True
		elif 'code' in fm1:
			if fm1['code'] != fm1['code']:
				meetDifference = True

	return meetUnknown, meetDifference

def mergeLibMetas(lib_metas):
	funcMeta = {}
	dataDeps = set([])

	# merge existing lib_metas
	fm2file = {}
	for file, lib_meta in lib_metas.items():
		for sig, fm in lib_meta['funcMeta'].items():
			if sig not in funcMeta:
				funcMeta[sig] = fm
				now_fm = json.dumps(funcMeta[sig], indent=2, sort_keys=True)
				fm2file[now_fm] = file
			else:
				existing_fm = json.dumps(funcMeta[sig], indent=2, sort_keys=True)
				new_fm = json.dumps(fm, indent=2, sort_keys=True)

				meetUnknown, meetDifference = isfm1Includefm2(funcMeta[sig], fm)
				if meetDifference:
					raise Exception("funcMeta for %s mismatches between extracted example programs\nOne(%s):\n%s\nAnother(%s):\n%s\n" % (sig, fm2file[existing_fm], existing_fm, file, new_fm))
				if meetUnknown:
					funcMeta[sig] = fm

		dataDeps.update([ tuple(datadep) for datadep in lib_meta['dataDeps'] ])
	
	# infer datadeps
	inferList = set([])
	funcOuts = {}
	existingDDs = set([ dd[:4] for dd in dataDeps ])
	for sig, fm in funcMeta.items():
		for tag, info in fm["outs"].items():
			if tag == 'ret' and '_ITERATOR_next' in sig:
				# skip the datadep of iterator.next, we collect it in the following
				continue
			if tag == 'ret' and '_ITERABLE_next' in sig:
				# skip the datadep of iterator.next, we collect it in the following
				continue
			if tag == 'ret' and '_LOOPVAR_' in sig:
				# skip the datadep of loop variables, they are excluded from inferring
				continue

			ty = info['type']
			if ty not in funcOuts:
				funcOuts[ty] = set([])
			funcOuts[ty].add((sig, tag))
	# iterator.next's type is collected based on existing data deps
	for datadep in existingDDs:
		frmSig, frmTag, toSig, toTag = datadep
		if frmTag == 'ret' and ( ('_ITERATOR_next' in frmSig) or ('_ITERABLE_next' in frmSig) ):
			ty = funcMeta[toSig]['ins'][toTag]['type']
			if ty not in funcOuts:
				funcOuts[ty] = set([])
			funcOuts[ty].add((frmSig, frmTag))

	#print('funcOuts is %s' % (funcOuts))

	for sig, fm in funcMeta.items():
		for tag, info in fm["ins"].items():
			# TODO: currently we only infer data deps of cls
			# this tries to infer data deps based on the toFunc.cls
			if (not fm['isStatic']) and (tag == 'cls'):
				ty = info['type']
				#print('ty is %s' % (ty))
				if ty in funcOuts:
					#print('ty %s in funcOuts' % (ty))
					for frmSig, frmTag in funcOuts[ty]:
						#print('%s %s %s %s' % (frmSig, frmTag, sig, tag))
						if (frmSig, frmTag, sig, tag) not in existingDDs:
							inferList.add( (frmSig, frmTag, sig, tag, "inferred in mergeLibMetas of libautomata.py") )


	#print('inferList is %s' % (inferList))
	dataDeps.update(inferList)

	return { "funcMeta" : funcMeta, "dataDeps" : list(dataDeps) }

def inBlacklist(path):
	#blacklist = ['doInBackground.0P.894833735']
	blacklist = []
	inBB = False
	for x in blacklist:
		if x in path:
			inBB = True
	return inBB

def searchingInputs(in_paths):
	lib_metas = set([])
	nfa_jsons = set([])
	a2dg_jsons = set([])


	for in_path in in_paths:
		for lib_meta in glob.iglob(os.path.join(in_path, "**", 'lib-meta', 'meta.json'), recursive=True):
			#print('found lib_meta: %s' % (lib_meta) )
			if not inBlacklist(str(lib_meta)):
				lib_metas.add(lib_meta)
			else:
				print('skip %s as it is in blacklist' % (lib_meta))

	for in_path in in_paths:
		for nfa_json in glob.iglob(os.path.join(in_path, "**", 'json-automata', '*.json'), recursive=True):
			#print('found nfa_json: %s' % (nfa_json) )
			if not inBlacklist(str(nfa_json)):
				nfa_jsons.add(nfa_json)
			else:
				print('skip %s as it is in blacklist' % (nfa_json))

	for in_path in in_paths:
		for a2dg_json in glob.iglob(os.path.join(in_path, "**", 'a2dg', '*.json'), recursive=True):
			#print('found a2dg_json: %s' % (a2dg_json) )
			if not inBlacklist(str(a2dg_json)):
				a2dg_jsons.add(a2dg_json)
			else:
				print('skip %s as it is in blacklist' % (a2dg_json))

	return (lib_metas, nfa_jsons, a2dg_jsons)

def usage():
	print ('''
python3 libautomata.py out_dir in_path [in_path, ...]
''')
	exit(1)

def main():
	global pp

	if len(sys.argv) <= 2:
		usage()

	out_dir = sys.argv[1]
	in_paths = sys.argv[2:]

	if os.path.exists(out_dir):
		print("out_dir %s already exists, delete or move it before running" % (out_dir))
		exit(1)

	# searching matched extracted cfgs
	lib_metas, nfa_jsons, a2dg_jsons = searchingInputs(in_paths)

	if len(nfa_jsons) == 0 or len(lib_metas) == 0 or len(a2dg_jsons) == 0:
		print('%s automata json files & %s lib meta files & %s a2dg json files have been found in the given paths: %s' % (len(nfa_jsons), len(lib_metas), len(a2dg_jsons), in_paths))
		exit(1)

	# 1. merge the lib_metas
	merged_libmetas = mergeLibMetas(loadJsonfiles(lib_metas))

	# 2.1 parse nfas
	rawAutomatas = [ Automata(nfa) for _, nfa in loadJsonfiles(nfa_jsons).items() ]
	# parse a2dg jsons, to get full function call events later
	a2dgAutomatas = [ Automata(a.toNFA(None)) for a in a2dg.parseA2DGs(a2dg_jsons) ]

	# 2.2 merge and unify the alphabets, and translates the automatas
	def2varInfo, newAlias2NewEvents, alignedAutomatas = unifyEvents(rawAutomatas, a2dgAutomatas)

	alphabets = {}
	alphabets['def2var'] = {}
	alphabets['alias2event'] = {}
	for d, varinfo in def2varInfo.items():
		varName, _ = varinfo
		alphabets['def2var'][d] = varName
	for letter, event in newAlias2NewEvents.items():
		alphabets['alias2event'][letter] = event.signature()
	
	# 2.3 remove the epsilon inside alphabets & automatas

	# peAutomatasTxt = ''.join([ a.toTxt() for a in alignedAutomatas ])
	# print(peAutomatasTxt)

	finalAlphabets, finalAutomatas = eliminateEpsilon(alphabets, alignedAutomatas)

	# peAutomatasTxt = ''.join([ a.toTxt() for a in finalAutomatas ])
	# print(peAutomatasTxt)

	# 2.5 dump the alphabets & automatas
	dumpOutputs(out_dir, merged_libmetas, finalAlphabets, finalAutomatas)

if __name__ == '__main__':
	with launch_ipdb_on_exception():
		main()
