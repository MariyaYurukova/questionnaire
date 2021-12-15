package com.example.demo.domain.models.views;

import java.util.Date;

public class DrinkViewModel {


    private String id;
    private String name;
    private String coffeeTea;
    private Date today;


    public DrinkViewModel() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoffeeTea() {
        return coffeeTea;
    }

    public void setCoffeeTea(String coffeeTea) {
        this.coffeeTea = coffeeTea;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
