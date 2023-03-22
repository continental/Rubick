package ahg.extraction.graph.constraint;

import java.util.HashSet;
import java.util.Set;
import ahg.extraction.graph.expr.iExpr;
import org.json.simple.JSONArray;



// All the constraints inside a path is in relation of AND
public class iPath {
	Set<iConstraint> cons;

	// TODO: add constraint simplification later

	public iPath() {
		cons = new HashSet<iConstraint>();
	}

	private void _addConstraint(iExpr expr) {
		cons.add(new iConstraint(expr));
	}

	private void _addConstraint(iConstraint ic) {
		cons.add(ic);
	}

	public iPath addConstraint(iExpr expr) {
		_addConstraint(expr);

		return this;
	}

	// public iPath addConstraints(Set<iExpr> exprs) {
	// 	exprs.forEach((ele) -> {
	// 		_addConstraint(ele);
	// 	});

	// 	return this;
	// }

	public iPath addConstraints(iExpr... exprs) {
		for (iExpr expr : exprs)
			_addConstraint(expr);

		return this;
	}

	public iPath addConstraint(iConstraint ic) {
		_addConstraint(ic);

		return this;
	}

	public iPath addConstraints(Set<iConstraint> ics) {
		ics.forEach((ele) -> {
			_addConstraint(ele);
		});

		return this;
	}

	public iPath addConstraints(iConstraint... ics) {
		for (iConstraint ic : ics)
			_addConstraint(ic);

		return this;
	}

	static public iPath link2iPaths(iPath p1, iPath p2) {
		return new iPath().addConstraints(p1.cons).addConstraints(p2.cons);
	}

	public JSONArray toJSON() {
		JSONArray obj = new JSONArray();

		for (iConstraint con : cons)
			obj.add(con.toJSON());

		return obj;
	}

 @Override
	public String toString() {
		Set<String> s_cons = new HashSet<String>();

		boolean multiple = (cons.size() > 1);

		cons.forEach((ele) -> {
			if (multiple)
				s_cons.add("(" + ele.toString() + ")");
			else
				s_cons.add(ele.toString());
		});

		return String.join(" ∧ ", s_cons);
	}
}
