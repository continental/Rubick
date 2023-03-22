package ahg.harness.internal;

import net.automatalib.automata.graphs.TransitionEdge;

public class iSingleTran extends iTran {

	private TransitionEdge<Character,Integer> tran;
	private Character event;
	private Integer sno;
	private String sid;

	public iSingleTran(TransitionEdge<Character,Integer> _tran) {
		tran = _tran;
		event = tran.getInput();
		sno = tran.getTransition();
		sid = iState.getStateId(sno);

		if (sid == null)
			throw new RuntimeException("sid for iSingleTran " + event + " , " + sno + " is null");

		// this is its unique id
		id = Character.toString(event) + "." + sid;
	}

	public TransitionEdge<Character,Integer> getTran() {
		return tran;
	}

	@Override
	public String toString() {
		return id;
		/* return "<STran " + id + ">"; */
	}
}