package com.example.demo.model;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service
public class UserManager 
{
	//Dependency Injection
	@Autowired
	UserRepository ur;
	
	public String userValidate(User u)
	{
		if(ur.validate(u.username, u.password).compareTo("1")==0) 
		{
			return "Authorised User";
		} 
		else 
		{
			return "Unauthorised User";
		}
	}

}
