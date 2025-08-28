package com.tss.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tss.hibernate.dao.StudentDao;
import com.tss.hibernate.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student addNewStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.addNewStudent(student);
	}

	@Override
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}

	@Override
	public Student readStudentById(int studentId) {
		return studentDao.readStudentById(studentId);
	}

	@Override
	public Student readStudentByRollNo(int rollNumber) {
		return studentDao.readStudentByRollNo(rollNumber);

	}

	@Override
	public Student readStudentByName(String firstName) {
		return studentDao.readStudentByName(firstName);

	}
	
	

}
