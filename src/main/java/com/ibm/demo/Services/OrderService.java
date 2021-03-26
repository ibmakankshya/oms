package com.ibm.demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired     //dependency of repository class
	OrderRepository orderepository;
	
	public String createOrder(Order order) {// spring beans
		Order savedOrder = orderepository.save(order) ;
		return savedOrder.getID();
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
