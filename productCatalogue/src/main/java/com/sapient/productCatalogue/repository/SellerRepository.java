package com.sapient.productCatalogue.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sapient.productCatalogue.model.Seller;

@Repository
public interface SellerRepository extends CrudRepository<Seller, Integer>{

}
