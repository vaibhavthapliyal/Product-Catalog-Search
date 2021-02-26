package com.catalogsearch.application.service;

import java.util.List;

import com.catalogsearch.application.entity.Product;

public interface IProductService {
	List<Product> findAll();

	List<Product> searchProducts(String filter, String value);
}
