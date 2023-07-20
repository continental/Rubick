import os
import sys
import copy
import glob
import json
import collections

if __name__ == '__main__':
	import libautomata

from graphviz import Digraph

from ipdb import launch_ipdb_on_exception

class ImmutableDict(collections.Mapping):
	def __init__(self, somedict):
		self._dict = dict(somedict)   # make a copy
		self._hash = None

	def __getitem__(self, key):
		return self._dict[key]
	
	def __len__(self):
		return len(self._dict)

	def __iter__(self):
		return iter(self._dict)

	def __hash__(self):
		if self._hash is None:
			self._hash = hash(frozenset(self._dict.items()))
		return self._hash

	def __eq__(self, other):
		return self._dict == other._dict

	def toDict(self):
		return { k:v for k, v in self.items() }

class A2DG(object):
	def __init__(self, a2dgjson):
		self.nodeNum = 0
		self.name = None
		self.mergedFrom = set([])
		self.nodes = set([])
		self.edges = set([])
		self.info = {}
		self.sig2Ids = {}
		self.startNodeId = None
		self.endNodeIds = set([])
		self.succs = {}

		self.mergeWithJson(a2dgjson, None)

		for nodeId in self.nodes:
			if self.info[nodeId]['type'] == 'START':
				if self.startNodeId != None:
					raise Exception("multiple START nodes")
				self.startNodeId = nodeId
			if self.info[nodeId]['type'] == 'END':
				self.endNodeIds.add(nodeId)

	def mergeWithJson(self, a2dgjson, idMap):
		if 'mergedFrom' in a2dgjson:
			self.mergedFrom.update(a2dgjson['mergedFrom'])
			num = len(self.mergedFrom)
			if num > 1:
				hashv = str(hash(' & '.join(list(self.mergedFrom))) % 10**8)
				self.name = 'A2DG_M%d_%s' % (len(self.mergedFrom), hashv)
			else:
				self.name = list(self.mergedFrom)[0]
		else:
			self.mergedFrom.add(a2dgjson['name'])
			self.name = a2dgjson['name']

		# from node id in json to node id in this class 
		if idMap == None:
			idMap = {}

		for jsonId in a2dgjson['nodes']:
			if jsonId not in idMap:
				clsId = self.addNode()
				idMap[jsonId] = clsId

		for info in a2dgjson['edges']:
			frmJsonId, toJsonId = info['from'], info['to']
			frmClsId = idMap[frmJsonId]
			toClsId = idMap[toJsonId]
			self.addEdge(frmClsId, toClsId)
		
		for nodeJsonId, nodeInfo in a2dgjson['info'].items():
			nodeClsId = idMap[nodeJsonId]
			if nodeClsId not in self.info:
				self.info[nodeClsId] = copy.deepcopy(nodeInfo)
				if nodeInfo['type'] == 'API':
					sig = nodeInfo['sig']
					if sig not in self.sig2Ids:
						self.sig2Ids[sig] = set([])
					self.sig2Ids[sig].add(nodeClsId)
	
	def toJson(self):
		obj = {}
		obj['name'] = self.name
		obj['nodes'] = copy.deepcopy(self.nodes)
		obj['edges'] = [ {'from': frm, 'to': to} for frm, to in self.edges ]
		obj['info'] = copy.deepcopy(self.info)
		obj['mergedFrom'] = copy.deepcopy(self.mergedFrom)
		return obj

	def addNode(self):
		nodeId = str(self.nodeNum)
		self.nodeNum += 1
		self.nodes.add(nodeId)
		self.succs[nodeId] = set([])
		return nodeId

	def addEdge(self, frm, to):
		self.edges.add((frm, to))
		self.succs[frm].add(to)

	def delEdge(self, edge):
		frm, to = edge
		self.edges.remove(edge)
		self.succs[frm].remove(to)

	def getSuccs(self, node):
		return self.succs[node]

	def getNodesFromSig(self, sig):
		return self.sig2Ids[sig]

	def isEmptyOrOnlyOneFunc(self):
		num = 0
		for nodeId in self.nodes:
			ty = self.info[nodeId]['type']
			if ty == 'API':
				num += 1
		return num <= 1

	def hasCommonCode(self, a2dg):
		asigs = set(self.sig2Ids.keys())
		bsigs = set(a2dg.sig2Ids.keys())

		commons = asigs.intersection(bsigs)
		hasCommon = (len(commons) != 0)
		return hasCommon

	def coalesce(self, a2dg):
		asigs = set(self.sig2Ids.keys())
		bsigs = set(a2dg.sig2Ids.keys())

		commons = asigs.intersection(bsigs)
		# just pick the first common code we met as fuzzgen did in their code
		mergeNodeSig = list(commons)[0]
		mergeNodeIdInSelf = list(self.getNodesFromSig(mergeNodeSig))[0]
		mergeNodeIdInA2DG = list(a2dg.getNodesFromSig(mergeNodeSig))[0]

		#print('  picked %s as coalesce point' % (self.info[mergeNodeIdInSelf]['sig']))

		a2dgjson = a2dg.toJson()
		idMap = {}
		idMap[mergeNodeIdInA2DG] = mergeNodeIdInSelf
		idMap[a2dg.startNodeId] = self.startNodeId
		self.mergeWithJson(a2dgjson, idMap)
	
	def DFS(self, now, visited, backEdges):
		#print('visiting %d' % (now))

		for succ in self.getSuccs(now):
			visited.add(now)

			if succ in visited:
				backEdges.add( (now, succ) )

			# prune the dfs exploration by stopping explore the backEdges
			if (now, succ) not in backEdges:
				self.DFS(succ, visited, backEdges)

			visited.remove(now)
		
		return

	def flatten(self):
		'''
		remove one edge inside the loop to flatten a2dg

		N.B. we don't need to do topsort as fuzzGen, since we can convert the a2dg to nfa and feed it into automata harness later to get the same effects on grouped fuzzing
		there has and only has one pair of start/end node for one a2dg graph
		start node marks the initial states
		'''

		# 1. do DFS to find backward edges as fuzzGen did
		backEdges = set([])
		self.DFS(self.startNodeId, set([]), backEdges)

		# 2. do remove backward edges
		for edge in backEdges:
			frm, to = edge
			self.delEdge(edge)
			# if it is the only edge, add an edge to exit node
			if len(self.getSuccs(frm)) == 0:
				for endNodeId in self.endNodeIds:
					self.addEdge(frm, endNodeId)
					break
	
	def toDot(self, filename):
		dot = Digraph(comment=self.name, format='png')
		for nodeId in self.nodes:
			info = self.info[nodeId]
			if info['type'] == 'API':
				# avoid the label be interpreted as HTML element
				label = info['sig'].replace('<', '\\<').replace('>', '\\>')
				dot.node(str(nodeId), label=label)
				#dot.node(str(nodeId), label=info['sig'])
			elif info['type'] == 'START':
				dot.node(str(nodeId), label='START')
			elif info['type'] == 'END':
				dot.node(str(nodeId), label='END')
			else:
				raise Exception('impossible: unknown node type %s' % (info['type']))

		for edge in self.edges:
			frmId, toId = edge
			dot.edge(str(frmId), str(toId))
		
		dot.save(filename)

	def toNFA(self, nfafile):
		initials = set([])
		states = set([])
		alphabet = set([])
		trans = {}

		q = set([])
		q.add( (None, None, self.startNodeId) )
		while len(q) > 0:
			prevS, event, curS = q.pop()
			if curS in states:
				if prevS == None:
					raise Exception('impossible')
				else:
					states.add(prevS)
					states.add(curS)
					alphabet.add(event)
					if prevS not in trans:
						trans[prevS] = {}
					trans[prevS][curS] = event.toDict()
					continue
			
			succSs = self.getSuccs(curS)

			ty = self.info[curS]['type']
			if ty == 'API':
				states.add(prevS)
				states.add(curS)
				alphabet.add(event)
				if prevS not in trans:
					trans[prevS] = {}
				trans[prevS][curS] = event.toDict()
				
				funcSig = self.info[curS]['sig']
				nextEvent = ImmutableDict({ 'type' : 'call', 'func' : funcSig })
				for succS in succSs:
					q.add( (curS, nextEvent, succS) )

			elif ty == 'START':
				states.add(curS)
				initials.add(curS)

				nextEvent = ImmutableDict({ 'type' : 'epsilon', 'idx' : -1 })
				for succS in succSs:
					q.add( (curS, nextEvent, succS) )

			elif ty == 'END':
				states.add(prevS)
				states.add(curS)
				alphabet.add(event)
				if prevS not in trans:
					trans[prevS] = {}
				trans[prevS][curS] = event.toDict()

				if len(succSs) > 0:
					raise Exception('impossible that there is node after exit node')

			else:
				raise Exception('impossible')
			
		nfa = {}
		nfa['name'] = self.name
		nfa['initial'] = list(initials)
		nfa['states'] = list(states)
		nfa['alphabets'] = [ a.toDict() for a in alphabet ]
		nfa['map'] = trans

		if nfafile != None:
			with open(nfafile, 'w') as f:
				json.dump(nfa, f, indent=2, sort_keys=True)
		return nfa

	def show(self):
		print("this a2dg (%s) has %s nodes, %s edges, %s end nodes" % (self.name, len(self.nodes), len(self.edges), len(self.endNodeIds)))

def parseA2DGs(a2dgjsons):
	# TODO: solve naming problem
	a2dgs = []
	for j in a2dgjsons:
		with open(j, 'r') as f:
			obj = json.load(f)
			a2dg = A2DG(obj)
			if a2dg.isEmptyOrOnlyOneFunc():
				# remove the a2dg that have 0 or 1 func call as stated in fuzzgen paper
				print('remove a2dg (%s) due to its few api func calls (<=1)' % (a2dg.name))
			else:
				a2dgs.append(A2DG(obj))
	
	return a2dgs

def coalescingA2DGs(a2dgs):
	coalesced = True
	while coalesced:
		coalesced = False
		num = len(a2dgs)
		for i in range(num):
			for j in range(i + 1, num):
				a2dgA = a2dgs[i]
				a2dgB = a2dgs[j]
				if not a2dgA.hasCommonCode(a2dgB):
					continue
				
				print('Coalescing %s with %s' % (a2dgA.name, a2dgB.name))

				a2dgA.coalesce(a2dgB)
				a2dgs.remove(a2dgB)

				# a2dgs has been changed
				coalesced = True
				break
			
			# a2dgs has been changed
			if coalesced:
				break

	print('Coalescing completed with %d A2DG(s) left' % (len(a2dgs)))
	return a2dgs

def dumpA2DGAutomatas(outA2DGsPath, A2DGs):
	nameTable = {}
	for a in A2DGs:
		if a.name not in nameTable:
			nameTable[a.name] = []
		nameTable[a.name].append(a)

	for nm, alist in nameTable.items():
		for a in alist:
			if len(alist) == 1:
				A2DGFileName = nm + ".txt"
			else:
				A2DGFileName = nm + "-" + str(alist.index(a)) + ".txt"

			outOneA2DGPath = os.path.join(outA2DGsPath, A2DGFileName)
			atxt = a.toTxt()
			with open(outOneA2DGPath, 'w') as f:
				f.write(atxt)
			#print(atxt)


def mergeA2DGsToJson(outA2DGsPath, a2dgjsons):
	a2dgs = parseA2DGs(a2dgjsons)

	for g in a2dgs:
		g.toDot(os.path.join(outA2DGsPath, g.name + '.dot'))

	mergedA2DGs = coalescingA2DGs(a2dgs)

	mergedA2DGJsons = []
	for g in mergedA2DGs:
		g.show()
		print('Flattening A2DG %s' % (g.name))
		g.flatten()
		g.show()
		g.toDot(os.path.join(outA2DGsPath, g.name + '.dot'))
		mergedA2DGJsons.append( g.toNFA(None) )
	return mergedA2DGJsons

def usage():
	print('''
python3 a2dg.py work_dir a2dg_dir [a2dg_dir ...]
''')
	exit(1)

def searchingInputs(in_paths):
	a2dg_jsons = set([])

	for in_path in in_paths:
		for a2dg_json in glob.iglob(os.path.join(in_path, "**", 'a2dg', '*.json'), recursive=True):
			#print('found a2dg_json: %s' % (a2dg_json) )
			if not libautomata.inBlacklist(str(a2dg_json)):
				a2dg_jsons.add(a2dg_json)
			else:
				print('skip %s as it is in blacklist' % (a2dg_json))

	return a2dg_jsons

def main():
	if len(sys.argv) < 3:
		usage()
	
	work_dir = sys.argv[1]
	a2dg_dirs = sys.argv[2:]

	a2dgjsons = searchingInputs(a2dg_dirs)
	if len(a2dgjsons) == 0:
		print('no a2dg json has been found in all give directories')
		exit(1)

	alphabetFile = os.path.join(work_dir, 'alphabet.json')
	if not os.path.exists(alphabetFile):
		raise Exception('cannot find alphabet.json in work_dir %s' % (work_dir))

	alphabet = None
	with open(alphabetFile, 'r') as f:
		alphabet = json.load(f)

	outA2DGsPath = os.path.join(work_dir, 'a2dg')
	os.makedirs(outA2DGsPath, exist_ok=True)

	a2dgs = [ libautomata.Automata(nfa) for nfa in mergeA2DGsToJson(outA2DGsPath, a2dgjsons) ]
	a2dgAutomatas = libautomata.genFuzzGenA2DGAutomatas(alphabet, a2dgs)
	dumpA2DGAutomatas(outA2DGsPath, a2dgAutomatas)

	#for g in a2dgs:
	#	print("handling %s" % (g.name))
	#	g.toDot(os.path.join(work_dir, g.name + '.dot'))
	#	g.flatten()
	#	g.toDot(os.path.join(work_dir, g.name + 'flatten.dot'))
	#	#g.toNFA(os.path.join(work_dir, g.name + '.json'))

	#mergedA2DGs = coalescingA2DGs(a2dgs)

	#for g in mergedA2DGs:
	#	g.show()
	#	g.toDot(os.path.join(work_dir, g.name + '.dot'))

	#	g.flatten()
	#	g.show()
	#	g.toDot(os.path.join(work_dir, g.name + 'flatten.dot'))
	#	g.toNFA(os.path.join(work_dir, g.name + '.json'))

if __name__ == '__main__':
	with launch_ipdb_on_exception():
		main()
