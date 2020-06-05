package com.retail.spring.application.dao;

import java.util.List;
import java.util.Optional;

import com.retail.spring.application.bean.Price;
import com.retail.spring.application.bean.Product;

public interface ProductDAO {
	
	public Optional<Product> fetchProduct(String product_id);
	
	public List<Product> fetchAllProducts();
	
	public Price fetchPrice(String product_id);
	
	public Price updateProductPrice(String product_id, Price price);

}
