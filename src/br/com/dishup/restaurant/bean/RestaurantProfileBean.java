package br.com.dishup.restaurant.bean;

public class RestaurantProfileBean {

	private String urlLogo;
	private String resumeDescription;
	private String completeDescription;
	private CulinaryTypeBean culinaryType;

	public RestaurantProfileBean() {
	
	}

	public RestaurantProfileBean(String urlLogo, String resumeDescription,
			String completeDescription, CulinaryTypeBean culinaryType) {
		this.urlLogo = urlLogo;
		this.resumeDescription = resumeDescription;
		this.completeDescription = completeDescription;
		this.culinaryType = culinaryType;
	}

	public String getUrlLogo() {
		return urlLogo;
	}

	public void setUrlLogo(String urlLogo) {
		this.urlLogo = urlLogo;
	}

	public String getResumeDescription() {
		return resumeDescription;
	}

	public void setResumeDescription(String resumeDescription) {
		this.resumeDescription = resumeDescription;
	}

	public String getCompleteDescription() {
		return completeDescription;
	}

	public void setCompleteDescription(String completeDescription) {
		this.completeDescription = completeDescription;
	}

	public CulinaryTypeBean getCulinaryType() {
		return culinaryType;
	}

	public void setCulinaryType(CulinaryTypeBean culinaryType) {
		this.culinaryType = culinaryType;
	}
}