package com.hbm.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hbm.model.Address;
import com.hbm.model.Person;
import com.hbm.service.HBMService;

@RestController
@RequestMapping
public class OneToManyController {

	@Autowired
	HBMService service;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public List<Person> savePerson(@RequestBody Person person) {
		List<Person> persons = new ArrayList<Person>();
		persons.add(person);
		return service.save(persons);
	}

	@RequestMapping("/addPerson")
	public void addPerson() {

		final Set<Address> addresses = new HashSet<Address>() {
			{
				add(new Address("A-21", "Hsr High Street", "Bangalore"));
				add(new Address("B-21", "BTM High Street", "Bangalore"));
			}
		};

		Set<Person> persons = new HashSet<Person>() {
			{
				add(new Person("Ankit jain", addresses));
				add(new Person("Sourabh jain"));
				add(new Person("Ankita jain", addresses));
			}
		};

		service.save(persons);
	}

	@RequestMapping("persons")
	public List<Person> findAll() {
		return service.findAll();
	}

	@RequestMapping(value = "/personById/{id}", method = RequestMethod.GET)
	public Person findById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@RequestMapping(value = "/personByName/{name}", method = RequestMethod.GET)
	public Person findByName(@PathVariable String name) {
		return service.findByName(name);
	}

}
