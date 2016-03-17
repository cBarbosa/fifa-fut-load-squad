package sky.model.bo;

import java.util.List;

public class FUTPlayerItemList {
	private int page;
	private int totalPages;
	private int totalResults;
	private String type;
	private int count;
	private List<Player> items;

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Player> getItems() {
		return items;
	}
	public void setItems(List<Player> items) {
		this.items = items;
	}
}