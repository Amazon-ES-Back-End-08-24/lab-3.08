package com.ironhack.lab3_08.exercise1.repository;

import com.ironhack.lab3_08.exercise1.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
