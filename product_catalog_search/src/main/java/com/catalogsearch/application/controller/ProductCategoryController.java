package com.catalogsearch.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catalogsearch.application.entity.ProductCategory;
import com.catalogsearch.application.exception.CatalogSearchException;
import com.catalogsearch.application.service.IProductCategoryService;

@RestController
@RequestMapping("/api/productCategory")
public class ProductCategoryController {

	@Autowired
	IProductCategoryService productCategoryService;

	@GetMapping
	public ResponseEntity<List<ProductCategory>> findAll() {
		List<ProductCategory> productCategories = productCategoryService.findAll();
		
		if(CollectionUtils.isEmpty(productCategories)) {
			throw new CatalogSearchException("Product Categories Not Found");
		}
		
		return new ResponseEntity<List<ProductCategory>>(productCategories, new HttpHeaders(), HttpStatus.OK);
	}
}
