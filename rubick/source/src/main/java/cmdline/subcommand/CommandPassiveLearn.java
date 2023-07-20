package cmdline.subcommand;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import java.util.ArrayList;
import java.util.List;
import ahg.learning.passive.RPNIDFALearning;


@Parameters(separators = "=", commandDescription = "Learn automata from given strings")
public class CommandPassiveLearn {

	@Parameter(names={"-p", "--positive"}, variableArity = true, description="File name of positive examples", required = true)
   	private List<String> positiveExamples = new ArrayList<String>();

	@Parameter(names={"-n", "--negative"}, variableArity = true, description="File name of negative examples", required = true)
   	private List<String> negativeExamples = new ArrayList<String>();

	@Parameter(names = { "-o", "--output-automata-dot" }, description = "dot file path of the learned automata, output to stdout if not specified", required = false)
	private String outAutomataDot = null;

	public void process() {
		RPNIDFALearning.main(positiveExamples, negativeExamples, outAutomataDot);
	}
}
