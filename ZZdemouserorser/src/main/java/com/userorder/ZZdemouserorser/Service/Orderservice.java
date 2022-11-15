package com.userorder.ZZdemouserorser.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userorder.ZZdemouserorser.Entity.Endusers;
import com.userorder.ZZdemouserorser.Entity.Orders;
import com.userorder.ZZdemouserorser.Repositorys.EnduserRepo;
import com.userorder.ZZdemouserorser.Repositorys.OrderRepo;

@Service
public class Orderservice {
	
	@Autowired
	OrderRepo orderRepo;
	
	
	@Autowired
	Endusersevice endusersevice;
	
	public Orders createOrderForUser(int id,Orders orders)
	{
		Endusers endusers=endusersevice.userById(id).orElseThrow();
		
		orders.setEndusers(endusers);
		
		orderRepo.save(orders);
		
		return orders;
		
	}

	public List<Orders> userordersByid(int id)
	{
		Endusers endusers=endusersevice.userById(id).orElseThrow();
		return endusers.getOrders();
	}
	
	
}
