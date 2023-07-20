package ahg.harness.exception;

public class BreakDataDepException extends HardException {

	public final static String REASON = "BreakDataDepException";

	public BreakDataDepException(String errorMessage) {
		super(errorMessage);
	}

	@Override
	public String getReason() {
		return REASON;
	}

}
