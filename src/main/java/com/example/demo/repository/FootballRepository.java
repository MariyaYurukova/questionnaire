package com.example.demo.repository;

import com.example.demo.domain.entities.football.Football;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FootballRepository  extends JpaRepository<Football, String> {
}
