package com.example.portfolio_app.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }
    @GetMapping("/skills")
    public String skills(Model model) {
        return "skills";
    }
    @GetMapping("/aboutme")
    public String about(Model model) {
        return "aboutme";
    }
    @GetMapping("/education")
    public String education(Model model) {
        return "education";
    }
    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
}