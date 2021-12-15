package com.example.demo.domain.entities.drinking;

import com.example.demo.domain.entities.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name= "drinks")
public class Drink extends BaseEntity {

    private String name;
    private CoffeeTea coffeeTea;
    private Date today;


    public Drink() {
    }




    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "coffee_or_tea")
    public CoffeeTea getCoffeeTea() {
        return coffeeTea;
    }

    public void setCoffeeTea(CoffeeTea coffeeTea) {
        this.coffeeTea = coffeeTea;
    }

    @Column(name = "today")
    public Date getToday() {
        return today;
    }

    public void setToday(Date today) {
        this.today = today;
    }
}
