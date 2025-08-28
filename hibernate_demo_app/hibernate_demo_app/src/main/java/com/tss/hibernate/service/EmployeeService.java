package com.tss.hibernate.service;

import java.util.List;

import com.tss.hibernate.entity.Employee;

public interface EmployeeService {

    Employee addNewEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee readEmployeeById(int id);

    List<Employee> readEmployeeByDept(String deptname);

    List<Employee> readEmployeeByName(String name);
}
