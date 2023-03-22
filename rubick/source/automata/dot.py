import sys
import pydot
import json

from ipdb import launch_ipdb_on_exception

def usage():
	print('python3 dot.py alphabet_file dot_file')

def remove_trap_states(dot):
	# 1. detect trap states
	possible_states = set([])
	for state in dot.get_nodes():
		# print('%s => %s' % (state.get_name(), state.get_attributes()['shape']))
		if state.get_attributes()['shape'] == '\"circle\"':
			possible_states.add(state.get_name())

	# print(possible_states)

	for tran in dot.get_edges():
		src = tran.get_source()
		dst = tran.get_destination()
		if src in possible_states:
			if src != dst:
				possible_states.discard(src)
	
	trap_states = possible_states

	print(trap_states)

	# 2. remove trap states & the related transitions
	remove_trans = []
	for tran in dot.get_edges():
		src = tran.get_source()
		dst = tran.get_destination()
		if (src in trap_states) or (dst in trap_states):
			remove_trans.append((src, dst))
	
	for state in trap_states:
		dot.del_node(state)

	for src, dst in remove_trans:
		dot.del_edge(src, dst)
	
	return dot

def replace_alphabets(alphabet, dot):
	# 1. load alphabet to get mapping
	mappings = {}

	with open(alphabet, 'r') as f:
		info = json.load(f)
		for letter, _info in info['alias2event'].items():
			ty = _info[0]
			detail = _info[1]
			if ty == 'Z':
				for k, v in info['def2var'].items():
					detail = detail.replace(v, k)

			if letter == '\\':
				mappings['"\\' + letter +'"'] = '"' + detail + '"'
			elif letter == '\"':
				mappings['"\\' + letter + '"'] = '"' + detail + '"'
			else:
				mappings['"' + letter + '"'] = '"' + detail + '"'

	# 2. replace labels
	for edge in dot.get_edges():
		if edge.get_label() != None:
			edge.set_label( mappings[edge.get_label()] )
	
	return dot

def main():
	if len(sys.argv) != 3:
		usage()
		exit(1)

	alphabet = sys.argv[1]
	dotfile = sys.argv[2]

	dots = pydot.graph_from_dot_file(dotfile)
	dot = dots[0]

	dot = remove_trap_states(dot)
	# dot = replace_alphabets(alphabet, dot)

	with open('hahaha', 'w') as f:
		f.write(dot.to_string())

	# 3. uses alphabet information to present it

if __name__ == '__main__':
	with launch_ipdb_on_exception():
		main()
