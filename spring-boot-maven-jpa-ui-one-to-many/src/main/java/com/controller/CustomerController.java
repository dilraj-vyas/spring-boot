package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
	public Iterable<Customer> getAllcustomers() {
		return customerService.getAllCustomer();
	}

	/*
	 * @RequestMapping("/student/{id}") public Customer
	 * getStudentById(@PathVariable int id) { return
	 * studentService.getStudent(id); }
	 */

	@RequestMapping(method = RequestMethod.POST, value = "/customer")
	public void addCustomer(@RequestBody Customer customer) {
		List<Address> addresses = (List<Address>) customer.getAddresses();
		for (Address address : addresses) {
			address.setCustomer(customer);
		}
		customer.setAddresses(addresses);
		customerService.addCustomer(customer);
	}

	@RequestMapping("/customers")
	public void addStudents() {

		Customer cust = new Customer("Anuj", Long.parseLong("7758669742"));

		/*List<Address> addresses = Arrays.asList(new Address("BTM", cust),
				new Address("HSR", cust));*/
		List<Address> addresses = new ArrayList<Address>() {
			{
				add(new Address("BTM", cust));
				add(new Address("HSR", cust));
			}
		};
		cust.setAddresses(addresses);
		customerService.addCustomer(cust);
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
