package com.example.demo.domain.entities.tv;

import com.example.demo.domain.entities.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name= "channels")
public class Channel extends BaseEntity {

  private   String tv;

    public Channel() {
    }


    @Column(name = "tv")
    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }
}
