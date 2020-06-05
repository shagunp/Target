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

"product_description",
"buy_url",
"enrichment",
"return_method",
"handling",
"recall_compliance",
"tax_category",
"display_option",
"fulfillment",
"package_dimensions",
"environmental_segmentation",
"manufacturer",
"product_vendors",
"product_classification",
"product_brand",
"item_state",
"specifications",
"attributes",
"country_of_origin",
"relationship_type_code",
"subscription_eligible",
"ribbons",
"tags",
"ship_to_restriction",
"estore_item_status_code",
"eligibility_rules",
"is_proposition_65",
"return_policies",
"packaging"
})
public class Item {

@JsonIgnore
private String tcin;
@JsonIgnore
private BundleComponents bundleComponents;
@JsonIgnore
private String dpci;
@JsonIgnore
private String upc;
@JsonProperty("product_description")
private ProductDescription product_description;
@JsonIgnore
private String buyUrl;
@JsonIgnore
private Enrichment enrichment;
@JsonIgnore
private String returnMethod;
@JsonIgnore
private Handling handling;
@JsonIgnore
private RecallCompliance recallCompliance;
@JsonIgnore
private TaxCategory taxCategory;
@JsonIgnore
private DisplayOption displayOption;
@JsonIgnore
private Fulfillment fulfillment;
@JsonIgnore
private PackageDimensions packageDimensions;
@JsonIgnore
private EnvironmentalSegmentation environmentalSegmentation;
@JsonIgnore
private Manufacturer manufacturer;
@JsonIgnore
private List<ProductVendor> productVendors = null;
@JsonIgnore
private ProductClassification productClassification;
@JsonIgnore
private ProductBrand productBrand;
@JsonIgnore
private String itemState;
@JsonIgnore
private List<Object> specifications = null;
@JsonIgnore
private Attributes attributes;
@JsonIgnore
private String countryOfOrigin;
@JsonIgnore
private String relationshipTypeCode;
@JsonIgnore
private Boolean subscriptionEligible;
@JsonIgnore
private List<Object> ribbons = null;
@JsonIgnore
private List<Object> tags = null;
@JsonIgnore
private String shipToRestriction;
@JsonIgnore
private String estoreItemStatusCode;
@JsonIgnore
private EligibilityRules eligibilityRules;
@JsonIgnore
private Boolean isProposition65;
@JsonIgnore
private ReturnPolicies returnPolicies;
@JsonIgnore
private Packaging packaging;
@JsonProperty("price")
private Double price;

@JsonProperty("price")
public Double getPrice() {
	return price;
}

@JsonProperty("price")
public void setPrice(Double price) {
	this.price = price;
}

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonIgnore
public String getTcin() {
return tcin;
}

@JsonIgnore
public void setTcin(String tcin) {
this.tcin = tcin;
}

@JsonIgnore
public BundleComponents getBundleComponents() {
return bundleComponents;
}

@JsonIgnore
public void setBundleComponents(BundleComponents bundleComponents) {
this.bundleComponents = bundleComponents;
}

@JsonIgnore
public String getDpci() {
return dpci;
}

@JsonIgnore
public void setDpci(String dpci) {
this.dpci = dpci;
}

@JsonIgnore
public String getUpc() {
return upc;
}

@JsonIgnore
public void setUpc(String upc) {
this.upc = upc;
}

@JsonIgnore
public ProductDescription getProduct_description() {
return product_description;
}

@JsonIgnore
public void setProduct_description(ProductDescription productDescription) {
this.product_description = productDescription;
}

@JsonIgnore
public String getBuyUrl() {
return buyUrl;
}

@JsonIgnore
public void setBuyUrl(String buyUrl) {
this.buyUrl = buyUrl;
}

@JsonIgnore
public Enrichment getEnrichment() {
return enrichment;
}

@JsonIgnore
public void setEnrichment(Enrichment enrichment) {
this.enrichment = enrichment;
}

@JsonIgnore
public String getReturnMethod() {
return returnMethod;
}

@JsonIgnore
public void setReturnMethod(String returnMethod) {
this.returnMethod = returnMethod;
}

@JsonIgnore
public Handling getHandling() {
return handling;
}

@JsonIgnore
public void setHandling(Handling handling) {
this.handling = handling;
}

@JsonIgnore
public RecallCompliance getRecallCompliance() {
return recallCompliance;
}

@JsonIgnore
public void setRecallCompliance(RecallCompliance recallCompliance) {
this.recallCompliance = recallCompliance;
}

@JsonIgnore
public TaxCategory getTaxCategory() {
return taxCategory;
}

@JsonIgnore
public void setTaxCategory(TaxCategory taxCategory) {
this.taxCategory = taxCategory;
}

@JsonIgnore
public DisplayOption getDisplayOption() {
return displayOption;
}

@JsonIgnore
public void setDisplayOption(DisplayOption displayOption) {
this.displayOption = displayOption;
}

@JsonIgnore
public Fulfillment getFulfillment() {
return fulfillment;
}

@JsonIgnore
public void setFulfillment(Fulfillment fulfillment) {
this.fulfillment = fulfillment;
}

@JsonIgnore
public PackageDimensions getPackageDimensions() {
return packageDimensions;
}

@JsonIgnore
public void setPackageDimensions(PackageDimensions packageDimensions) {
this.packageDimensions = packageDimensions;
}

@JsonIgnore
public EnvironmentalSegmentation getEnvironmentalSegmentation() {
return environmentalSegmentation;
}

@JsonIgnore
public void setEnvironmentalSegmentation(EnvironmentalSegmentation environmentalSegmentation) {
this.environmentalSegmentation = environmentalSegmentation;
}

@JsonIgnore
public Manufacturer getManufacturer() {
return manufacturer;
}

@JsonIgnore
public void setManufacturer(Manufacturer manufacturer) {
this.manufacturer = manufacturer;
}

@JsonIgnore
public List<ProductVendor> getProductVendors() {
return productVendors;
}

@JsonIgnore
public void setProductVendors(List<ProductVendor> productVendors) {
this.productVendors = productVendors;
}

@JsonIgnore
public ProductClassification getProductClassification() {
return productClassification;
}

@JsonIgnore
public void setProductClassification(ProductClassification productClassification) {
this.productClassification = productClassification;
}

@JsonIgnore
public ProductBrand getProductBrand() {
return productBrand;
}

@JsonIgnore
public void setProductBrand(ProductBrand productBrand) {
this.productBrand = productBrand;
}

@JsonIgnore
public String getItemState() {
return itemState;
}

@JsonIgnore
public void setItemState(String itemState) {
this.itemState = itemState;
}

@JsonIgnore
public List<Object> getSpecifications() {
return specifications;
}

@JsonIgnore
public void setSpecifications(List<Object> specifications) {
this.specifications = specifications;
}

@JsonIgnore
public Attributes getAttributes() {
return attributes;
}

@JsonIgnore
public void setAttributes(Attributes attributes) {
this.attributes = attributes;
}

@JsonIgnore
public String getCountryOfOrigin() {
return countryOfOrigin;
}

@JsonIgnore
public void setCountryOfOrigin(String countryOfOrigin) {
this.countryOfOrigin = countryOfOrigin;
}

@JsonIgnore
public String getRelationshipTypeCode() {
return relationshipTypeCode;
}

@JsonIgnore
public void setRelationshipTypeCode(String relationshipTypeCode) {
this.relationshipTypeCode = relationshipTypeCode;
}

@JsonIgnore
public Boolean getSubscriptionEligible() {
return subscriptionEligible;
}

@JsonIgnore
public void setSubscriptionEligible(Boolean subscriptionEligible) {
this.subscriptionEligible = subscriptionEligible;
}

@JsonIgnore
public List<Object> getRibbons() {
return ribbons;
}

@JsonIgnore
public void setRibbons(List<Object> ribbons) {
this.ribbons = ribbons;
}

@JsonIgnore
public List<Object> getTags() {
return tags;
}

@JsonIgnore
public void setTags(List<Object> tags) {
this.tags = tags;
}

@JsonIgnore
public String getShipToRestriction() {
return shipToRestriction;
}

@JsonIgnore
public void setShipToRestriction(String shipToRestriction) {
this.shipToRestriction = shipToRestriction;
}

@JsonIgnore
public String getEstoreItemStatusCode() {
return estoreItemStatusCode;
}

@JsonIgnore
public void setEstoreItemStatusCode(String estoreItemStatusCode) {
this.estoreItemStatusCode = estoreItemStatusCode;
}

@JsonIgnore
public EligibilityRules getEligibilityRules() {
return eligibilityRules;
}

@JsonIgnore
public void setEligibilityRules(EligibilityRules eligibilityRules) {
this.eligibilityRules = eligibilityRules;
}

@JsonIgnore
public Boolean getIsProposition65() {
return isProposition65;
}

@JsonIgnore
public void setIsProposition65(Boolean isProposition65) {
this.isProposition65 = isProposition65;
}

@JsonIgnore
public ReturnPolicies getReturnPolicies() {
return returnPolicies;
}

@JsonIgnore
public void setReturnPolicies(ReturnPolicies returnPolicies) {
this.returnPolicies = returnPolicies;
}

@JsonIgnore
public Packaging getPackaging() {
return packaging;
}

@JsonIgnore
public void setPackaging(Packaging packaging) {
this.packaging = packaging;
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

