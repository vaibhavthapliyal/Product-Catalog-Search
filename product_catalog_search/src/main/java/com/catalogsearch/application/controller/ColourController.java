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

import com.catalogsearch.application.entity.Color;
import com.catalogsearch.application.exception.CatalogSearchException;
import com.catalogsearch.application.service.IColorService;


@RestController
@RequestMapping("/api/colors")
public class ColourController {

	@Autowired
	IColorService colorService;

	@GetMapping
	public ResponseEntity<List<Color>> findAll() {
		List<Color> colors = colorService.findAll();
		
		if(CollectionUtils.isEmpty(colors)) {
			throw new CatalogSearchException("Colors Not Found");
		}
		
		return new ResponseEntity<List<Color>>(colors, new HttpHeaders(), HttpStatus.OK);
	}
}
