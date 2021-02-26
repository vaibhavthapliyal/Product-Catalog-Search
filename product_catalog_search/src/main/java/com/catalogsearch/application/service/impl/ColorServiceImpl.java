package com.catalogsearch.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalogsearch.application.entity.Color;
import com.catalogsearch.application.repository.ColorRepository;
import com.catalogsearch.application.service.IColorService;

@Service
public class ColorServiceImpl implements IColorService{

	@Autowired
	private ColorRepository repo;
	
	@Override
	public List<Color> findAll() {
		return repo.findAll();
	}

}
