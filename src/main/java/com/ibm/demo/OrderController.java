package com.ibm.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.entity.Order;

@RestController
public class OrderController {
	@PostMapping("/order")
		String createOrder(Order order) {
		System.out.println(order);
		return "sucess";
	}
	@GetMapping("/order")
	String getOrder() {
		return "got order";
	}
	@PutMapping("/order/{id}")
	String updateOrder(@PathVariable("id") int orderID) {
		System.out.println(orderID);
		return " order updated";
	}
	@DeleteMapping("/order/{id}")
	String deletedOrder(@PathVariable("id") int orderID) {
		System.out.println(orderID);
		return " order deleted";
	}

}
