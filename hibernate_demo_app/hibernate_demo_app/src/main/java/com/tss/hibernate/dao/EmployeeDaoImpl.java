package com.tss.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tss.hibernate.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EntityManager manager;

    @Override
    @Transactional
    public Employee addNewEmployee(Employee employee) {
        return manager.merge(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        TypedQuery<Employee> query = manager.createQuery("SELECT e FROM Employee e", Employee.class);
        return query.getResultList();
    }

    @Override
    public Employee readEmployeeById(int id) {
        return manager.find(Employee.class, id);
    }

    @Override
    public List<Employee> readEmployeeByDept(String deptname) {
        String jpql = "SELECT e FROM Employee e WHERE e.deptname = :deptname";
        TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
        query.setParameter("deptname", deptname);
        return query.getResultList();
    }

    @Override
    public List<Employee> readEmployeeByName(String name) {
        String jpql = "SELECT e FROM Employee e WHERE e.name = :name";
        TypedQuery<Employee> query = manager.createQuery(jpql, Employee.class);
        query.setParameter("name", name);
        return query.getResultList();
    }
}
