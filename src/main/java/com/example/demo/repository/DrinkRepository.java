package com.example.demo.repository;

import com.example.demo.domain.entities.drinking.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, String> {

}
