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

import com.catalogsearch.application.entity.Brand;
import com.catalogsearch.application.exception.CatalogSearchException;
import com.catalogsearch.application.service.IBrandService;

@RestController
@RequestMapping("/api/brands")
public class BrandController {

	@Autowired
	IBrandService brandService;

	@GetMapping
	public ResponseEntity<List<Brand>> findAll() {
		List<Brand> brands = brandService.findAll();
		
		if(CollectionUtils.isEmpty(brands)) {
			throw new CatalogSearchException("Brands Not Found");
		}
		
		return new ResponseEntity<List<Brand>>(brands, new HttpHeaders(), HttpStatus.OK);
	}
}
