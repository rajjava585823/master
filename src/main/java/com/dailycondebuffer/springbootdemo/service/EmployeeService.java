package com.dailycondebuffer.springbootdemo.service;

import com.dailycondebuffer.springbootdemo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);
}
