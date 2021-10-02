//package com.mosi.springMvc.controller;
//
//import com.mosi.springMvc.model.Person;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@RequestMapping("/")
//public class MyControler {
//
//    @GetMapping
//    public String showFirstPage(){
//        return "first-view";
//    }
//
//        @GetMapping("/askDetails")
//    public String askEmployeeDetails(Model model) {
//
//        model.addAttribute("person", new Person());
//
//        return "ask-smp-details-view";
//    }
//
//
////    @GetMapping("/askDetails")
////    public String askEmployeeDetails() {
////        return "ask-smp-details-view";
////    }
//
//
//
//    @GetMapping("/showDetails")
//    public String showEmpDetails(@RequestParam(required = false) String in_input, Model model) {
////        System.out.println("name is: " + in_input);
//        String changedName = "Mr. "+ in_input + "!";
//        model.addAttribute("outputName", changedName);
//        return "show-emp-details-view";
//    }
//}
