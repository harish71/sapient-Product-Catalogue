package com.sapient.productCatalogue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.productCatalogue.model.Product;
import com.sapient.productCatalogue.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/product/getByBrand/{brand}")
	public List<Product> getProductByBrand(@PathVariable String brand) {
		List<Product> result = service.getProductByBrand(brand);
		
		return result;
	}
	
	@GetMapping("/product/getByColor/{color}")
	public List<Product> getProductByColor(@PathVariable String color) {
		List<Product> result = service.getProductByColor(color);
		
		return result;
	}
	
	@GetMapping("/product/getBySize/{size}")
	public List<Product> getProductBySize(@PathVariable int size) {
		List<Product> result = service.getProductBySize(size);

		return result;
	}
	
	@GetMapping("/product/getByPrice/{price}")
	public List<Product> getProductByPrice(@PathVariable Double price) {
		List<Product> result = service.getProductByPrice(price);
		
		return result;
	}
	
	@GetMapping("/product/getBySku/{sku}")
	public List<Product> getProductBySku(@PathVariable String sku) {
		List<Product> result = service.getProductBySku(sku);
		
		return result;
	}
}
