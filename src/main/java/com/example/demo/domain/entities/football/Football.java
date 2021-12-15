package com.example.demo.domain.entities.football;


import com.example.demo.domain.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name= "football_teams")
public class Football extends BaseEntity {


  private String team;


    public Football() {
    }

    @Column(name = "team")
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
