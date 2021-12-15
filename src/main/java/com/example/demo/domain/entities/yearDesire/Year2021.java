package com.example.demo.domain.entities.yearDesire;

import com.example.demo.domain.entities.BaseEntity;
import com.example.demo.domain.entities.Desire;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name= "year_2021")
public class Year2021 extends BaseEntity {

 private String desire;

   public Year2021() {
   }



    @Column(name = "desire")
   public String getDesire() {
      return desire;
   }

   public void setDesire(String desire) {
      this.desire = desire;
   }
}
