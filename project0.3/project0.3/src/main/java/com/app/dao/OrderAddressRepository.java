package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojo.OrderAddress;

public interface OrderAddressRepository extends JpaRepository<OrderAddress, Integer> {
	OrderAddress findByOrderId(int oId);
}
