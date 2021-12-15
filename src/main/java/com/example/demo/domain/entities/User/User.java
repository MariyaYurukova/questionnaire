package com.example.demo.domain.entities.User;

import com.example.demo.domain.entities.BaseEntity;
import com.example.demo.domain.entities.Season;
import com.example.demo.domain.entities.Sport;
import org.springframework.lang.NonNull;


import  javax.persistence.Enumerated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name= "users")
public class User extends BaseEntity {

     private String firstname;
     private String town;
     private Season season;
     private Sport sport;
     private Date today;

    public User() {
    }


    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name = "town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "season")
    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }


    @Enumerated(EnumType.STRING)
    @Column(name = "sport")
    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }


    @Column(name = "today")
    @NonNull
    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
