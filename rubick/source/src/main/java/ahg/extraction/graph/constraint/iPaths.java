package ahg.extraction.graph.constraint;

import java.util.HashSet;
import java.util.Set;
import org.json.simple.JSONArray;

public class iPaths {
	
	private Set<iPath> paths;

	public iPaths() {
		paths = new HashSet<iPath>();
	}

	public Set<iPath> getPaths() {
		return paths;
	}

	// here is to add constraint with && realtion to all paths
	// old path 1 && cond  || old path 2 && cond || ...
	// if no old path, create a new one
	public void addConstraintToPaths(iConstraint _cond) {
		if (_cond != null) {
			if (paths.size() > 0) {
				for (iPath path : paths)
					path.addConstraint(_cond);

			} else {
				iPath path = new iPath();
				path.addConstraint(_cond);
				paths.add(path);
			}
		}
	}

	// here is to add new path which is || relation with existing paths
	// old path || new path
	public void addPath(iPath _path) {
		paths.add(_path);
	}

	// old path || new path1 || new path2 || new path3 ...
	public void addPaths(iPaths _paths) {
		paths.addAll(_paths.getPaths());
	}

	static private boolean isEmptyiPaths(iPaths ips) {
		return (ips == null) || (ips.paths.size() == 0);
	}

	static public iPaths crossLinkiPaths(iPaths fromPaths, iPaths toPaths) {
		iPaths linkediPaths = new iPaths();

		boolean fromEmpty = isEmptyiPaths(fromPaths);
		boolean toEmpty = isEmptyiPaths(toPaths);

		if (fromEmpty && toEmpty) {
			// there is nothing to be linked

		} else if (fromEmpty) {
			// reuse toPaths is okay
			linkediPaths.addPaths(toPaths);

		} else if (toEmpty) {
			// reuse fromPaths is okay
			linkediPaths.addPaths(fromPaths);

		} else {
			for (iPath p1 : fromPaths.getPaths()) {
				for (iPath p2 : toPaths.getPaths()) {
					iPath p = iPath.link2iPaths(p1, p2);
					linkediPaths.addPath(p);
				}
			}

		}

		return linkediPaths;
	}

	public JSONArray toJSON() {
		JSONArray obj = new JSONArray();

		for (iPath path : paths)
			obj.add(path.toJSON());

		return obj;
	}

	@Override
	public String toString() {
		Set<String> s_paths = new HashSet<String>();

		boolean multiple = paths.size() > 1;

		paths.forEach((ele) -> {
			if (multiple)
				s_paths.add("(" + ele.toString() + ")");
			else
				s_paths.add(ele.toString());
		});

		return String.join(" ∨ ", s_paths);
	}

}
