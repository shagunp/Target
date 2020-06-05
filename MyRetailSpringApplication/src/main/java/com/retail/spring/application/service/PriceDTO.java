package com.retail.spring.application.service;

public class PriceDTO {
	private String value;
	private String currency_code;
	public String getValue() {
		return value;
	}
	public void setValue(String price) {
		this.value = price;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency) {
		this.currency_code = currency;
	}

}
