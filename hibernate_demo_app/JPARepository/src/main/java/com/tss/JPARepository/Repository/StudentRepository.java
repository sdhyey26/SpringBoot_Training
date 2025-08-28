package com.tss.JPARepository.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tss.JPARepository.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

}
