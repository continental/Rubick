package ahg.harness.exception;

public class NoCondTriggerredException extends SoftException {

	public final static String REASON = "NoCondTriggeredException";
	public final String eventSeq;

	public NoCondTriggerredException(String errorMessage, String _eventSeq) {
		super(errorMessage);

		eventSeq = _eventSeq;
	}

	@Override
	public String getReason() {
		return REASON;
	}

}
