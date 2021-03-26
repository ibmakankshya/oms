package com.ibm.demo.Services;

import java.util.List;
import java.util.Optional;

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
	//search all orders

	public List<Order> getOrders(){
		//return new ArrayList<Order>();
		return orderepository.findAll();
	}

	public void updateOrder(Order order) {// spring beans
		orderepository.save(order);
		//return "Order is updated!";
	}
	public void deletedOrder(int orderID) {// spring beans
		System.out.println("Deleted");
		//return "Order is deleted!";
	}
	public Optional<Order> getOrder(String orderID) {// spring beans

		return orderepository.findById(orderID);
	}
}
