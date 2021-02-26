package com.catalogsearch.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogsearch.application.entity.ProductCategory;
import com.catalogsearch.application.repository.ProductCategoryRepository;
import com.catalogsearch.application.service.IProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements IProductCategoryService{

	@Autowired
	private ProductCategoryRepository repo;
	
	@Override
	public List<ProductCategory> findAll() {
		return repo.findAll();
	}

}
