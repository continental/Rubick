package ahg.harness.internal;

public abstract class iTran implements Comparable<iTran> {

	protected String id;

	public String getId() {
		return id;
	}

	@Override
	public int compareTo(iTran t) {
		return getId().compareTo(t.getId());
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return id == ((iTran) obj).getId();
	}

}
