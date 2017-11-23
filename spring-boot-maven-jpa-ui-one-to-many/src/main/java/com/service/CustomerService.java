package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository custRepository;

	public void addCustomer(Customer customer) {
		custRepository.save(customer);
	}

	public void deleteCustomer(int id) {
		custRepository.delete(id);
	}

	public Iterable<Customer> getAllCustomer() {

		/*
		 * List<CurrentStudent> students = new ArrayList<CurrentStudent>();
		 * Iterable<CurrentStudent> itr = currentStuRepository.findAll(); for
		 * (CurrentStudent student : itr) { students.add(student); }
		 */
		return custRepository.findAll();
	}

	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return custRepository.findOne(id);
	}

	public void updateCustomer(Customer student) {
		custRepository.save(student);

	}
	/*
	 * public Device getDevice(int id) { return
	 * currentStuRepository.findOne(id); }
	 * 
	 * public void updateDevice(Device device) {
	 * currentStuRepository.save(device); }
	 */
}
