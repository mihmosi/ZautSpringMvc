package com.mosi.springMvc.controller;

import com.mosi.springMvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {
    @RequestMapping
    public String index() {
        return "index";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        List<String> professionList = Arrays.asList("Developer", "Designer", "ProductManager", "Architect");
        model.addAttribute("professionList", professionList);

        return "/register_form";
    }
    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user){
        System.out.println(user);
        return "register_success";
    }
}
