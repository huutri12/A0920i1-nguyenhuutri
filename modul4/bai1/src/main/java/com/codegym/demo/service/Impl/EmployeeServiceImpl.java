package com.codegym.demo.service.Impl;

import com.codegym.demo.model.Employee;
import com.codegym.demo.repositori.EmployeeRepository;
import com.codegym.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee) ;
    }

    @Override
    public Employee remove(int id) {
        Employee employee = findById(id);
        employeeRepository.deleteById(id);
        return employee;
    }
}
