package com.opencart;

import java.util.Arrays;

import org.junit.Test;

import com.opencart.dao.DataImporter;

import junit.framework.Assert;

public class TestDataImporter {
	
	@Test
	public void testString() {
		Assert.assertTrue("butterfly.jpg".contains("butterfly"));
	}
	
	@Test
	public void testStream() {
		StringBuilder builder = new StringBuilder();
		String[] tokens = "test_test2".split("_");
		
		Arrays.asList(tokens).stream()
		.forEach(s -> {
			builder.append(s.substring(0, 1).toUpperCase() 
					+ s.substring(1).toLowerCase()
					+ " ");
		});
		System.out.println(builder.toString());
	}
}
