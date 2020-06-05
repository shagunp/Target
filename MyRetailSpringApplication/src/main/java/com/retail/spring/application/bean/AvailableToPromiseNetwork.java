package com.retail.spring.application.bean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
"product_id",
"id_type",
"available_to_promise_quantity",
"street_date",
"availability",
"online_available_to_promise_quantity",
"stores_available_to_promise_quantity",
"availability_status",
"multichannel_options",
"is_infinite_inventory",
"loyalty_availability_status",
"loyalty_purchase_start_date_time",
"is_loyalty_purchase_enabled",
"is_out_of_stock_in_all_store_locations",
"is_out_of_stock_in_all_online_locations"
})
public class AvailableToPromiseNetwork {

@JsonProperty("product_id")
private String product_id;
@JsonIgnore
private String idType;
@JsonIgnore
private Double available_to_promise_quantity;
@JsonIgnore
private String streetDate;
@JsonIgnore
private String availability;
@JsonIgnore
private Double onlineAvailableToPromiseQuantity;
@JsonIgnore
private Double storesAvailableToPromiseQuantity;
@JsonIgnore
private String availabilityStatus;
@JsonIgnore
private List<String> multichannelOptions = null;
@JsonIgnore
private Boolean isInfiniteInventory;
@JsonIgnore
private String loyaltyAvailabilityStatus;
@JsonIgnore
private String loyaltyPurchaseStartDateTime;
@JsonIgnore
private Boolean isLoyaltyPurchaseEnabled;
@JsonIgnore
private Boolean isOutOfStockInAllStoreLocations;
@JsonIgnore
private Boolean isOutOfStockInAllOnlineLocations;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("product_id")
public String getProduct_id() {
return product_id;
}

@JsonProperty("product_id")
public void setProduct_id(String productId) {
this.product_id = productId;
}

@JsonIgnore
public String getIdType() {
return idType;
}

@JsonIgnore
public void setIdType(String idType) {
this.idType = idType;
}

@JsonIgnore
public Double getAvailable_to_promise_quantity() {
return available_to_promise_quantity;
}

@JsonIgnore
public void setAvailable_to_promise_quantity(Double availableToPromiseQuantity) {
this.available_to_promise_quantity = availableToPromiseQuantity;
}

@JsonIgnore
public String getStreetDate() {
return streetDate;
}

@JsonIgnore
public void setStreetDate(String streetDate) {
this.streetDate = streetDate;
}

@JsonIgnore
public String getAvailability() {
return availability;
}

@JsonIgnore
public void setAvailability(String availability) {
this.availability = availability;
}

@JsonIgnore
public Double getOnlineAvailableToPromiseQuantity() {
return onlineAvailableToPromiseQuantity;
}

@JsonIgnore
public void setOnlineAvailableToPromiseQuantity(Double onlineAvailableToPromiseQuantity) {
this.onlineAvailableToPromiseQuantity = onlineAvailableToPromiseQuantity;
}

@JsonIgnore
public Double getStoresAvailableToPromiseQuantity() {
return storesAvailableToPromiseQuantity;
}

@JsonIgnore
public void setStoresAvailableToPromiseQuantity(Double storesAvailableToPromiseQuantity) {
this.storesAvailableToPromiseQuantity = storesAvailableToPromiseQuantity;
}

@JsonIgnore
public String getAvailabilityStatus() {
return availabilityStatus;
}

@JsonIgnore
public void setAvailabilityStatus(String availabilityStatus) {
this.availabilityStatus = availabilityStatus;
}

@JsonIgnore
public List<String> getMultichannelOptions() {
return multichannelOptions;
}

@JsonIgnore
public void setMultichannelOptions(List<String> multichannelOptions) {
this.multichannelOptions = multichannelOptions;
}

@JsonIgnore
public Boolean getIsInfiniteInventory() {
return isInfiniteInventory;
}

@JsonIgnore
public void setIsInfiniteInventory(Boolean isInfiniteInventory) {
this.isInfiniteInventory = isInfiniteInventory;
}

@JsonIgnore
public String getLoyaltyAvailabilityStatus() {
return loyaltyAvailabilityStatus;
}

@JsonIgnore
public void setLoyaltyAvailabilityStatus(String loyaltyAvailabilityStatus) {
this.loyaltyAvailabilityStatus = loyaltyAvailabilityStatus;
}

@JsonIgnore
public String getLoyaltyPurchaseStartDateTime() {
return loyaltyPurchaseStartDateTime;
}

@JsonIgnore
public void setLoyaltyPurchaseStartDateTime(String loyaltyPurchaseStartDateTime) {
this.loyaltyPurchaseStartDateTime = loyaltyPurchaseStartDateTime;
}

@JsonIgnore
public Boolean getIsLoyaltyPurchaseEnabled() {
return isLoyaltyPurchaseEnabled;
}

@JsonIgnore
public void setIsLoyaltyPurchaseEnabled(Boolean isLoyaltyPurchaseEnabled) {
this.isLoyaltyPurchaseEnabled = isLoyaltyPurchaseEnabled;
}

@JsonIgnore
public Boolean getIsOutOfStockInAllStoreLocations() {
return isOutOfStockInAllStoreLocations;
}

@JsonIgnore
public void setIsOutOfStockInAllStoreLocations(Boolean isOutOfStockInAllStoreLocations) {
this.isOutOfStockInAllStoreLocations = isOutOfStockInAllStoreLocations;
}

@JsonIgnore
public Boolean getIsOutOfStockInAllOnlineLocations() {
return isOutOfStockInAllOnlineLocations;
}

@JsonIgnore
public void setIsOutOfStockInAllOnlineLocations(Boolean isOutOfStockInAllOnlineLocations) {
this.isOutOfStockInAllOnlineLocations = isOutOfStockInAllOnlineLocations;
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


