package com.ironhack.lab3_08.exercise2.repository;

import com.ironhack.lab3_08.exercise2.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
}
