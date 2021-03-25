package com.ibm.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.Services.OrderService;
import com.ibm.demo.entity.Order;

@RestController
public class OrderController {
	@Autowired
	OrderService orderservice; //di
	@PostMapping("/order")
		String createOrder(@RequestBody @Valid Order order, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Error generated");
		}
		System.out.println(order);
		return orderservice.createOrder(order);
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
