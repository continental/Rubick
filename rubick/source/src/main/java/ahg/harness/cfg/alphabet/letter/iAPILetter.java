package ahg.harness.cfg.alphabet.letter;

import ahg.harness.cfg.alphabet.letter.iLetter;

public class iAPILetter extends iLetter {

	private String funcSig;

	public iAPILetter(String _funcSig) {
		funcSig = _funcSig;
	}

	@Override
	public String getContent() {
		return funcSig;
	}

	@Override
	public String toString() {
		return "<FLetter " + funcSig + " >";
	}

}
