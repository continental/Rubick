package ahg.harness.internal;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import net.automatalib.automata.graphs.TransitionEdge;

public class iMultiTran extends iTran {
	/*
	 * iMultiTran contains a set of complete condition events (like t & f)
	 */

	private List<iSingleTran> trans;

	public iMultiTran(List<TransitionEdge<Character,Integer>> _trans) {
		trans = new ArrayList<iSingleTran>();

		for (TransitionEdge<Character,Integer> e : _trans)
			trans.add(new iSingleTran(e));

		Collections.sort(trans);

		List<String> _ids = new ArrayList<String>();
		for (iSingleTran t : trans)
			_ids.add(t.getId());

		// this is its unique id
		id = String.join("&", _ids);
	}

	public List<iSingleTran> getTrans() {
		return trans;
	}

	@Override
	public String toString() {
		return id;
		/* return "<MTran " + id + ">"; */
	}
}
