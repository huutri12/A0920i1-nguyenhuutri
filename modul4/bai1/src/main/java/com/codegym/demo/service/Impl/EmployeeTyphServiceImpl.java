package com.codegym.demo.service.Impl;

import com.codegym.demo.model.Employee;
import com.codegym.demo.model.EmployeeTyph;
import com.codegym.demo.repositori.EmployTyphRepository;
import com.codegym.demo.service.EmployeeTyphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeTyphServiceImpl implements EmployeeTyphService {

    @Autowired
    private EmployTyphRepository employTyphRepository;

    @Override
    public List<EmployeeTyph> findEm() {
        return employTyphRepository.findAll();
    }


}
