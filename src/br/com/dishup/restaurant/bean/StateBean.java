package br.com.dishup.restaurant.bean;

public class StateBean {
	
	private int id;
	private String name;
	
	public StateBean() {
	
	}

	public StateBean(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}