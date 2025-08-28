package com.tss.hibernate.service;

import java.util.List;

import com.tss.hibernate.entity.Student;

public interface StudentService {
	
	Student addNewStudent(Student student);

	List<Student> getAllStudents();
	
	Student readStudentById(int studentId);
	Student readStudentByRollNo(int rollNumber);
	Student readStudentByName(String firstName);
}
