package com.tss.JPARepository.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	@Column
	private int rollNumber;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private int age;
	
	public Student() {
		super();
	}
	
	

	public Student(int studentId, int rollNumber, String firstName, String lastName, String email, int age) {
		super();
		this.studentId = studentId;
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		studentId = studentId;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + studentId + ", rollNumber=" + rollNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", age=" + age + "]";
	}
}