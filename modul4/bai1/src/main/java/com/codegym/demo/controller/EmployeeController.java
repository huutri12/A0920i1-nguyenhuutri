package com.codegym.demo.controller;

import com.codegym.demo.model.Employee;
import com.codegym.demo.repositori.EmployeeRepository;
import com.codegym.demo.service.EmployeeService;
import com.codegym.demo.service.EmployeeTyphService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    EmployeeTyphService employeeTyphService;

    @GetMapping("/employee-list")
    public ModelAndView listEmployee() {
        return new ModelAndView("employee/list", "employees", employeeService.findAll());
    }

    @GetMapping("/employee-add")
    public ModelAndView addNewEmployee(Model model){
        model.addAttribute("employeeTyph", employeeTyphService.findEm());
        return new ModelAndView("employee/create","employee",new Employee());
    }

    @PostMapping("/addNewEmployee")
    public String addNewEmployee(
            @Validated  Employee employee, BindingResult result, Model model){
        new Employee().validate(employee, result);
        if (result.hasFieldErrors()){
            model.addAttribute("employee", employee);
            model.addAttribute("employeeTyph", employeeTyphService.findEm());

            return "/employee/create";
        }else {
            employeeService.save(employee);
            return "redirect:/employee/employee-list";
        }
    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable("id")int id, Model model){
        model.addAttribute("employeeTyph", employeeTyphService.findEm());
        model.addAttribute("employee",employeeService.findById(id));
        return "employee/edit";
    }

    @PostMapping(value = "/update")
    public String  updateEmployee(Employee employee) {
        System.out.println("update");
        employeeService.save(employee);
        return "redirect:/employee/employee-list";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id")int id){
        employeeService.remove(id);
        return "redirect:/employee/employee-list";
    }


}
