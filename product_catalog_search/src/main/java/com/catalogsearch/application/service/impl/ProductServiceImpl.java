package com.catalogsearch.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogsearch.application.constants.Filter;
import com.catalogsearch.application.entity.Product;
import com.catalogsearch.application.repository.ProductRepository;
import com.catalogsearch.application.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	private ProductRepository repo;
	
	@Override
	public List<Product> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Product> searchProducts(String filter, String value) {
		Filter groupBy = Filter.valueOf(filter.toUpperCase());
		switch (groupBy) {
		case BRAND:
			return repo.findByBrandId(Integer.valueOf(value));
		case COLOR:
			return repo.findByColorId(Integer.valueOf(value));
		case SIZE:
			return repo.findBySize(value);
		case PRICE:
			return repo.findByPrice(Double.valueOf(value));
		default:
			return null;
		}
	}

}
