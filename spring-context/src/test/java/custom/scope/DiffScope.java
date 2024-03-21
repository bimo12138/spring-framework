package custom.scope;

public class DiffScope {
	private String whereDiff;

	public String getWhereDiff() {
		return whereDiff;
	}

	public void setWhereDiff(String whereDiff) {
		this.whereDiff = whereDiff;
	}

	@Override
	public String toString() {
		return "DiffScope{" +
				"whereDiff='" + whereDiff + '\'' +
				'}';
	}

}
