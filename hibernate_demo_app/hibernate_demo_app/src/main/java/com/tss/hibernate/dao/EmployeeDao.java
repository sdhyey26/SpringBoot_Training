package com.tss.hibernate.dao;

import java.util.List;
import com.tss.hibernate.entity.Employee;

public interface EmployeeDao {

    Employee addNewEmployee(Employee employee);

    List<Employee> getAllEmployees();

    Employee readEmployeeById(int id);

    List<Employee> readEmployeeByDept(String deptname);

    List<Employee> readEmployeeByName(String name);
}
