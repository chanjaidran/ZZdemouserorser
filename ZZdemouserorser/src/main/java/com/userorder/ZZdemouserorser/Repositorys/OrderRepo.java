package com.userorder.ZZdemouserorser.Repositorys;

import com.userorder.ZZdemouserorser.Entity.Orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
