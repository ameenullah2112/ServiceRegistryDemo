package com.ameen.servicediscovery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	@GetMapping("/products")
	private String products() {
		return "List of products";
	}
}
