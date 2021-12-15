package com.example.demo.domain.entities.dream;

import com.example.demo.domain.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name= "dreams")
public class Dream  extends BaseEntity {

   private String name;

    public Dream() {
    }




    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
