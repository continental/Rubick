import os
import sys
import json

from graphviz import Digraph

from ipdb import launch_ipdb_on_exception

class NFA:
	def __init__(self, nfafile):
		self.name = None
		self.initials = None
		self.finals = None
		self.states = None
		self.trans = None

		with open(nfafile, 'r') as f:
			cnt = f.read(-1)
			chunks = [ c.strip() for c in cnt.strip().split('$$$') if c.strip() != '' ]
			if len(chunks) != 1:
				raise Exception('wrong nfa file, contains %s nfa chunks' % (len(chunks)))
			lines = chunks[0].split('\n')
			if not lines[0].startswith('# name'):
				raise Exception('wrong nfa file')
			elif not lines[2].startswith('# initial'):
				raise Exception('wrong nfa file')
			elif not lines[4].startswith('# finals'):
				raise Exception('wrong nfa file')
			elif not lines[6].startswith('# map'):
				raise Exception('wrong nfa file')

			# TODO: add logic for checking more kinds of empty nfa

			self.name = lines[1].strip()
			if lines[3].strip() != '':
				self.initials = set([ str(int(s)) for s in lines[3].strip().split(',') ])
			else:
				self.initials = set([])

			if lines[5].strip() != '':
				self.finals = set([ str(int(s)) for s in lines[5].strip().split(',') ])
			else:
				self.finals = set([])
			self.states = set([])
			self.states.update(self.initials)
			self.states.update(self.finals)

			self.trans = {}
			for line in lines[7:]:
				if line.strip() != '':
					parts = line.strip().split(',')
					if len(parts) != 3:
						raise Exception('wrong nfa file')
					frmS, event, toS = str(int(parts[0].strip())), parts[1].strip(), str(int(parts[2].strip()))
					if len(event) != 1:
						raise Exception('wrong nfa file')
				
					if frmS not in self.trans:
						self.trans[frmS] = {}
					if toS not in self.trans[frmS]:
						self.trans[frmS][toS] = set([])
					self.trans[frmS][toS].add(event)
				
		if len(self.trans) == 0:
			self.is_empty = True
		else:
			self.is_empty = False

	def isCondEvent(self, alphabet, e):
		info = alphabet['alias2event'][e]
		return info[0] == 'Z'

	def getEventFromSig(self, alphabet, funcSig):
		for e, info in alphabet['alias2event'].items():
			if info[0] == 'F':
				if info[1] == funcSig:
					return e
		raise Exception('unknown funcSig %s in alphabet' % (funcSig))

	# this is ran before tinkering
	def replaceFuncEvent(self, alphabet, replaces):
		# TODO: the func event related cond events may also need to be handled, fix this when we met
		for replacorSig, replaceeSig in replaces.items():
			replacorE = self.getEventFromSig(alphabet, replacorSig)
			replaceeE = self.getEventFromSig(alphabet, replaceeSig)
			#print("replacorE %s" % (replacorE))
			#print("replaceeE %s" % (replaceeE))

			for frmS, info in self.trans.items():
				for toS, events in self.trans[frmS].items():
					for event in events:
						#print("event: %s, replacorE: %s, same %s" % (event, replacorE, event == replacorE))
						if event == replacorE:
							print('%s: replace %s(%s) as %s(%s)' % (self.name, replacorSig, replacorE, replaceeSig, replaceeE))
							self.trans[frmS][toS] = replaceeE

	def DFS(self, now, visited, prefix, hasCond, deadLoopEdges, alphabet):
		#print('visiting %d' % (now))
		for next, events in self.trans.get(now, {}).items():
			visited.add(now)

			for e in events:
				hasCond = hasCond or (self.isCondEvent(alphabet, e))
				if next in visited:
					# meet loop, stop exploring, add it to deadLoops if no cond at all
					if not hasCond:
						# identify loop which contains no condition as dead loops
						deadLoopEdges.add( (now, next, e) )
					
					continue

				if (now, next, e) not in deadLoopEdges:
					# we don't explore the identified deadLoopEdges
					self.DFS(next, visited, prefix + e, hasCond, deadLoopEdges, alphabet)

			visited.remove(now)

	def removeDeadloops(self, alphabet):
		deadLoopEdges = set([])

		# remove all kinds of self to self edges
		for frmS, info in self.trans.items():
			for toS, events in info.items():
				if frmS == toS:
					for e in events:
						deadLoopEdges.add( (frmS, toS, e) )

		for initial in self.initials:
			self.DFS(initial, set([]), "", False, deadLoopEdges, alphabet)
		
		for frmS, toS, event in deadLoopEdges:
			print('remove dead loop edges %s,%s,%s' % (frmS, event, toS))
			self.trans[frmS][toS].remove(event)
		
		if len(deadLoopEdges) != 0:
			return True
		else:
			return False

	def a2dgTopSort(self, alphabet, funcmeta):
		# calculate indegree
		inEdges = {}
		outEdges = {}
		for s in self.states:
			inEdges[s] = set([])
			outEdges[s] = set([])

		for frmS, info in self.trans.items():
			for toS, events in info.items():
				for event in events:
					inEdges[toS].add( (frmS, event) )
					outEdges[frmS].add( (toS, event) )

		eventGroups = []

		while True:
			if len(inEdges) == 0:
				break

			# find 0 indegree states
			zeroIn = set([])
			for s, ins in inEdges.items():
				if len(ins) == 0:
					zeroIn.add(s)

			for s in zeroIn:
				del inEdges[s]

			happened = set([])

			for s in zeroIn:
				for toS, event in list(outEdges[s]):
					# assume no loop here
					inEdges[toS].discard( (s, event) )
					happened.add(event)

			eventGroups.append( happened )
		
		count = 0
		for events in eventGroups:
			count += 1
			#print("[%s]: %s" % (count, ', '.join([ alphabet['alias2event'][e][1] for e in events ])))
			print('// group %s' % (count))
			for event in events:
				funcSig = alphabet['alias2event'][event][1]
				meta = funcmeta['funcMeta'][funcSig]
				funcName = meta['name']

				if 'cls' in meta['ins']:
					if 'ret' in meta['outs']:
						print ('%s = %s.%s(%s);' % (meta['outs']['ret']['type'], meta['ins']['cls']['type'], funcName, (',').join([ v['type'] for k, v in meta['ins'].items() if k.startswith('arg') ]) ) )
					else:
						print ('%s.%s(%s);' % (meta['ins']['cls']['type'], funcName, (',').join([ v['type'] for k, v in meta['ins'].items() if k.startswith('arg') ]) ) )
				else:
					if 'ret' in meta['outs']:
						print ('%s = %s(%s);' % (meta['outs']['ret']['type'], funcName, (',').join([ v['type'] for k, v in meta['ins'].items() if k.startswith('arg') ]) ) )
					else:
						print ('%s(%s);' % (funcName, (',').join([ v['type'] for k, v in meta['ins'].items() if k.startswith('arg') ]) ) )

	## this is ran before tinkering
	#def removeUselessCondsBeforeTinkering(self, alphabet):
	#	# 1. recognize useless cond letters
	#	#   same state transitions from all conds
	#	uselessConds = set([])
	#	for frmS, info in self.trans.items():
	#		for toS, events in self.trans[frmS].items():
	#			pairs = self.getCondPairs(events)
	#			for cond in pairs:
	#				uselessConds.add( (frmS, toS, cond) )

	#	# 2. remove useless cond letters
	#	self.removeEvents(uselessConds)
	
	# def removePlainFuncAfterTinkering(self, alphabet):
	# 	# 1. recognize (plain func) non ctrl flow critical func
	# 	# 2. remove them and mark them
	# 	pass

	# def addPlainFuncBackAfterMerging(self, alphabet):
	# 	# 1. add (plain func) back
	# 	pass

	def isGroup(self, alphabet, e1, e2):
		if self.isCondEvent(alphabet, e1) and self.isCondEvent(alphabet, e2):
			relatedDefs1 = set(alphabet['alias2event'][e1][2])
			relatedDefs2 = set(alphabet['alias2event'][e2][2])
			if relatedDefs1 == relatedDefs2:
				return True
			else:
				return False
		else:
			return False

	# this assumes the automata is a dfa
	def calcDFS(self, now, visited, alphabet, curColor, colorSet, singleChoices):
		#print('visiting %s' % (now))
		pathGroups = []
		checks = set([])
		for next, events in self.trans.get(now, {}).items():
			for e in events:
				if e in checks:
					raise Exception('this is not a dfa')
				checks.add(e)

				if not self.isCondEvent(alphabet, e):
					pathGroups.append( [(e, next)] )
				else:
					isGroup = False
					for grp in pathGroups:
						anotherE, _ = grp[0]
						if self.isGroup(alphabet, e, anotherE):
							isGroup = True
							grp.append( (e, next) )
							break
					
					if not isGroup:
						pathGroups.append( [(e, next)] )

		if len(pathGroups) == 0:
			# reaches the end
			if len(curColor) != 0:
				tmp = list(curColor)
				tmp.sort()
				acolor = tuple(tmp)
				colorSet.add(acolor)
				#print('%s add a color %s, len: %s' % (now, acolor, len(acolor)))
			return

		#print('%s pathGroups len %s, %s' % (now, len(pathGroups), pathGroups))

		taintColor = False
		if len(pathGroups) > 1:
			taintColor = True
		else:
			# collect the single choice
			grp = pathGroups[0]
			tmp = [ (e, s) for e, s in grp ]
			tmp.sort()
			acolorunit = tuple([ now ] + tmp)
			singleChoices.add(acolorunit)

		for grp in pathGroups:
			visited.add(now)

			if taintColor:
				tmp = [ (e, s) for e, s in grp ]
				tmp.sort()
				color = tuple([ now ] + tmp)

				curColor.add(color)

			grpColorSets = []

			for event, next in grp:
				if next not in visited:
					subColorSet = set([])
					self.calcDFS(next, visited, alphabet, curColor, subColorSet, singleChoices)
					if len(subColorSet) != 0:
						#print('test: from %s to %s' % (subColorSet, list(subColorSet)) )
						#if list(subColorSet)[0] == tuple():
						#	raise Exception('check here')
						grpColorSets.append(list(subColorSet))
				else:
					if len(curColor) != 0:
						tmp = list(curColor)
						tmp.sort()
						acolor = tuple(tmp)
						colorSet.add(acolor)

						#print('%s add a color %s, len: %s' % (now, acolor, len(acolor)))

			if len(grpColorSets) == 1:
				#print('update single: %s ' % (grpColorSets[0]))
				colorSet.update(grpColorSets[0])
			elif len(grpColorSets) > 1:
				# crossover 
				crossovers = set([])

				allNum = 1
				for s in grpColorSets:
					allNum = allNum * len(s)

				#print('before crossover merge, allNum %s, grpColorSets %s' % (allNum, grpColorSets))

				for i in range(allNum):
					oneCrossover = set([])
					for subColorSet in grpColorSets:
						idx = i % len(subColorSet)
						if idx < 0:
							raise Exception('python mod get negative value here')
						i = int( (i - idx) / len(subColorSet) )

						pick = subColorSet[idx]
						oneCrossover.add(pick)
					
					result = self.mergeCrossover(oneCrossover) 
					if result != None:
						#print('result %s' % (str(result)))
						crossovers.add(result)
				
				#print('after crossover merge, crossovers %s' % (crossovers))

				colorSet.update(crossovers)

			if taintColor:
				curColor.remove(color)

			visited.remove(now)

	def mergeCrossover(self, crossover):
		colorUnits = set([])
		for parts in crossover:
			colorUnits.update(set(parts))
		colorUnits = list(colorUnits)
		colorUnits.sort()
		for i in range(len(colorUnits) - 1):
			unitA = colorUnits[i]
			unitB = colorUnits[i + 1]
			if (unitA[0] == unitB[0]) and (unitA[1] != unitB[1]):
				return None
			
		return tuple(colorUnits)

	def collectSingleColorsDFS(self, now, visited, cfChoices):
		if now in visited:
			return
		
		visited.add(now)

		for pair in cfChoices.get(now, []):
			event, next = pair
			if event not in self.trans[now][next]:
				raise Exception('there must have sth wrong')
			self.collectSingleColorsDFS(next, visited, cfChoices)

	#def calcDFS(self, now, visited, alphabet, choiceList):
	#	if now in visited:
	#		return

	#	visited.add(now)

	#	pathGroups = []
	#	checks = set([])
	#	for next, events in self.trans.get(now, {}).items():
	#		for e in events:
	#			if e in checks:
	#				raise Exception('this is not a dfa')
	#			checks.add(e)

	#			if not self.isCondEvent(alphabet, e):
	#				pathGroups.append( [(e, next)] )
	#			else:
	#				isGroup = False
	#				for grp in pathGroups:
	#					anotherE, _ = grp[0]
	#					if self.isGroup(alphabet, e, anotherE):
	#						isGroup = True
	#						grp.append( (e, next) )
	#						break
	#				
	#				if not isGroup:
	#					pathGroups.append( [(e, next)] )

	#	if len(pathGroups) > 1:
	#		print('state %d add %d to choiceList' % (now, len(pathGroups)))
	#		choiceList.append(len(pathGroups))

	#	for next, _ in self.trans.get(now, {}).items():
	#		self.calcDFS(next, visited, alphabet, choiceList)

	def calculateCFChoiceNum(self, alphabet):
		choices = {}
		allNum = 0
		for initial in self.initials:
			colorSet = set([])
			singleChoices = set([])
			self.calcDFS(initial, set([]), alphabet, set([]), colorSet, singleChoices)
			# remove duplicate colors which are prefix of other colors
			if len(colorSet) != 0:
				colorList = list(colorSet)
				# the shorter one is at the front
				colorList.sort()
				removed = set([])
				for i in range(0, len(colorList) - 1):
					colorA = colorList[i]
					colorB = colorList[i + 1]
					#print('A %s, B %s, A == B[xxx] %s' % (colorA, colorB, colorA == colorB[:len(colorA)]))
					if colorA == colorB[:len(colorA)]:
						removed.add(colorA)
				colorSet = colorSet - removed

			#for color in colorSet:
			#	print(color)
			#print('inital %s colorSet num is %d : %s' % (initial, num, colorSet))
			#print('inital %s colorSet num is %d' % (initial, num))

			colorList = []
			# complete all tran picks
			if len(colorSet) == 0:
				aColorL = list(singleChoices)
				aColorL.sort()
				colorList.append(tuple(aColorL))
			else:
				for color in colorSet:
					aColorS = set(color)
					aColorS.update(singleChoices)
					aColorL = list(aColorS)
					aColorL.sort()
					colorList.append(tuple(aColorL))
			
			# refine colorList (remove unreachable single choices)
			newColorList = []
			for aColor in colorList:
				cfChoices = {}
				for unit in aColor:
					frmS = unit[0]
					cfChoices[frmS] = unit[1:]
				reachable = set([])
				self.collectSingleColorsDFS(initial, reachable, cfChoices)
				finalColor = []
				for frmS in reachable:
					if frmS in cfChoices:
						# not end state
						units = cfChoices[frmS]
						finalColor.append(tuple((frmS, )) + units)
				finalColor.sort()
				newColorList.append(finalColor)

			choices[initial] = newColorList
			num = len(newColorList)
			allNum += num

			print('inital %s colorList num is %d' % (initial, num))
			#for color in colorList:
			#	print(color)
		
		return allNum, choices

	def dump(self, filename):
		with open(filename, 'w') as f:
			txt = '# name\n'
			txt += '%s\n' % (self.name)
			txt += '# initial\n'
			txt += '%s\n' % (','.join( [ str(i) for i in self.initials ]) )
			txt += '# finals\n'
			# naively set all states as finals, we can filter empty string later while traversing
			finals = [ str(s) for s in self.finals ]
			txt = txt + ','.join(finals) + '\n'
			txt += '# map\n'
			for frm, info in self.trans.items():
				for to, aliases in info.items():
					for alias in aliases:
						txt += '%s,%s,%s\n' % (frm, alias, to)
			txt += '$$$\n'
			f.write(txt)

	def toDot(self, alphabet, filename):
		dot = Digraph(comment=self.name, format='png')
		for sId in self.states:
			dot.node(str(sId), label=str(sId))

		for frmSId, info in self.trans.items():
			for toSId, events in self.trans[frmSId].items():
				for event in events:
					label = None
					cnt = alphabet['alias2event'][event]

					label = cnt[1]
					if cnt[0] == 'F':
						if (label + ".RET") in alphabet['def2var']:
							label = alphabet['def2var'][label + ".RET"] + "(ret)" + " <- " + label
						if (label + ".ITR") in alphabet['def2var']:
							label = alphabet['def2var'][label + ".ITR"] + "(itr), " + label
					label = label.replace('<', '\\<').replace('>', '\\>')

					dot.edge(str(frmSId), str(toSId), label=label)
		
		dot.save(filename)

def usage():
	print('''
python3 nfa.py REPLACE alphabet replacefile nfafile [nfafile...]
python3 nfa.py REMOVEDEADLOOP alphabet nfafile [nfafile...]
python3 nfa.py CALCCFNUM alphabet nfafile [nfafile...]
python3 nfa.py A2DGTOPSORT alphabet funcmetafile nfafile
''')
	exit(1)

def replaceFlow():
	if len(sys.argv) < 5:
		usage()

	alphabetfile = sys.argv[2]
	replacefile = sys.argv[3]
	nfafiles = sys.argv[4:]

	alphabet = None
	replaces = None

	with open(alphabetfile, 'r') as f:
		alphabet = json.load(f)

	with open(replacefile, 'r') as f:
		replaces = json.load(f)

	for nfafile in nfafiles:
		nfa = NFA(nfafile)
		nfa.toDot(alphabet, nfafile + '-before-replace.dot')
		nfa.replaceFuncEvent(alphabet, replaces)
		nfa.dump(nfafile)
		nfa.toDot(alphabet, nfafile + '-after-replace.dot')

def removeDeadLoopFlow():
	if len(sys.argv) < 4:
		usage()

	alphabetfile = sys.argv[2]
	nfafiles = sys.argv[3:]

	alphabet = None

	with open(alphabetfile, 'r') as f:
		alphabet = json.load(f)

	for nfafile in nfafiles:
		nfa = NFA(nfafile)
		nfa.toDot(alphabet, nfafile + '-before-ddl.dot')
		found = nfa.removeDeadloops(alphabet)
		nfa.dump(nfafile)
		if found:
			nfa.toDot(alphabet, nfafile + '-after-ddl.dot')

def calcCfChoiceNum():
	if len(sys.argv) < 4:
		usage()

	alphabetfile = sys.argv[2]
	nfafiles = sys.argv[3:]

	alphabet = None

	with open(alphabetfile, 'r') as f:
		alphabet = json.load(f)

	for nfafile in nfafiles:
		nfa = NFA(nfafile)
		num, choices = nfa.calculateCFChoiceNum(alphabet)
		print('%s cfChoiceNum is %d' % (nfafile, num))
		nfafilePath = os.path.dirname(nfafile)
		with open(os.path.join(nfafilePath, 'cfPicks.json'), 'w') as f:
			json.dump(choices, f)
			#json.dump(choices, f, indent=2, sort_keys=True)

def topSortA2DG():
	if len(sys.argv) != 5:
		usage()
	
	alphabetfile = sys.argv[2]
	metafile = sys.argv[3]
	nfafile = sys.argv[4]

	alphabet = None
	funcmeta = None

	with open(alphabetfile, 'r') as f:
		alphabet = json.load(f)

	with open(metafile, 'r') as f:
		funcmeta = json.load(f)

	nfa = NFA(nfafile)
	nfa.a2dgTopSort(alphabet, funcmeta)

def main():
	if len(sys.argv) < 3:
		usage()

	mode = sys.argv[1]

	if mode == 'REPLACE':
		replaceFlow()
	elif mode == 'REMOVEDEADLOOP':
		removeDeadLoopFlow()
	elif mode == 'CALCCFNUM':
		calcCfChoiceNum()
	elif mode == 'A2DGTOPSORT':
		topSortA2DG()
	else:
		usage()


if __name__ == '__main__':
	with launch_ipdb_on_exception():
		main()
