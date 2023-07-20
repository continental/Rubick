package cmdline;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

import cmdline.subcommand.CommandCodeGen;
import cmdline.subcommand.CommandExtract;
import cmdline.subcommand.CommandMerge;
import cmdline.subcommand.CommandActiveLearn;
import cmdline.subcommand.CommandPassiveLearn;
import cmdline.subcommand.CommandDynValidation;

public class Main {

	private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        Configurator.setRootLevel(Level.ALL);

        CommandMain cmdMain = new CommandMain();
        CommandExtract extract = new CommandExtract();
        CommandPassiveLearn plearn = new CommandPassiveLearn();
        CommandActiveLearn alearn = new CommandActiveLearn();
        CommandDynValidation dynv = new CommandDynValidation();
        CommandCodeGen cgen = new CommandCodeGen();
        CommandMerge merge = new CommandMerge();
        JCommander commander = JCommander.newBuilder()
                .programName("Rubick")
                .addObject(cmdMain)
                .addCommand("merge", merge, "mg")
                .addCommand("extract", extract, "ex")
                .addCommand("codegen", cgen, "gen")
                .addCommand("passive-learn", plearn, "pln")
                .addCommand("active-learn", alearn, "aln")
                .addCommand("dynamic-validation", dynv, "dv")
                .build();

        try {
            commander.parse(args);

            if ( (args.length == 0) || cmdMain.isHelp()) {
                commander.usage();
                System.exit(1);
            }

        } catch (ParameterException ex) {
            logger.error("ERROR: " + ex.getMessage());
            commander.usage();
            System.exit(1);

        }

        switch (cmdMain.getLogLevel()) {

            case "-":
                Configurator.setRootLevel(Level.WARN);
                break;

            case "v":
                Configurator.setRootLevel(Level.INFO);
                break;

            case "vv":
                Configurator.setRootLevel(Level.DEBUG);
                break;

            case "vvv":
                Configurator.setRootLevel(Level.ALL);
                break;

            default:
                throw new RuntimeException("Impossible place");

        }

        switch (commander.getParsedCommand()) {

            case "extract":
                extract.process();
                break;

            case "passive-learn":
                plearn.process();
                break;

            case "active-learn":
                alearn.process();
                break;

            case "dynamic-validation":
                dynv.process();
                break;

            case "codegen":
                cgen.process();
                break;

            case "merge":
                merge.process();
                break;

            default:
                throw new RuntimeException("Impossible place");

        }

    }
}
