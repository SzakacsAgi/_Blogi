package com.university.blogi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {

    @GetMapping(path = "/home")
    public ModelAndView test() {
        return new ModelAndView("homePage");
    }
}