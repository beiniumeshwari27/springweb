package com.codegnan.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codegnan.model.User;

@Controller
public class RegisterController {

    @RequestMapping("/registeruser")
    public String registerUser(@Valid @ModelAttribute User user,
    		BindingResult result,Model model) {
    	//check if there are validation errors
    	if(result.hasErrors()) {
    		//create a map to store error message
    		Map<String,String>errors=new HashMap<>();
    		//iterate through all errors and add them to map.
    		for(FieldError error:result.getFieldErrors()) {
    			errors.put(error.getField(),error.getDefaultMessage());
    		}
    		model.addAttribute("errors",errors);
    		return "errorpage";
    	}else {
    		model.addAttribute("user",user);
    		return "user";
    		}
    }
    	
       /* String name     = request.getParameter("name");
        String email    = request.getParameter("email");
        String password = request.getParameter("password");
        String mobile   = request.getParameter("mobile");
        String address  = request.getParameter("address");

        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setMobile(mobile);
        user.setAddress(address);

        model.addAttribute("user", user);
        return "user";*/  
    	
    }