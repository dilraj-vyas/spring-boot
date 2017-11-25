package com.controller;

import java.util.HashSet;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Events;
import com.model.Person;
import com.service.PersonService;

@RestController
public class PersonController {

	@Autowired(required = true)
	private PersonService personService;


	
	@RequestMapping("/allPerson")
	public List<Person> getAllPersonEvents() {
		return personService.getAllPersonEvents();
	}
	
	/*
	 * @RequestMapping("/student/{id}") public Customer
	 * getStudentById(@PathVariable int id) { return
	 * studentService.getStudent(id); }
	 */

	/*@RequestMapping(method = RequestMethod.POST, value = "/person")
	public void addCustomer(@RequestBody Set<Person> Person) {
		Personervice.addPerson(Person);
	}*/

	
	@RequestMapping("/persons")
	public void addPersonEvent() {

		Set<Events> event = new HashSet<Events>() {
			{
				add(new Events("Hackathon"));
				add(new Events("Start Up India"));
			}
		};

		Set<Person> Person = new HashSet<Person>() {
			{
				add(new Person("Ankit Jain", Long.parseLong("9187545834"),
						event));
				add(new Person("Sourabh Jain", Long.parseLong("9189097834"),
						event));
				add(new Person("Sumit Jain", Long.parseLong("9187556834")));
				add(new Person("Ankita Jain", Long.parseLong("9187767834"),
						event));
				add(new Person("Arpit Jain", Long.parseLong("9187597834")));
			}
		};

		personService.addPersonEvent(Person);
	}

	/*
	 * @RequestMapping(method = RequestMethod.POST, value = "/currentStudent")
	 * public void addCurrentStudent(@RequestBody CurrentStudent student) {
	 * studentService.addStudent(student); }
	 * 
	 * @RequestMapping(method = RequestMethod.POST, value = "/oldStudent")
	 * public void addOldStudent(@RequestBody OldStudent student) {
	 * studentService.addStudent(student); }
	 * 
	 * @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
	 * public void updateStudent(@RequestBody Customer student,
	 * 
	 * @PathVariable String id) { studentService.updateStudent(student); }
	 * 
	 * @RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	 * public void deleteDevice(@PathVariable int id) {
	 * studentService.deleteStudent(id);
	 * 
	 * }
	 */
}
