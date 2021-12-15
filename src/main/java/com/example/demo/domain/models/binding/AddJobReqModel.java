package com.example.demo.domain.models.binding;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class AddJobReqModel {

    private String id;
   private String description;
   private Date start;
   private String profession;
   private Date today;

    public AddJobReqModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NonNull
    @Size(min = 3, max=15, message = "Invalid name")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }



    @NonNull
    @Size(min=3, max=15, message = "Invalid profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }



    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
