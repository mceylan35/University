package com.springboot.students.University.Entities;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="universities")
public class University {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="api_id")
	private int api_id;
	@Column(name="name")
	private String name;
	@Column(name="city")
	private String city;
	@Column(name="web_page")
	private String web_page;
	@Column(name="type")
	private String type;
	@Column(name="founded_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date founded_at;
	@Column(name="created_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date created_at;
	@Column(name="updated_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	public University(int api_id, String name, String city, String web_page, String type, Date founded_at,
			Date created_at, Date updated_at) {
		super();
		
		this.api_id = api_id;
		this.name = name;
		this.city = city;
		this.web_page = web_page;
		this.type = type;
		this.founded_at = founded_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	public University() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getApi_id() {
		return api_id;
	}
	public void setApi_id(int api_id) {
		this.api_id = api_id;
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
	public String getWeb_page() {
		return web_page;
	}
	public void setWeb_page(String web_page) {
		this.web_page = web_page;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getFounded_at() {
		return founded_at;
	}
	public void setFounded_at(Date founded_at) {
		this.founded_at = founded_at;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	
	
}