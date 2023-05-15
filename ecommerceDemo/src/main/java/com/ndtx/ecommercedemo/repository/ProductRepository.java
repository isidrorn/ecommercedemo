package com.ndtx.ecommercedemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndtx.ecommercedemo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	 List<Product> getProductByProductIdAndBrandIdAndStartDateLessThanEqual(Long productId, Long brandId, String startDate);
	 
}


