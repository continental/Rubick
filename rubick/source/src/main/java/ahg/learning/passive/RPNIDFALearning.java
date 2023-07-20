package ahg.learning.passive;

import de.learnlib.algorithms.rpni.BlueFringeRPNIDFA;
import de.learnlib.api.algorithm.PassiveLearningAlgorithm.PassiveDFALearner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import net.automatalib.automata.fsa.DFA;
import net.automatalib.serialization.dot.GraphDOT;
import net.automatalib.words.Alphabet;
import net.automatalib.words.Word;
import net.automatalib.words.impl.Alphabets;

public final class RPNIDFALearning {

    public static void main(List<String> positiveFiles, List<String> negativeFiles, String outFile) {

        try {
            Collection<Word<Character>> pWordSets = readSamples(positiveFiles);
            Collection<Word<Character>> nWordSets = readSamples(negativeFiles);
            Collection<Character> _alphabet = inferAlphabet(pWordSets, nWordSets);

            // define the alphabet
            // final Alphabet<Character> alphabet = Alphabets.fromCollection("atfcd".chars().mapToObj(e -> (char) e).collect(Collectors.toList()));
            final Alphabet<Character> alphabet = Alphabets.fromCollection(_alphabet);

            // since RPNI is a greedy state-merging algorithm, providing only positive
            // examples results in the trivial
            // one-state acceptor, because there exist no negative "counterexamples" that
            // prevent state merges when
            // generalizing the initial prefix tree acceptor
            // final DFA<?, Character> firstModel = computeModel(alphabet, getPositiveTrainingSamples(),
                    // Collections.emptyList());
            // GraphDOT.write(firstModel, alphabet, System.out);

            // with negative samples (i.e. words that must not be accepted by the model) we
            // get a more "realistic"
            // generalization of the given training set
            final DFA<?, Character> secondModel = computeModel(alphabet, pWordSets, nWordSets);

            if (outFile == null)
                GraphDOT.write(secondModel, alphabet, System.out);
            else {
                File fout = new File(outFile);
                FileWriter fw = new FileWriter(fout);

                GraphDOT.write(secondModel, alphabet, fw);
            }

        } catch (IOException ex) {
            throw new RuntimeException("Caught exception: " + ex.getMessage());
        }
    }

    private static List<String> parseSampleFile(String sampleFile) {
        ArrayList<String> list = new ArrayList<String>();

        try {

            Scanner s = new Scanner(new File(sampleFile));

            while (s.hasNext()) {
                String line = s.nextLine().strip();

                if (! line.startsWith("#")) 
                    list.add(line);

                // System.out.println("line is " + line);
            }

            s.close();

        } catch (IOException ex) {
            throw new RuntimeException("Caught exception: " + ex.getMessage());

        }

        return list;
    }

    private static Collection<Word<Character>> readSamples(List<String> sampleFiles) {
        List<Word<Character>> wset = new ArrayList<Word<Character>>();

        try {

            for (String sampleFile : sampleFiles) {

                List<String> list = parseSampleFile(sampleFile);

                for (String word : list)
                    wset.add(Word.fromString(word));

                // System.out.println("File " + sampleFile + " : " + wset);

            }

        } catch (Exception ex) {
            throw new RuntimeException("Caught exception: " + ex.getMessage());
        }

        return wset;
    }

    private static Collection<Character> inferAlphabet(Collection<Word<Character>>... wordSets) {
        Set<Character> alphabets = new HashSet<Character>();

        for (Collection<Word<Character>> wordSet : wordSets) 
            for (Word<Character> word : wordSet) 
                for (Character c : word) 
                    alphabets.add(c);
        
        System.out.println("Inferred alphabets is " + alphabets);
        return alphabets;
    }

    /**
     * Creates the learner instance, computes and return the inferred model.
     *
     * @param alphabet
     *                        domain from which the learning data are sampled
     * @param positiveSamples
     *                        positive samples
     * @param negativeSamples
     *                        negative samples
     * @param <I>
     *                        input symbol type
     *
     * @return the learned model
     */
    private static <I> DFA<?, I> computeModel(Alphabet<I> alphabet,
            Collection<Word<I>> positiveSamples,
            Collection<Word<I>> negativeSamples) {

        // instantiate learner
        // alternatively one can also use the EDSM variant (BlueFringeEDSMDFA from the
        // learnlib-rpni-edsm artifact)
        // or the MDL variant (BlueFringeMDLDFA from the learnlib-rpni-mdl artifact)
        final PassiveDFALearner<I> learner = new BlueFringeRPNIDFA<>(alphabet);

        learner.addPositiveSamples(positiveSamples);
        learner.addNegativeSamples(negativeSamples);

        return learner.computeModel();
    }

}
