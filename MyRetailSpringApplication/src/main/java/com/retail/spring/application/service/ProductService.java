package com.retail.spring.application.service;

import java.util.List;

import com.retail.spring.application.bean.Price;

public interface ProductService {
	
	public ProductDTO getProduct(String productId);
	 
	public List<ProductDTO> getAllProducts();
	
	public Price updatePrice(String productId, Price price);

}
