package com.springboot.students.University.Schemas;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
public class UniversityDetailItem {

	 private int id;
	    @JsonProperty("api_id")
	    private int apiId;
	    private String name;
	    private String city;
	    @JsonProperty("founded_at")
	    private Date foundedAt;
	    @JsonProperty("web_page")
	    private String webPage;
	    private String type;
	    private List<UniversityStudentListItem> students;

	    public UniversityDetailItem() {}

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public int getApiId() {
	        return apiId;
	    }

	    public void setApiId(int apiId) {
	        this.apiId = apiId;
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

	    public Date getFoundedAt() {
	        return foundedAt;
	    }

	    public void setFoundedAt(Date foundedAt) {
	        this.foundedAt = foundedAt;
	    }

	    public String getWebPage() {
	        return webPage;
	    }

	    public void setWebPage(String webPage) {
	        this.webPage = webPage;
	    }

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public List<UniversityStudentListItem> getStudents() {
	        return students;
	    }

	    public void setStudents(List<UniversityStudentListItem> students) {
	        this.students = students;
	    }
}
