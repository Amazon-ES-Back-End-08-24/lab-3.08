package com.ironhack.lab3_08.exercise2.repository;

import com.ironhack.lab3_08.exercise2.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
