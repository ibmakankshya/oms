package com.ibm.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;

@Service
public class OrderService {

	public String createOrder(Order order) {// spring beans

		return "Order is made!";
	}
	public List<Order> getOrders(){
		return new ArrayList<Order>();
	}
	public String getOrder(int orderID) {// spring beans

		return "Order is found!";
	}
	public void updateOrder(int orderID) {// spring beans

		//return "Order is updated!";
	}
	public void deletedOrder(int orderID) {// spring beans
		System.out.println("Deleted");
		//return "Order is deleted!";
	}
	
}
