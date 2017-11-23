package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
