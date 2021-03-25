package com.ibm.demo;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.demo.Services.OrderService;
import com.ibm.demo.entity.Order;

@RestController
public class OrderController {
	@Autowired
	OrderService orderservice; // di

	@PostMapping("/order")
	@ResponseStatus(code = HttpStatus.CREATED)
	String createOrder(@RequestBody @Valid Order order, BindingResult bindingResult) {
		validateModel(bindingResult);
		System.out.println(order);
		return orderservice.createOrder(order);
	}

	@GetMapping("/order")
	List<Order> getOrders(){
		return orderservice.getOrders();// multiple orders
	}
	
	
	@GetMapping("/order/{id}")
	String getOrder(@RequestBody @PathVariable("id") int orderID) {

		return orderservice.getOrder(orderID);
	}

	@PutMapping("/order/{id}")
	void updateOrder(@RequestBody @Valid Order order, BindingResult bindingResult, @PathVariable("id") int orderID) {
		validateModel(bindingResult);
		System.out.println(orderID);
		 orderservice.updateOrder(orderID); //ideally updates dont return
	}

	@DeleteMapping("/order/{id}")
	void deletedOrder(@PathVariable("id") int orderID, HttpRequest httpRequest) {
		System.out.println(httpRequest.getHeaders());

		System.out.println(orderID);
		orderservice.deletedOrder(orderID);
		//return " order deleted"; as it shoulndt return anything
	}
	private void validateModel(BindingResult bindingResult){//for repeating
		if (bindingResult.hasErrors()) {
			throw new IllegalArgumentException("Error generated");
		}
	}

}
