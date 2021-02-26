package com.catalogsearch.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogsearch.application.entity.Product;
import com.catalogsearch.application.exception.CatalogSearchException;
import com.catalogsearch.application.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@Autowired
	IProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> products = productService.findAll();
		
		if(CollectionUtils.isEmpty(products)) {
			throw new CatalogSearchException("Products Not Found");
		}
		return new ResponseEntity<List<Product>>(products, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/filter/{filter}/{value}")
	public ResponseEntity<List<Product>> getProducts(@PathVariable String filter,
			@PathVariable String value) {
		List<Product> products = productService.searchProducts(filter, value);
		if(products==null || products.isEmpty()) 
			throw new CatalogSearchException("Product not found!");
		
		return new ResponseEntity<List<Product>>(products,
				new HttpHeaders(), HttpStatus.OK);
	}
}
