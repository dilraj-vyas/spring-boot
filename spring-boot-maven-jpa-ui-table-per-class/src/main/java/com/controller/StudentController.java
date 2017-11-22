package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.CurrentStudent;
import com.model.OldStudent;
import com.model.Student;
import com.service.StudentService;

@RestController
public class StudentController {

	@Autowired(required = true)
	private StudentService studentService;

	@RequestMapping("/allStudent")
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudent(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/currentStudent")
	public void addCurrentStudent(@RequestBody CurrentStudent student) {
		studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/oldStudent")
	public void addOldStudent(@RequestBody OldStudent student) {
		studentService.addStudent(student);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
	public void updateStudent(@RequestBody Student student,
			@PathVariable String id) {
		studentService.updateStudent(student);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public void deleteDevice(@PathVariable int id) {
		studentService.deleteStudent(id);
		
	}
}
