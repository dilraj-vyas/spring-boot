package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Address;
import com.model.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired(required = true)
	private CustomerService customerService;

	@RequestMapping("/allCustomer")
	public Iterable<Customer> getAllStudents() {
		return customerService.getAllCustomer();
	}
	
	/*	
	@RequestMapping("/student/{id}")
	public Customer getStudentById(@PathVariable int id) {
		return studentService.getStudent(id);
	}
*/
	
	@RequestMapping(method = RequestMethod.POST, value = "/customer")
	public void addStudent(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
/*	@RequestMapping("/customers")
	public void addStudents() {
		Address address = new Address("15 Main Btm Layout Bangalore");
		Customer cust = new Customer("Ankit Jain",
				Long.parseLong("9145869725"), address);
		customerService.addCustomer(cust);
	}*/
	/*
	@RequestMapping(method = RequestMethod.POST, value = "/currentStudent")
	public void addCurrentStudent(@RequestBody CurrentStudent student) {
		studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/oldStudent")
	public void addOldStudent(@RequestBody OldStudent student) {
		studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
	public void updateStudent(@RequestBody Customer student,
			@PathVariable String id) {
		studentService.updateStudent(student);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public void deleteDevice(@PathVariable int id) {
		studentService.deleteStudent(id);
		
	}*/
}
