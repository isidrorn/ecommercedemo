package com.ndtx.ecommercedemo.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;

/**
 * Getproducts200Response
 */


@JsonTypeName("getproducts_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-13T00:25:44.690620500+02:00[Europe/Madrid]")
public class Getproducts200Response {

  private Integer brandId;

  private Long productId;

  private String startDate;

  private Float price = null;

  private String endDate;

  private Integer priceList;

  public Getproducts200Response (Product p) {
	  this.brandId = p.getBrandId();
	  this.productId = p.getProductId();
	  this.startDate = p.getStartDate();
	  this.price = p.getPrice();
	  this.endDate = p.getEndDate();
	  this.priceList = p.getPriceList();
  }

  public Getproducts200Response brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * The brand ID.
   * @return brandId
  */
  
  @Schema(name = "brandId", description = "The brand ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("brandId")
  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public Getproducts200Response productId(Long productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The product ID.
   * @return productId
  */
  
  @Schema(name = "productId", description = "The product ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public Getproducts200Response startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The product price start date.
   * @return startDate
  */
  
  @Schema(name = "startDate", description = "The product price start date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Getproducts200Response price(Float price) {
    this.price = price;
    return this;
  }

  /**
   * The product price.
   * @return price
  */
  
  @Schema(name = "price", description = "The product price.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Getproducts200Response endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The product price end date.
   * @return endDate
  */
  
  @Schema(name = "endDate", description = "The product price end date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endDate")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Getproducts200Response priceList(Integer priceList) {
    this.priceList = priceList;
    return this;
  }

  /**
   * The applicable fee ID.
   * @return priceList
  */
  
  @Schema(name = "priceList", description = "The applicable fee ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceList")
  public Integer getPriceList() {
    return priceList;
  }

  public void setPriceList(Integer priceList) {
    this.priceList = priceList;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Getproducts200Response getproducts200Response = (Getproducts200Response) o;
    return Objects.equals(this.brandId, getproducts200Response.brandId) &&
        Objects.equals(this.productId, getproducts200Response.productId) &&
        Objects.equals(this.startDate, getproducts200Response.startDate) &&
        Objects.equals(this.price, getproducts200Response.price) &&
        Objects.equals(this.endDate, getproducts200Response.endDate) &&
        Objects.equals(this.priceList, getproducts200Response.priceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandId, productId, startDate, price, endDate, priceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Getproducts200Response {\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    priceList: ").append(toIndentedString(priceList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

