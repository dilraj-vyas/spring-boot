package com.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Events;
import com.model.Person;
import com.service.PersonService;

import antlr.debug.Event;

@RestController
public class PersonController {

	@Autowired(required = true)
	private PersonService personService;

	@RequestMapping("/allPerson")
	public Iterable<Person> getAllPersons() {
		return personService.getAllPerson();
	}

	/*
	 * @RequestMapping("/student/{id}") public Customer getStudentById(@PathVariable
	 * int id) { return studentService.getStudent(id); }
	 */

	/*
	 * @RequestMapping(method = RequestMethod.POST, value = "/customer") public void
	 * addCustomer(@RequestBody Customer customer) { List<Address> addresses =
	 * (List<Address>) customer.getAddresses(); for (Address address : addresses) {
	 * address.setCustomer(customer); } customer.setAddresses(addresses);
	 * personService.addPerson(customer); }
	 */

	@RequestMapping("/persons")
	public void addPerson() {

	/*	Set<Events> event = new HashSet<Events>() {
			{
				add(new Events("Hackathon"));
				add(new Events("Start Up India"));
			}
		};
		Set<Person> persons = new HashSet<Person>() {
			{
				add(new Person("Ankit Jain", Long.parseLong("9187545834"), event));
				add(new Person("Sourabh Jain", Long.parseLong("9189097834"), event));
				add(new Person("Sumit Jain", Long.parseLong("9187556834")));
				add(new Person("Ankita Jain", Long.parseLong("9187767834"), event));
				add(new Person("Arpit Jain", Long.parseLong("9187597834")));
			}
		};*/

		Person person1=new Person("Ankit Jain", Long.parseLong("9187545834"));
		Events event= new Events("Hackathon");
		Events event1= new Events("Start Up india");
//		event.getPersons().add(person1);
		Person person2=new Person("Sumit Jain", Long.parseLong("9198745834"));
//		event.getPersons().add(person2);
		person1.getEvents().add(event);
		person1.getEvents().add(event1);
		person2.getEvents().add(event1);
		
		Set<Person> persons=new HashSet<>();
		persons.add(person1);
		persons.add(person2);
//		Person person2=new Person("Ankit Jain", Long.parseLong("9187545834"));
		/*
		 * List<Address> addresses = Arrays.asList(new Address("BTM", cust), new
		 * Address("HSR", cust));
		 */

		personService.addPerson(persons);
	}

	/*
	 * @RequestMapping(method = RequestMethod.POST, value = "/currentStudent")
	 * public void addCurrentStudent(@RequestBody CurrentStudent student) {
	 * studentService.addStudent(student); }
	 * 
	 * @RequestMapping(method = RequestMethod.POST, value = "/oldStudent") public
	 * void addOldStudent(@RequestBody OldStudent student) {
	 * studentService.addStudent(student); }
	 * 
	 * @RequestMapping(method = RequestMethod.PUT, value = "/students/{id}") public
	 * void updateStudent(@RequestBody Customer student,
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
