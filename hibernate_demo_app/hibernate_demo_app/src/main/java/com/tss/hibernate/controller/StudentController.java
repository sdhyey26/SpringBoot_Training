package com.tss.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tss.hibernate.entity.Student;
import com.tss.hibernate.service.StudentService;

@RestController
@RequestMapping("/studentapp")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping("/students")
	public Student addNewStudent(@RequestBody Student student) {
		return studentService.addNewStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/{studentId}")
	public Student readStudentById(@PathVariable int studentId) {
		return studentService.readStudentById(studentId);	
	}
	
	@GetMapping("/students/roll/{rollNumber}")
	public Student readStudentByRollNo(@PathVariable int rollNumber) {
		return studentService.readStudentByRollNo(rollNumber);	
	}
	
	@GetMapping("/students/name/{firstName}")
	public Student readStudentByName(@PathVariable String firstName) {
		return studentService.readStudentByName(firstName);	
	}
}
