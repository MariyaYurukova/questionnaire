package com.example.demo.domain.models.service;

import com.example.demo.domain.entities.drinking.CoffeeTea;

import java.util.Date;

public class DrinkingServiceModel {

    private String id;
    private String name;
    private CoffeeTea coffeeTea;
    private Date today;


    public DrinkingServiceModel() {
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

    public CoffeeTea getCoffeeTea() {
        return coffeeTea;
    }

    public void setCoffeeTea(CoffeeTea coffeeTea) {
        this.coffeeTea = coffeeTea;
    }

    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
