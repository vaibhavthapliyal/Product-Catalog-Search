package com.catalogsearch.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.catalogsearch.application.entity.Brand;

@Repository
public interface BrandRepository 
        extends JpaRepository<Brand, Integer> {
 
}
