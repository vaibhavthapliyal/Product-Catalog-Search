package com.catalogsearch.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CatalogSearchException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8425730281814240285L;
	
	public CatalogSearchException(String message) {
		super(message);
	}

}
