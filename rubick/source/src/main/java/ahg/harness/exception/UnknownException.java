package ahg.harness.exception;

public class UnknownException extends HardException {

	public final static String REASON = "UnknownException";

	public UnknownException(String errorMessage) {
		super(errorMessage);
	}

	@Override
	public String getReason() {
		return REASON;
	}

}
