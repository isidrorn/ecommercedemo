package com.ndtx.ecommercedemo.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Product
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "products")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-13T00:25:44.690620500+02:00[Europe/Madrid]")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "brand_id")
	private Integer brandId;

	@Column(name = "priority")
	private Integer priority;

	@Column(name = "start_date")
	@Temporal(TemporalType.TIMESTAMP)
	private String startDate;

	@Column(name = "price")
	private Float price = null;

	@Column(name = "end_date")
	private String endDate;

	@Column(name = "price_list")
	private Integer priceList;

	@Column(name = "currency")
	private String currency;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * Get productId
	 * 
	 * @return productId
	 */

	@Schema(name = "productId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("productId")
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * The brand ID.
	 * 
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

	/**
	 * The product priority.
	 * 
	 * @return priority
	 */

	@Schema(name = "priority", description = "The product priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("priority")
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	
	/**
	 * The product price start date.
	 * 
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

	
	/**
	 * The product price.
	 * 
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

	
	/**
	 * The product price end date.
	 * 
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

	
	/**
	 * The applicable fee ID.
	 * 
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

	
	/**
	 * The product price currency.
	 * 
	 * @return currency
	 */

	@Schema(name = "currency", description = "The product price currency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("currency")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Product product = (Product) o;
		return Objects.equals(this.productId, product.productId) && Objects.equals(this.brandId, product.brandId)
				&& Objects.equals(this.priority, product.priority) && Objects.equals(this.startDate, product.startDate)
				&& Objects.equals(this.price, product.price) && Objects.equals(this.endDate, product.endDate)
				&& Objects.equals(this.priceList, product.priceList) && Objects.equals(this.currency, product.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash(productId, brandId, priority, startDate, price, endDate, priceList, currency);
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
