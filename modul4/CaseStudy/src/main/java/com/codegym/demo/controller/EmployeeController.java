package com.codegym.demo.controller;


import com.codegym.demo.model.*;
import com.codegym.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private EducationDegreeService educationDegreeService;

    @Autowired
    private DivisionService divisionService;

    @Autowired
    private RoleService roleService;

    @ModelAttribute("positions")
    public List<Position> positions(){
        return  positionService.findAll();
    }

    @ModelAttribute("educationDegrees")
    public List<Education_degree> education_degrees(){
        return educationDegreeService.findAll();
    }

    @ModelAttribute("divisions")
    public List<Division> divisions(){
        return divisionService.findAll();
    }

    @ModelAttribute("roles")
    public  List<Role> roles(){
        return roleService.findAll();
    }

    //employee
    @GetMapping("/employee_list")
    public ModelAndView listEmployee(){
        return new ModelAndView("employee/list", "employees",employeeService.findAll());
    }

    @GetMapping("/create_new_employee")
   public ModelAndView createEmployeePage(Model model) {
        return new ModelAndView("employee/create", "employee", new Employee());
    }

    @PostMapping(value = "/addNewEmployee")
    public ModelAndView createEmployee(
            @ModelAttribute("usserRole") User_role user_role,
            @Validated @ModelAttribute("employee") Employee employee, BindingResult result){

        System.out.println("Create");
       System.out.println(employee.getEmployeeName());

        if (result.hasFieldErrors()){
            System.out.println("Validate error");
            return new ModelAndView("employee/create","employee", new Employee());
        }

        System.out.println("User");
        User user = new User(employee.getUser().getUsername(),employee.getUser().getPassword());
        System.out.println(user.getUsername());

        System.out.println("Save user");
        userService.save(user);
        System.out.println("Saved user");

        System.out.println("Save User Role");
        System.out.println("Chua save dc");
        userRoleService.save(new User_role(user_role.getRole(),employee.getUser()));
        System.out.println("Saved User Role");


        Employee employee1 =  new Employee(
                employee.getEmployeeName(),
                employee.getEmployeeDate(),
                employee.getEmployeeIdCard(),
                employee.getEmployeeSalary(),
                employee.getEmployeePhone(),
                employee.getEmployeeEmail(),
                employee.getEmployeeAddress(),
                employee.getPosition()
                ,employee.getEducation_degree(),employee.getDivision(),employee.getUser());

        System.out.println("Save employee");
        employeeService.save(employee1);
        System.out.println("Saved employee");


        return new ModelAndView("employee/list","employees",employeeService.findAll());

    }



}
