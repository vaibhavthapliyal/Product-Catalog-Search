package com.catalogsearch.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogsearch.application.entity.Brand;
import com.catalogsearch.application.repository.BrandRepository;
import com.catalogsearch.application.service.IBrandService;

@Service
public class BrandServiceImpl implements IBrandService{
	
	@Autowired
	private BrandRepository repo;

	@Override
	public List<Brand> findAll() {
		return repo.findAll();
	}

}
