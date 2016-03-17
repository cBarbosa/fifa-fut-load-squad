package sky.model.bo;

public class ImageUrls {
	private String small;
	private String medium;
	private String large;

	private DarkImage dark;
	private NormalImage normal;

	public String getSmall() {
		return small;
	}
	public void setSmall(String small) {
		this.small = small;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getLarge() {
		return large;
	}
	public void setLarge(String large) {
		this.large = large;
	}
	public DarkImage getDark() {
		return dark;
	}
	public void setDark(DarkImage dark) {
		this.dark = dark;
	}
	public NormalImage getNormal() {
		return normal;
	}
	public void setNormal(NormalImage normal) {
		this.normal = normal;
	}
}