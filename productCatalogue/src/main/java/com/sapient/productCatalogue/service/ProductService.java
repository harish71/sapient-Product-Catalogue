package com.sapient.productCatalogue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.productCatalogue.model.Product;
import com.sapient.productCatalogue.repository.ProductRepository;
import com.sapient.productCatalogue.repository.SellerRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepo;
	
	@Autowired
	SellerRepository sellerRepo;
	
	public List<Product> getProductByBrand(String brand){
		List<Product> result;
		result = productRepo.findByBrand(brand);
		return result;
	}
	
	public List<Product> getProductByColor(String color){
		List<Product> result;
		result = productRepo.findByColor(color);
		return result;
	}
	
	public List<Product> getProductBySize(int size){
		List<Product> result;
		result = productRepo.findBySize(size);
		return result;
	}
	
	public List<Product> getProductBySku(String sku){
		List<Product> result;
		result = productRepo.findBySku(sku);
		return result;
	}
	
	public List<Product> getProductByPrice(Double price){
		List<Product> result;
		result = productRepo.findByPrice(price);
		return result;
	}
}
