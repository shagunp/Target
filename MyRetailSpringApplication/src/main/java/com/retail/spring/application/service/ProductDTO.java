package com.retail.spring.application.service;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductDTO {
	
    private String productId;
    private String productName;
    private PriceDTO current_price;
    private String errorMsg;
    
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public PriceDTO getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(PriceDTO price) {
		this.current_price = price;
	}
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
