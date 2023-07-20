package cmdline.subcommand;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;

import java.util.Set;
import java.util.List;
import java.util.HashSet;
import java.util.HashMap;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

import com.moandjiezana.toml.Toml;

import net.automatalib.words.Alphabet;
import net.automatalib.automata.fsa.impl.compact.CompactNFA;

import ahg.harness.cfg.nfa.iNFA;
import ahg.execution.jshellrepl.iCov;
import ahg.harness.Generator;
// import ahg.harness.Example;
import ahg.harness.cfg.alphabet.iAlphabet;
import ahg.execution.jshellrepl.JShellExecutor;

@Parameters(separators = "=", commandDescription = "Convert the given fsm to harness and returns the dynamic test results")
public class CommandDynValidation {

	@Parameter(names={"-c", "--config"}, description="Configuration File", required = true)
   	private String _cfgToml;

	public class TomlCfg {

		public class NfaCfg {
			String path;
			String string;

			public NfaCfg(String []cfgs) {
				path = cfgs[0];
				string = cfgs[1];
			}

			public String getPath() {
				return path;
			}

			public boolean isPathSet() {
				return (path != null);
			}

			public String getString() {
				return string;
			}

			public boolean isStringSet() {
				return (string != null);
			}

			public void checkSetting() {
				boolean s1 = (path != null);
				boolean s2 = (string != null);

				// cannot set none or both
				if (s1 == s2) {
					throw new RuntimeException("cannot set path & string all as " + s1);
				}
			}

			public String toString() {
				return "{ path: \"" + path + "\", string:\"" + string + "\" }";
			}
		}

		public class HarnessCfg {
			//
			// parsed from toml
			//

			public String host;

			public String[] jars;

			// nfa file path or a string
			NfaCfg nfa;

			// alphabet file path
			String alphabet;

			//
			// initialized from parsed toml cfg
			//

			public CompactNFA<Character> _nfa;
			public iAlphabet _alphabet;
			public HashMap<Integer, String> _stateIDMap;

			public void initialize() {
				if ( (nfa == null) || (alphabet == null) ) 
					throw new RuntimeException("wrong configuration");
				
				// alphabet related
				_alphabet = iAlphabet.createFromFile(alphabet);

				// nfa related
				nfa.checkSetting();

				_stateIDMap = new HashMap<Integer, String>();
				if (nfa.isPathSet())
					_nfa = iNFA.loadOneNFAFromFile(_alphabet.getAlphabet(), nfa.getPath(), _stateIDMap);
				else
					_nfa = iNFA.createNFAOfAString(_alphabet.getAlphabet(), nfa.getString(), _stateIDMap);

			}

			public String showTomlCfg() {
				String out = "cfg:\n";

				out = out + "  jars: [ " + String.join(", ", jars) + " ]\n";
				out = out + "  alphabet: " + alphabet + "\n";
				out = out + "  nfa: " + nfa.toString() + "\n";

				return out;
			}
		}

	}

	public void process() {

		try (Reader reader = new FileReader(_cfgToml)) {

			TomlCfg.HarnessCfg cfg = new Toml().read(reader).to(TomlCfg.HarnessCfg.class);

			System.out.println(cfg.showTomlCfg());

			cfg.initialize();

			/* Generator.main("input/active/tar/meta.json", "input/active/tar/tar-alphabet.json", "input/active/tar/apiFuncs.json", "input/active/tar/.GeneratedHarness.java"); */
			JShellExecutor.main(cfg.jars, Files.readString(Paths.get("input/active/tar/.GeneratedHarness.java")));

			/* Example.main(0, 0, "./input/active/tar/tar-alphabet.json", "./input/active/tar/tar-penfas.txt", "./input/active/tar/apiFuncs.json", "./test-tar.tar"); */

			// HTTP.setup(cfg.host);

			// // TODO: change this to String argument later (we automatically generate this!)
			// Path path = Paths.get("./jshell-in.txt");
			// List<String> inputs = Files.readAllLines(path, StandardCharsets.UTF_8);
			// String code = String.join("", inputs);

			// JShellExecutor.main(cfg.jars, code);

			// String cov;
			// cov = HTTP.getCoverage();
			// System.out.println("cov is " + cov);
			// HTTP.resetCoverage();
			// cov = HTTP.getCoverage();
			// System.out.println("cov is " + cov);
			// HTTP.shutdown();

			// File f = new File("./test-tar.tar");
			// Template.run(cfg._alphabet, cfg._nfa, new FileInputStream(f));
			// Template.main();

			// ToolBox htb = new ToolBox(cfg._nfa, cfg._relations, cfg._alphabet);
			// htb.toHarness();
			// htb.execHarness();

		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("meet IOException");

		}
	}

}
