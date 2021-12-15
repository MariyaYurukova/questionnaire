package com.example.demo.domain.models.views;

import com.example.demo.domain.entities.Season;
import com.example.demo.domain.entities.Sport;

import java.util.Date;

public class QuestionViewModel {

    private String id;
    private String firstname;
    private String town;
    private Season season;
    private Sport sport;
    private String username;
    private String team;
    private Date today;
    private String tv;

    public QuestionViewModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
}
