package com.retail.spring.application.bean;

public class Current_price
{
    private String value;

    private String currency_code;

    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    public void setCurrency_code(String currency){
        this.currency_code = currency;
    }
    public String getCurrency_code(){
        return this.currency_code;
    }
}

