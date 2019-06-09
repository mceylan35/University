package com.springboot.students.University.Schemas;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateStudent {
    private String name;
    @JsonProperty("started_at")
    private Date startedat;
    private int university;

    public CreateStudent() {
    }

    public CreateStudent(String name, Date startedat, int university) {
        this.name = name;
        this.startedat = startedat;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartedAt() {
        return startedat;
    }

    public void setStartedAt(Date startedAt) {
        this.startedat = startedAt;
    }

    public int getUniversity() {
        return university;
    }

    public void setUniversity(int university) {
        this.university = university;
    }
}