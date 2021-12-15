package com.example.demo.domain.entities.Capitals;

import com.example.demo.domain.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name= "capitals")
public class Capital  extends BaseEntity {

      private  String name;


    public Capital() {
    }



    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
