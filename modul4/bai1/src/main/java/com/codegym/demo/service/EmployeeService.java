package com.codegym.demo.service;

import com.codegym.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    Employee remove(int id);
}
