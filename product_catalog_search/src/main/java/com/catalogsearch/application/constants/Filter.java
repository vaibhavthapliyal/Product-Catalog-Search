package com.catalogsearch.application.constants;

public enum Filter {
	COLOR("color"), BRAND("brand"), SIZE("size"), PRICE("price");
	
	
	private String value;
	
	public String getValue() {
		return value;
	}

	Filter(String name) {
		
	}
}
