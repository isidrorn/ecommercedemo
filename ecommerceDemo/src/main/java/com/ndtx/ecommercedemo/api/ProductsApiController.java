package com.ndtx.ecommercedemo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ndtx.ecommercedemo.model.Getproducts200Response;
import com.ndtx.ecommercedemo.model.Product;
import com.ndtx.ecommercedemo.service.ProductService;


@Controller
@RestController
@RequestMapping("${openapi.eCommerceDemo.base-path:}")
public class ProductsApiController implements ProductsApi {

	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public ResponseEntity<List<Getproducts200Response>> getAllProducts(@RequestParam(required = true) Long productId, @RequestParam(required = true) Long brandId, @RequestParam(required = true) String startDate) {
		try {
			List<Product> products = new ArrayList<Product>();
			List<Getproducts200Response> productsResponse = new ArrayList<Getproducts200Response>();

			if (productId == null || brandId == null || startDate == null || startDate.isEmpty() )
				return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
			else
				products = productService.findProductByProductIdAndBrandIdAndStartDate(productId, brandId, startDate);
			
			if(!products.isEmpty()) {
				products.forEach( product -> {productsResponse.add(new Getproducts200Response(product));} );
			}else 
				return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		
			return new ResponseEntity<>(productsResponse, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	


}
