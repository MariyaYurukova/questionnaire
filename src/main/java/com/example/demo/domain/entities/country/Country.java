package com.example.demo.domain.entities.country;

import com.example.demo.domain.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name= "countries")
public class Country extends BaseEntity {

  private   String name;


    public Country() {
    }


    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
