package com.hbm.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbm.model.Person;

public interface PersonRepository extends JpaRepository<Person, Serializable> {

	Person findByName(String name);
}
