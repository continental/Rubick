package ahg.harness.exception;

public abstract class HardException extends HarnessException {

	public boolean isHard = true;

	public HardException(String errorMessage) {
 	       super(errorMessage);
	}

}
