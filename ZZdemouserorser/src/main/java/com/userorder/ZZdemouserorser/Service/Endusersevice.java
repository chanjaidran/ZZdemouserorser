package com.userorder.ZZdemouserorser.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userorder.ZZdemouserorser.Entity.Endusers;
import com.userorder.ZZdemouserorser.Repositorys.EnduserRepo;

@Service
public class Endusersevice {
	
	@Autowired
	EnduserRepo enduserRepo;
	

	public List<Endusers> allUsers()
	{
		return enduserRepo.findAll();
	}
	
	public Endusers createEnduser(Endusers endusers)
	{
		return enduserRepo.save(endusers);
	}
	
	public Optional<Endusers> userById(int id)
	{
		return enduserRepo.findById(id);
	}
	
}
