package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    CourseService courseService;

    @GetMapping("/")
    public ModelAndView getHome(@RequestParam Optional<String> key_search,@PageableDefault(value = 5) Pageable pageable, Model model){
        if(!key_search.isPresent()){
            Page<Student> listStudent = studentService.findAllStudent(pageable);
            return new ModelAndView("list", "students", studentService.findAllStudent(pageable));
        }else {
            model.addAttribute("key_search", key_search.get());
            return new ModelAndView("list", "students", studentService.findStudentByName(key_search.get(), pageable));
        }
    }


    @GetMapping("/create")
    public ModelAndView getCreatePage(Model model){
        model.addAttribute("courses", courseService.findAllCourse());
        return new ModelAndView("create", "student", new Student());
    }

    @PostMapping("/create")
    public String saveStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/";
    }
}
