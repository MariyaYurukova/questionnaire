package com.example.demo.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name= "jobs")
public  class Job extends BaseEntity{

   private String description;
   private Date start;
   private String profession; // dream profession
   private Date today;


    public Job() {
    }


    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Column(name = "start")
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }


    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Column(name = "today")
    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
