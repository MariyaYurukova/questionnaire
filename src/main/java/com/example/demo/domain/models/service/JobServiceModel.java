package com.example.demo.domain.models.service;

import org.springframework.lang.NonNull;

import java.util.Date;

public class JobServiceModel {


    private String id;
    private String description;
    private Date start;
    private String profession; // dream profession
    private Date today;


    public JobServiceModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
