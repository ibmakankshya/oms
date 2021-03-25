package com.ibm.demo.Services;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService {

	public String createOrder(Order order) {// spring beans

		return "Order is made!";
	}
}
