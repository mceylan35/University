package com.springboot.students.University.Entities;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
@Table(name="students")
public class Student {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="university_id")
	private int university_id;
	@Column(name="name")
	private String name;
	@Column(name="started_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date started_at;
	@Column(name="created_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date created_at;
	@Column(name="updated_at")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	
	
	
	public Student(int id, int university_id, String name, Date started_at, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.university_id = university_id;
		this.name = name;
		this.started_at = started_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	public Student() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUniversity_id() {
		return university_id;
	}
	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStarted_at() {
		return started_at;
	}
	public void setStarted_at(Date started_at) {
		this.started_at = started_at;
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
	//public virtual universities universities { get; set; } bir tane üniversitesi olacak
	
}