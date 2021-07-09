package com.codegym.demo.controller;

import com.codegym.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping(value = "/employeeList")
    public ModelAndView listEmployee(){
        return new ModelAndView("employee/list","employees",employeeService.findAll());
    }
}
