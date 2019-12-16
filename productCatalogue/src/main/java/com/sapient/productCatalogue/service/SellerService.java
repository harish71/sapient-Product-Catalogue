package com.sapient.productCatalogue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.productCatalogue.model.Seller;
import com.sapient.productCatalogue.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	SellerRepository sellerRepo;
	
	public void save(Seller seller) {
		sellerRepo.save(seller);
	}
	
	public void delete(int id) {
		sellerRepo.deleteById(id);
	}
}
