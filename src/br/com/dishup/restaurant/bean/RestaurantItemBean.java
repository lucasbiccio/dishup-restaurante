package br.com.dishup.restaurant.bean;

public class RestaurantItemBean {
	
	private int id;
	private String socialReason;
	
	public RestaurantItemBean() {
	
	}

	public RestaurantItemBean(int id, String socialReason) {
		this.id = id;
		this.socialReason = socialReason;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}
}