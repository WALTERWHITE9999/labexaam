package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserManager;

@RestController
@RequestMapping("/user")
public class UserController 
{
	@Autowired
	UserManager UM;
	
	@PostMapping("/validate")
	public String validate(@RequestBody User u)
	{
		return UM.userValidate(u);
	}

}
