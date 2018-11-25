package com.tridung.demo.service;

import com.tridung.demo.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(long id);
}
