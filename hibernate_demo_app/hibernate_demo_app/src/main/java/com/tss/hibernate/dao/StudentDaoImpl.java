package com.tss.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tss.hibernate.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	public EntityManager manager;

	@Override
	@Transactional
	public Student addNewStudent(Student student) {

		return manager.merge(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		TypedQuery<Student> query = manager.createQuery("Select s from Student s",Student.class);
		List<Student> dbStudents =query.getResultList();
		return  dbStudents;
	}

	@Override
	public Student readStudentById(int studentId) {
	return manager.find(Student.class, studentId);
	}

	@Override
	public Student readStudentByRollNo(int rollNumber) {
	    String jpql = "SELECT s FROM Student s WHERE s.rollNumber = :rollNumber";
	    TypedQuery<Student> query = manager.createQuery(jpql, Student.class);
	    query.setParameter("rollNumber", rollNumber);
	    return query.getSingleResult();
	}


	@Override
	public Student readStudentByName(String firstName) {
	    String jpql = "SELECT s FROM Student s WHERE s.firstName = :firstName";
	    TypedQuery<Student> query = manager.createQuery(jpql, Student.class);
	    query.setParameter("firstName", firstName);
	    return query.getSingleResult();
	}



}
