package com.ameen.servicediscovery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/home")
	private String homeMethod() {
		String homePage = "Home Page.";
		//String productsFromExternal = restTemplate.getForObject("http://localhost:8082/products", String.class);
		return homePage + " \n" ;//+ productsFromExternal;
	}
}
