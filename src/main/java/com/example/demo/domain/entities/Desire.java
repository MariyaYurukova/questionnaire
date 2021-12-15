package com.example.demo.domain.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "desires")
public class Desire extends BaseEntity{



   private String desire;

   public Desire() {
   }

   @Column(name = "desire")
   public String getDesire() {
      return desire;
   }

   public void setDesire(String desire) {
      this.desire = desire;
   }
}
