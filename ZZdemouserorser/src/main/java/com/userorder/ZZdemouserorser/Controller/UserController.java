package com.userorder.ZZdemouserorser.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userorder.ZZdemouserorser.Entity.Endusers;
import com.userorder.ZZdemouserorser.Service.Endusersevice;
import com.userorder.ZZdemouserorser.Service.Orderservice;

@RestController
public class UserController {

	@Autowired
	Endusersevice endusersevice;
	
	@Autowired
	Orderservice orderservice;
	
	@PostMapping("/create")
	public Endusers create(@RequestBody Endusers endusers)
	{
		return endusersevice.createEnduser(endusers);	
	}
	
	@GetMapping("/users")
	public List<Endusers> allusers()
	{
		return endusersevice.allUsers();
	}
	
	
	@GetMapping("/user/{id}")
	public Optional<Endusers> getById(@PathVariable("id") int id)
	{
		return endusersevice.userById(id);
	}
	
	
}
