package com.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Person;
import com.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public void addPerson(Collection<Person> persons) {
		personRepository.save(persons);
	}
	
	public void addPersonEvent(Collection<Person> persons) {
		personRepository.save(persons);
	}

	public void deletePerson(int id) {
		personRepository.delete(id);
	}

	public List<Person> getAllPerson() {

		/*
		 * List<CurrentStudent> students = new ArrayList<CurrentStudent>();
		 * Iterable<CurrentStudent> itr = currentStuRepository.findAll(); for
		 * (CurrentStudent student : itr) { students.add(student); }
		 */
		return personRepository.findAll();
	}
	public List<Person> getAllPersonEvents() {

		/*
		 * List<CurrentStudent> students = new ArrayList<CurrentStudent>();
		 * Iterable<CurrentStudent> itr = currentStuRepository.findAll(); for
		 * (CurrentStudent student : itr) { students.add(student); }
		 */
		return personRepository.findAll();
	}
	

	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return personRepository.findOne(id);
	}

	public void updatePerson(Person student) {
		personRepository.save(student);

	}
	/*
	 * public Device getDevice(int id) { return currentStuRepository.findOne(id); }
	 * 
	 * public void updateDevice(Device device) { currentStuRepository.save(device);
	 * }
	 */
}
