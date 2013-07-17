package br.com.dishup.restaurant.bean;

public class SessionAttributeBean {

	private String userEmail;

	public SessionAttributeBean(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}
