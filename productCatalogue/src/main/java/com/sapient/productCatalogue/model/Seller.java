package com.sapient.productCatalogue.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
	
	@Id
	private int sellerId;
	private int productId;
	private int quantity;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
