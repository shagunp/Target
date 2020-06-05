package com.retail.spring.application.dao.impl;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeoutException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.retail.spring.application.bean.Current_price;
import com.retail.spring.application.bean.Price;
import com.retail.spring.application.bean.Product;
import com.retail.spring.application.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	private MongoOperations mongoOperations;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Optional<Product> fetchProduct(String productId) {
		 String url = "https://redsky.target.com/v2/pdp/tcin/" + productId + "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
		 Product product;
		 try {
			 String response = restTemplate.getForObject(url, String.class);
			 product = new Gson().fromJson(response, Product.class);
		 } catch(Exception ex) {
			 return Optional.empty();
		 }
		 return Optional.ofNullable(product);
	}
	
	@Override
	public Price fetchPrice(String productId) {
		 return mongoOperations.findOne(new Query(where("product_id").is(productId)), Price.class); 
	}

	@Override
	public List<Product> fetchAllProducts() {
		return null;
	}

	@Override
	public Price updateProductPrice(String productId, Price price) {
		Current_price currentPrice = price.getCurrent_price();
		Update update = new Update();
		update.set("current_price.value", currentPrice.getValue());
		update.set("current_price.currency_code",currentPrice.getCurrency_code());
		mongoOperations.upsert(new Query(where("product_id").is(productId)), update, Price.class);
		return mongoOperations.findOne(new Query(where("product_id").is(productId)), Price.class);	
	}

}
