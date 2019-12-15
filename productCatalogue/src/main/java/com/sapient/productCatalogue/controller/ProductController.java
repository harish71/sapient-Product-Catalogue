package com.sapient.productCatalogue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productCatalogue.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
//	@RequestMapping("/")
//	public void check() {
//		System.out.println("running");
//	}
}
