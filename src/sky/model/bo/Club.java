package sky.model.bo;

public class Club {
	private int id;
	private String abbrName;
	private String imgUrl;
	private String name;
	private ImageUrls imageUrls;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbbrName() {
		return abbrName;
	}
	public void setAbbrName(String abbrName) {
		this.abbrName = abbrName;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ImageUrls getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(ImageUrls imageUrls) {
		this.imageUrls = imageUrls;
	}
}