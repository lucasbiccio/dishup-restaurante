package br.com.dishup.restaurant.bean;

public class RestaurantBasicInfoBean {

	private String CNPJroot;
	private String CNPJfilial;
	private String CNPJcontrol;
	private String socialReason;
	private String site;
	private String dddTephone;
	private String telephone;
	private String inclusionDate;
	
	public RestaurantBasicInfoBean() {
	
	}
	
	public RestaurantBasicInfoBean(String cNPJroot, String cNPJfilial, String cNPJcontrol,
			String socialReason,String site, String dddTephone, String telephone, String inclusionDate) {
		CNPJroot = cNPJroot;
		CNPJfilial = cNPJfilial;
		CNPJcontrol = cNPJcontrol;
		this.socialReason = socialReason;
		this.site = site;
		this.dddTephone = dddTephone;
		this.telephone = telephone;
		this.inclusionDate = inclusionDate;
	}

	public String getCNPJroot() {
		return CNPJroot;
	}

	public void setCNPJroot(String cNPJroot) {
		CNPJroot = cNPJroot;
	}
	
	public String getCNPJfilial() {
		return CNPJfilial;
	}

	public void setCNPJfilial(String cNPJfilial) {
		CNPJfilial = cNPJfilial;
	}

	public String getCNPJcontrol() {
		return CNPJcontrol;
	}

	public void setCNPJcontrol(String cNPJcontrol) {
		CNPJcontrol = cNPJcontrol;
	}

	public String getSocialReason() {
		return socialReason;
	}

	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getDddTephone() {
		return dddTephone;
	}

	public void setDddTephone(String dddTephone) {
		this.dddTephone = dddTephone;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getInclusionDate() {
		return inclusionDate;
	}

	public void setInclusionDate(String inclusionDate) {
		this.inclusionDate = inclusionDate;
	}	
}