package com.hbm.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbm.model.Person;
import com.hbm.repository.PersonRepository;

@Service
public class HBMService {
	
	@Autowired
	private PersonRepository repo;
	
	public List<Person> save(Collection<Person> person) {
		return repo.save(person);
	}
	
	public List<Person> findAll(){
		return repo.findAll();
	}
	
	public Person findById(Integer id) {
		return repo.findOne(id);
	}
	
	public Person findByName(String name){
		return repo.findByName(name);
	}
}
