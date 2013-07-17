package br.com.dishup.restaurant.bean;

public class RestaurantAddressBean {

	private String CEP;
	private String address;
	private String number;
	private String complement;
	private String neighborhood;
	private CountryBean country;
	private StateBean state;
	private CityBean city;
	
	public RestaurantAddressBean() {
	
	}

	public RestaurantAddressBean(String cEP, String address, String number,
			String complement, String neighborhood, CountryBean country, StateBean state,
			CityBean city) {
		CEP = cEP;
		this.address = address;
		this.number = number;
		this.complement = complement;
		this.neighborhood = neighborhood;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public CountryBean getCountry() {
		return country;
	}

	public void setCountry(CountryBean country) {
		this.country = country;
	}

	public StateBean getState() {
		return state;
	}

	public void setState(StateBean state) {
		this.state = state;
	}

	public CityBean getCity() {
		return city;
	}

	public void setCity(CityBean city) {
		this.city = city;
	}
}