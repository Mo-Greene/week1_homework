package com.example.week1_homework.domain;

import com.example.week1_homework.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, String> {
}
