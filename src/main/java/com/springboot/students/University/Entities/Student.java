package com.springboot.students.University.Entities;
import javax.persistence.*;

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
	private Date started_at;
	@Column(name="create_at")
	private Date create_at;
	@Column(name="updated_at")
	private Date updated_at;
	public Student(int id, int university_id, String name, Date started_at, Date create_at, Date updated_at) {
		super();
		this.id = id;
		this.university_id = university_id;
		this.name = name;
		this.started_at = started_at;
		this.create_at = create_at;
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
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}
