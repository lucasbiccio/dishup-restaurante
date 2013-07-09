package br.com.dishup.restaurante.bean;

public class EmploymentTypeBean {

	private int id;
	private String name;
	
	public EmploymentTypeBean(){
		
	}
	
	public EmploymentTypeBean(int id, String name) {
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