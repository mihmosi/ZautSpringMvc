package com.mosi.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class MyControler {

    @GetMapping
    public String showFirstPage(){
        return "first-view";
    }
    @RequestMapping("askDetails")
    public String askEmployeeDetails() {
        return "ask-smp-details-view";
    }
    @RequestMapping("showDetails")
    public String showEmpDetails(@RequestParam(required = false) String name, Model model) {
        System.out.println("name is: " + name);
        model.addAttribute("name", name);
        return "show-emp-details-view";
    }
}
