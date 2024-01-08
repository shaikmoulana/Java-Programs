package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {
@Autowired
BackendService bs;
    @PostMapping("/process")
    public String processFormData(@RequestBody FormData formData) {
    	if(bs.insertdata(formData)>0) {
    		System.out.println("success");
    		return "{\"status\": \"success\", \"message\": \"Data received successfully!\"}";    		
    	}
    	else {
    		System.out.println("failed");
    		return "Failed";
    	}
    }
}
