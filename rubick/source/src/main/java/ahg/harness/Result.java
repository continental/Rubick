package ahg.harness;

public class Result {

	public final String eventSeq;
	public final boolean failed;
	public final boolean partial;

	public Result(String _eventSeq, boolean _failed, boolean _partial) {
		eventSeq = _eventSeq;
		failed = _failed;
		partial = _partial;
	}

}