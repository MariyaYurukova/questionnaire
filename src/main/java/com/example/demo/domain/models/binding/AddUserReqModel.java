package com.example.demo.domain.models.binding;

import com.example.demo.domain.entities.Season;
import com.example.demo.domain.entities.Sport;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;


public class AddUserReqModel {

    private String id;
    private String firstname;
    private String town;
    private Season season;
    private Sport sport;
    private String username;
    private String team;
    private Date today;
    private  String tv;

    public AddUserReqModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    @Size(min = 2, max=10, message = "Invalid name")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @NonNull
    @Size(min = 2, max=15, message = "Invalid name")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @NotNull
    public Season getSeason() {
        return season;
    }


    public void setSeason(Season season) {
        this.season = season;
    }

    @NotNull
    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }


    @NonNull
    @Size(min = 3, max=15, message = "Invalid football team")
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    @NonNull
    @Size(min = 2, max=10, message = "Invalid username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }


    @NonNull
    @Size(min = 3, max=15, message = "Invalid tv")
    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
}





