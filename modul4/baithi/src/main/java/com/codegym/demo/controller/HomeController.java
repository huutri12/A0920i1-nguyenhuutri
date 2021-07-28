package com.codegym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    //@GetMapping("/")
    //public String getHome(){
       //return "home/home";
    //}
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getHome(){
        return new ModelAndView("home/home");
    }

}
