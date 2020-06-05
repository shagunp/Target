package com.retail.spring.application.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.retail.spring.application.bean.AvailableToPromiseNetwork;
import com.retail.spring.application.bean.Price;
import com.retail.spring.application.bean.Product;
import com.retail.spring.application.bean.Product_;
import com.retail.spring.application.dao.ProductDAO;
import com.retail.spring.application.service.PriceDTO;
import com.retail.spring.application.service.ProductDTO;
import com.retail.spring.application.service.ProductService;

public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO productDAO;
	@Override
	public ProductDTO getProduct(String productId) {
		Optional<Product> optionalProduct = productDAO.fetchProduct(productId);
		ProductDTO productDTO = new ProductDTO();
		if(optionalProduct.isPresent()) {
		Product product = 	optionalProduct.get();
		Price price = productDAO.fetchPrice(productId);
		
		Product_ productFetched = product.getProduct();
		AvailableToPromiseNetwork availableToPromiseNetwork = productFetched.getAvailable_to_promise_network();
		productDTO.setProductId(availableToPromiseNetwork.getProduct_id());
		
		productDTO.setProductName(productFetched.getItem().getProduct_description().getTitle());
		PriceDTO priceDTO = new PriceDTO();
		priceDTO.setValue(price.getCurrent_price().getValue());
		priceDTO.setCurrency_code(price.getCurrent_price().getCurrency_code());
		
		productDTO.setCurrent_price(priceDTO);
		
		} else {
			productDTO.setErrorMsg("Product not found!");
		}
		return productDTO;
	}

	@Override
	public List<ProductDTO> getAllProducts() {
		
		return null;
	}

	@Override
	public Price updatePrice(String productId, Price price) {
		return productDAO.updateProductPrice(productId, price);
		
	}

}
