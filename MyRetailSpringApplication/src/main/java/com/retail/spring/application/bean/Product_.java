package com.retail.spring.application.bean;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"available_to_promise_network",
"item",
"circle_offers"
})
public class Product_ {
@JsonIgnore
private AvailableToPromiseNetwork available_to_promise_network;
@JsonProperty("item")
private Item item;
@JsonIgnore
private CircleOffers circle_offers;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("available_to_promise_network")
public AvailableToPromiseNetwork getAvailable_to_promise_network() {
return available_to_promise_network;
}

@JsonProperty("available_to_promise_network")
public void setAvailable_to_promise_network(AvailableToPromiseNetwork availableToPromiseNetwork) {
this.available_to_promise_network = availableToPromiseNetwork;
}

@JsonProperty("item")
public Item getItem() {
return item;
}

@JsonProperty("item")
public void setItem(Item item) {
this.item = item;
}

@JsonProperty("circle_offers")
public CircleOffers getCircle_offers() {
return circle_offers;
}

@JsonProperty("circle_offers")
public void setCircle_offers(CircleOffers circleOffers) {
this.circle_offers = circleOffers;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

