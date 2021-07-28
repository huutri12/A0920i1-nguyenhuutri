package com.codegym.demo.service.Impl;

import com.codegym.demo.model.EmployeeType;
import com.codegym.demo.repository.EmployeeTypeRepository;
import com.codegym.demo.service.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeTypeServiceImpl implements EmployeeTypeService {
    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;
    @Override
    public List<EmployeeType> findEm() {
        return employeeTypeRepository.findAll();
    }
}
