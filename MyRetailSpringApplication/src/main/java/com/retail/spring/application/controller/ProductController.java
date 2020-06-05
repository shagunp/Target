package com.retail.spring.application.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.retail.spring.application.bean.Price;
import com.retail.spring.application.service.ProductDTO;
import com.retail.spring.application.service.ProductService;


@RestController
public class ProductController {
	@Autowired ProductService productService;
	@GetMapping(value="/products/{product_id}")
	public  ProductDTO getProduct(@PathVariable(value="product_id")  String productId) throws IOException{
		return productService.getProduct(productId);
	}
	
	@PutMapping(value="/products/{product_id}")
	public  Price updatePrice(@PathVariable(value="product_id")  String productId,
			@RequestBody Price price) throws IOException{

		 return productService.updatePrice(productId, price);
	}
}
