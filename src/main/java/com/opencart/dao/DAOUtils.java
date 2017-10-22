package com.opencart.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import com.opencart.model.OcCategory;
import com.opencart.model.OcProduct;

public class DAOUtils {
	
	public static Map<String, String> readProperties(File file) {
		Properties properties = new Properties();
		try {
			properties.load(new BufferedReader(new FileReader(file)));
		} catch (Exception ex) { ex.printStackTrace();}
		

		Map<String, String> map = properties.entrySet().stream().collect(
			    Collectors.toMap(
			        e -> (String) e.getKey(),
			        e -> (String) e.getValue()
			    ));
		return map;
	}
	
	public static Map<String, Integer> buildProductMap(List<OcProduct> products) {
		return products.stream()
		.collect(Collectors.toMap(
				e -> (String) e.getModel().toLowerCase().replace(" ", "_"),
				e -> (Integer) e.getProductId()
			));
	}
	
	public static Map<String, Integer> buildCategoryMap(List<OcCategory> categories) {
		return categories
				.stream()
				.collect(Collectors.toMap(
			e -> (String) e.getImage(),
			e -> (Integer) e.getCategoryId()
		));
	}
	
	public static String generateName(File file) {
		StringBuilder builder = new StringBuilder();
		String[] tokens = file.getName().split("_");
		
		Arrays.asList(tokens).stream()
		.forEach(s -> {
			builder.append(s.substring(0, 1).toUpperCase() 
					+ s.substring(1).toLowerCase()
					+ " ");
		});
		
		return builder.toString();
	}
}
