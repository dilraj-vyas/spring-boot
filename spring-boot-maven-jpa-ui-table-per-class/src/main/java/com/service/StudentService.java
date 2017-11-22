package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository stuRepository;

	public void addStudent(Student student) {
		stuRepository.save(student);
	}

	public void deleteStudent(int id) {
		stuRepository.delete(id);
	}

	public Iterable<Student> getAllStudents() {

		/*
		 * List<CurrentStudent> students = new ArrayList<CurrentStudent>();
		 * Iterable<CurrentStudent> itr = currentStuRepository.findAll(); for
		 * (CurrentStudent student : itr) { students.add(student); }
		 */
		return stuRepository.findAll();
	}

	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return stuRepository.findOne(id);
	}

	public void updateStudent(Student student) {
		stuRepository.save(student);

	}
	/*
	 * public Device getDevice(int id) { return
	 * currentStuRepository.findOne(id); }
	 * 
	 * public void updateDevice(Device device) {
	 * currentStuRepository.save(device); }
	 */
}
