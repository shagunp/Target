package com.retail.spring.application.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="price")
public class Price {
	@Id
	private String _id;

    private String product_id;

    private Current_price current_price;

    public void set_id(String _id){
        this._id = _id;
    }
    public String get_id(){
        return this._id;
    }
    public void setProduct_id(String product_id){
        this.product_id = product_id;
    }
    public String getProduct_id(){
        return this.product_id;
    }
    public void setCurrent_price(Current_price current_price){
        this.current_price = current_price;
    }
    public Current_price getCurrent_price(){
        return this.current_price;
    }
}
