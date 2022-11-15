package com.userorder.ZZdemouserorser.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.userorder.ZZdemouserorser.Entity.Orders;
import com.userorder.ZZdemouserorser.Service.Orderservice;

@RestController
public class OrderController {

	@Autowired
	Orderservice orderservice;
	
	@PostMapping("/order/{id}/create")
	public Orders createOrders(@RequestBody Orders orders,@PathVariable("id") int id)
	{
		return orderservice.createOrderForUser(id, orders);
	}
	
	@GetMapping("/users/{id}/orders")
	public List<Orders> usersOrders(@PathVariable int id)
	{
		return orderservice.userordersByid(id);
	}
	
	
}
