package com.example.demo.domain.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "favorites_name")
public class FavoriteName extends BaseEntity {


    private String username;

    public FavoriteName() {
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
