package custom.property;

public class Info {
	private String infoTitle;

	private String infoDesc;

	public String getInfoTitle() {
		return infoTitle;
	}

	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}

	public String getInfoDesc() {
		return infoDesc;
	}

	public void setInfoDesc(String infoDesc) {
		this.infoDesc = infoDesc;
	}

	@Override
	public String toString() {
		return "Info{" +
				"infoTitle='" + infoTitle + '\'' +
				", infoDesc='" + infoDesc + '\'' +
				'}';
	}
}
