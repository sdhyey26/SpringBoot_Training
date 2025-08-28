package com.tss.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tss.hibernate.dao.EmployeeDao;
import com.tss.hibernate.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee addNewEmployee(Employee employee) {
        return employeeDao.addNewEmployee(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Override
    public Employee readEmployeeById(int id) {
        return employeeDao.readEmployeeById(id);
    }

    @Override
    public List<Employee> readEmployeeByDept(String deptname) {
        return employeeDao.readEmployeeByDept(deptname);
    }

    @Override
    public List<Employee> readEmployeeByName(String name) {
        return employeeDao.readEmployeeByName(name);
    }
}
