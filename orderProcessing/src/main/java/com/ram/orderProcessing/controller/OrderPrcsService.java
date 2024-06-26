package com.ram.orderProcessing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderPrcsService {

	@GetMapping("/microservice/orderProcessing")
	public String getOrderPrcs() {
		return "Welcome to Order Processing";
	}
}
