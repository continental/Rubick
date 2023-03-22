from aalpy.utils import load_automaton_from_file, save_automaton_to_file, visualize_automaton, generate_random_dfa
from aalpy.learning_algs import run_Lstar

from aalpy.base import Oracle, SUL

class iSul(SUL):
	'''
	for learning the usage automata
	'''
	def __init__(self):
		pass
	
	def pre(self):
		"""
		"""
		self.dfa.reset_to_initial()

	def post(self):
		pass

	def step(self, letter):
		"""
		Args:
		    letter: single input or None representing the empty string
		Returns:
		    output of the dfa.step method (whether the next state is accepted or not)
		"""
		pass

class iEqOracle(Oracle):
	'''
	'''
	def __init__(self):
		pass

	def find_cex(self, hypothesis):
		pass

def main():
	alphabet = loadAlphabet()

	# create a SUL instance for the automaton/system under learning
	sul = iSul(xxx)

	# define the equivalence oracle
	eqOracle = iEqOracle(xxx)

	# start learning
	learned_dfa = run_Lstar(alphabet, sul, eqOracle, automaton_type='dfa', cache_and_non_det_check=False)

	# save automaton to file and visualize it
	save_automaton_to_file(learned_dfa, path='Learned_Automaton', file_type='dot')

if __name__ == '__init__':
	main()
