package com.ironhack.lab3_08.exercise2.repository;

import com.ironhack.lab3_08.exercise2.model.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Integer> {
}
