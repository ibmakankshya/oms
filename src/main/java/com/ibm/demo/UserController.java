package com.ibm.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
	@GetMapping("/")
	String hello1() {
		return "Hello from the yes side";
	}
	
}
