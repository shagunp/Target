package com.retail.spring.application.bean;

import org.springframework.stereotype.Component;

@Component
public class Available_to_promise_network {
	    private String product_id;

	    public void setProduct_id(String product_id){
	        this.product_id = product_id;
	    }
	    public String getProduct_id(){
	        return this.product_id;
	    }
	}
