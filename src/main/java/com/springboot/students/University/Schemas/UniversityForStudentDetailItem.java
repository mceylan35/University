package com.springboot.students.University.Schemas;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UniversityForStudentDetailItem {

	 private int id;
	    private String name;
	    @JsonProperty("founded_at")
	    private Date foundedat;
	    private String type;

	    public UniversityForStudentDetailItem() {
	    }

	    public UniversityForStudentDetailItem(int id, String name, Date foundedat, String type) {
	        this.id = id;
	        this.name = name;
	        this.foundedat = foundedat;
	        this.type = type;
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

	    public Date getfoundedat() {
	        return foundedat;
	    }

	    public void setfoundedat(Date foundedat) {
	        this.foundedat = foundedat;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }
}
