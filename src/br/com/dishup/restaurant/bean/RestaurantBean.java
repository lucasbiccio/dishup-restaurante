package br.com.dishup.restaurant.bean;

import java.util.List;

public class RestaurantBean {
	
	private int id;
	private RestaurantAddressBean addressBean;
	private RestaurantResponsibleBean responsibleBean;
	private RestaurantBasicInfoBean basicInfoBean;
	private RestaurantProfileBean profileBean;
	private RestaurantScheduleBean scheduleBean;
	private List<RestaurantUserGroupBean> userGroupBean;
	
	public RestaurantBean() {

	}

	public RestaurantBean(int id, RestaurantAddressBean addressBean,
			RestaurantResponsibleBean responsibleBean,
			RestaurantBasicInfoBean basicInfoBean,
			RestaurantProfileBean profileBean,
			RestaurantScheduleBean scheduleBean,
			List<RestaurantUserGroupBean> userGroupBean) {
		this.id = id;
		this.addressBean = addressBean;
		this.responsibleBean = responsibleBean;
		this.basicInfoBean = basicInfoBean;
		this.profileBean = profileBean;
		this.scheduleBean = scheduleBean;
		this.userGroupBean = userGroupBean;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RestaurantAddressBean getAddressBean() {
		return addressBean;
	}

	public void setAddressBean(RestaurantAddressBean addressBean) {
		this.addressBean = addressBean;
	}

	public RestaurantResponsibleBean getResponsibleBean() {
		return responsibleBean;
	}

	public void setResponsibleBean(RestaurantResponsibleBean responsibleBean) {
		this.responsibleBean = responsibleBean;
	}

	public RestaurantBasicInfoBean getBasicInfoBean() {
		return basicInfoBean;
	}

	public void setBasicInfoBean(RestaurantBasicInfoBean basicInfoBean) {
		this.basicInfoBean = basicInfoBean;
	}

	public RestaurantProfileBean getProfileBean() {
		return profileBean;
	}

	public void setProfileBean(RestaurantProfileBean profileBean) {
		this.profileBean = profileBean;
	}

	public RestaurantScheduleBean getScheduleBean() {
		return scheduleBean;
	}

	public void setScheduleBean(RestaurantScheduleBean scheduleBean) {
		this.scheduleBean = scheduleBean;
	}

	public List<RestaurantUserGroupBean> getUserGroupBean() {
		return userGroupBean;
	}

	public void setUserGroupBean(List<RestaurantUserGroupBean> userGroupBean) {
		this.userGroupBean = userGroupBean;
	}
}