package com.springboot.students.University.Entities;

public class UniversityModel {
	private int id;
	private String name;
	private String city;
	private String founded_at;
	private String type;
	private String web_page;
	
	public String getFounded_at() {
		return founded_at;
	}
	public void setFounded_at(String founded_at) {
		this.founded_at = founded_at;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWeb_page() {
		return web_page;
	}
	public void setWeb_page(String web_page) {
		this.web_page = web_page;
	}
	

}
