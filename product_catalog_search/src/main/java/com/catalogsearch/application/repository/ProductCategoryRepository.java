package com.catalogsearch.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogsearch.application.entity.ProductCategory;

@Repository
public interface ProductCategoryRepository 
        extends JpaRepository<ProductCategory, Integer> {
 
}
