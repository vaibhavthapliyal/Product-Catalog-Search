package com.catalogsearch.application.service;

import java.util.List;

import com.catalogsearch.application.entity.ProductCategory;

public interface IProductCategoryService {
	List<ProductCategory> findAll();
}
