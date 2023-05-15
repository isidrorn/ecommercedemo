package com.ndtx.ecommercedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ndtx.ecommercedemo.model.Product;
import com.ndtx.ecommercedemo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> findProductByProductIdAndBrandIdAndStartDate(Long productId, Long brandId, String startDate) {
		return productRepo.getProductByProductIdAndBrandIdAndStartDateLessThanEqual(productId, brandId, startDate);

	}

}
