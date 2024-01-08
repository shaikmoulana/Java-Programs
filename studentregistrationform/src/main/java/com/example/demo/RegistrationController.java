package com.example.demo;

//src/main/java/com/example/demo/RegistrationController.java

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

 @GetMapping("/")
 public String showForm() {
     return "index";
 }

 // Handle form submission
 // You can add the logic to save the data to a database here
 // For simplicity, we're just returning a success message
 @PostMapping("/register")
 public String register() {
     return "success";
 }
}

