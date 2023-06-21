package com.example.urlmappinghandler.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeControllor {

    @GetMapping("/sayspring")
    public  String saySpring(Model model){
        model.addAttribute("tagline","Say Spring MVC");
        return "welcome";
    }
    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("tagline","Welcome Spring MVC");
        return  "welcome";
    }
}
