package cmdline;

import com.beust.jcommander.Parameter;
import org.apache.logging.log4j.Level;

public class CommandMain {
	
	@Parameter(names={"-h", "--help"}, description="Help/Usage", help=true)
   	private boolean help;

	@Parameter(names={"-0", "--not-verbose"}, description="Only output log whose level is WARN and above")
   	private boolean v = true;

	@Parameter(names={"-vv", "--more-verbose"}, description="Output log which level is DEBUG and above")
   	private boolean vv = false;

	@Parameter(names={"-vvv", "--super-verbose"}, description="Output all log")
   	private boolean vvv = false;

	public boolean isHelp() {
		return help;
	}

	public String getLogLevel() {
		if (vvv)
			return "vvv";
		else if (vv)
			return "vv";
		else if (v)
			return "v";
		else
			return "-";
	}
}
