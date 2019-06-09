package com.springboot.students.University.Schemas;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentDetailItem {
	   private int id;
	    private String name;
	    @JsonProperty("started_at")
	    private Date startedat;
	    private UniversityForStudentDetailItem university;

	    public StudentDetailItem() {
	    }

	    public StudentDetailItem(int id, String name, Date startedat, UniversityForStudentDetailItem university) {
	        this.id = id;
	        this.name = name;
	        this.startedat = startedat;
	        this.university = university;
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

	    public Date getstartedat() {
	        return startedat;
	    }

	    public void setstartedat(Date startedat) {
	        this.startedat = startedat;
	    }

	    public UniversityForStudentDetailItem getUniversity() {
	        return university;
	    }

	    public void setUniversity(UniversityForStudentDetailItem university) {
	        this.university = university;
	    }
}
