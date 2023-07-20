package ahg.harness.exception;

public abstract class SoftException extends HarnessException {

	public boolean isHard = false;

	public SoftException(String errorMessage) {
		super(errorMessage);
	}

}
