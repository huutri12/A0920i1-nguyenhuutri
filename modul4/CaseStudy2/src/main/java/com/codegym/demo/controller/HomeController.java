package com.codegym.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public ModelAndView getHome(){
        return new ModelAndView("home/home");
    }
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(Model model){
      return new ModelAndView("home/login"); }
}
