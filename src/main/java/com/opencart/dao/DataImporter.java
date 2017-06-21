package com.opencart.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opencart.model.OcCategory;
import com.opencart.model.OcCategoryDescription;
import com.opencart.model.OcCategoryPath;
import com.opencart.model.OcCategoryToStore;
import com.opencart.model.OcProduct;
import com.opencart.model.OcProductDescription;
import com.opencart.model.OcProductImage;
import com.opencart.model.OcProductSpecial;
import com.opencart.model.OcProductToCategory;
import com.opencart.model.OcProductToStore;

public class DataImporter {
	private static Log logger = LogFactory.getLog(DataImporter.class);
	GenericDao dao;
	
	public DataImporter() {
		dao = new GenericDaoImpl();
	}
	
	
	private List<OcCategory> createCategories(File file) {
		List<OcCategory> result = new ArrayList<>();
		try {
		List<String> list = 
				Files.readAllLines(file.toPath(), Charset.defaultCharset() );
		
//		System.out.println("entered list " + list);
//		
		result = list.stream()
				.map(s -> s.trim())
				.map(this::createCategory)
				.map(this::createAssociations)
				.collect(Collectors.toList());
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
	
	private OcCategory createCategory(String name) {
		logger.info("category name " + name);
		
		 Timestamp d = new Timestamp(new Date().getTime());
		OcCategory cat = new OcCategory();
		cat.setStatus(true);
		cat.setTop(true);
		cat.setColumn(0);
		cat.setDateAdded(d);
		cat.setImage(name);//workaround and use it for description name
		cat.setDateModified(d);
		cat.setSortOrder(1);
		cat.setParentId(0);
		
		dao.create(cat);
		return cat;
	}
	
	private OcCategory createAssociations(OcCategory cat) {
		createCategoryDescr(cat);
		createCategorytoStore(cat);
		createCategoryPath(cat);
		return cat;
	}
	
	private OcCategoryDescription createCategoryDescr(OcCategory cat) {
		OcCategoryDescription desc = new OcCategoryDescription();
		desc.setCategoryId(cat.getCategoryId());
		desc.setLanguageId(1);
		desc.setName(cat.getImage());
		desc.setDescription(cat.getImage());
		desc.setMetaTitle(cat.getImage());
		desc.setMetaDescription("");
		desc.setMetaKeyword(cat.getImage());
		dao.create(desc);
		return desc;
	}
	
	private OcCategory createCategoryPath(OcCategory cat) {
		OcCategoryPath path = new OcCategoryPath();
		path.setCategoryId(cat.getCategoryId());
		path.setPathId(cat.getCategoryId());
		path.setLevel(1);
		dao.create(path);
		return cat;
	}
	
	private OcCategoryToStore createCategorytoStore(OcCategory cat) {
		 OcCategoryToStore store = new OcCategoryToStore();
		 store.setCategoryId(cat.getCategoryId());
		 
		 store.setStoreId(0);
		 dao.create(store);
		return store;
	}
	
	public List<OcProduct> createProducts(File dir) {
		return Arrays.stream(dir.listFiles())
		.filter(f -> f.getName().endsWith(".jpg") || f.getName().endsWith(".png"))
		.map(this::createProduct)
		.map(this::createProductDescr)
		.map(this::createProducttoStore)
		.map(this::createProductImage)
		.map(this::createProductSpecial)
		.collect(Collectors.toList());
	}
	
	private OcProduct createProduct(File name) {
		
		logger.info("Start creatingp product " + name);
		
		Date d = new Date();
		OcProduct product = new OcProduct();
		product.setModel(DAOUtils.generateName(name));
		product.setUpc("");
		product.setEan("");
		product.setJan("");
		product.setIsbn("");
		product.setMpn("");
		product.setLocation("");
		product.setQuantity(50);
		product.setStockStatusId(1);
		product.setImage("catalog/images/" + name.getName());
		product.setManufacturerId(1);
		product.setPrice(4.5F);
		product.setTaxClassId(1);
		product.setViewed(0);
		product.setWeightClassId(0);
		product.setLengthClassId(0);
		product.setPoints(0);
		product.setSku("");
		product.setSortOrder(2);
		product.setStatus(true);
		product.setDateAvailable(d);
		product.setDateAdded(new Timestamp(d.getTime()));
		product.setDateModified(new Timestamp(d.getTime()));
		product = dao.create(product);
		
		return product;
	}
	
	private OcProduct createProductDescr(OcProduct product) {
		OcProductDescription productDesc = new OcProductDescription();
		productDesc.setProductId(product.getProductId());
		productDesc.setLanguageId(1);
		productDesc.setName(product.getModel());
		productDesc.setDescription(product.getModel());
		productDesc.setMetaDescription(product.getModel());
		productDesc.setMetaKeyword(product.getModel());
		productDesc.setMetaTitle(product.getModel());
		productDesc.setTag(product.getModel());
		productDesc = dao.create(productDesc);
		
		return product;
	}
	
	private OcProduct createProducttoStore(OcProduct cat) {
		OcProductToStore store = new OcProductToStore();
		 store.setProductId(cat.getProductId());
		 store.setStoreId(0);
		 dao.create(store);
		return cat;
	}
	
	private OcProduct createProductSpecial(OcProduct cat) {
		LocalDate date2016 = LocalDate.of(2016, Month.FEBRUARY, 10);
		LocalDate date2018 = LocalDate.of(2018, Month.FEBRUARY, 10);
		
		Date d = Date.from(date2016.atStartOfDay(ZoneId.systemDefault()).toInstant());
		Date future = Date.from(date2018.atStartOfDay(ZoneId.systemDefault()).toInstant());
		OcProductSpecial special = new OcProductSpecial();
		special.setProductId(cat.getProductId());
		special.setCustomerGroupId(1);
		special.setPriority(1);
		special.setDateStart(d);
		special.setDateEnd(future);
		special.setPrice(4.5F);
		 dao.create(special);
		return cat;
	}
	
	private OcProduct createProductImage(OcProduct product) {
		OcProductImage productImage = new OcProductImage();
		productImage.setImage(product.getImage());
		productImage.setProductId(product.getProductId());
		productImage.setSortOrder(0);
		dao.create(productImage);
		return product;
	}
	

	private void createProduct2Category(List<OcProduct> products
			, List<OcCategory> categories
			, File associationFile)  {
		final Map<String, Integer> mapproducts = DAOUtils.buildProductMap(products);
		final Map<String, Integer> mapcat = DAOUtils.buildCategoryMap(categories);
		
		Map<String, String> assoc = DAOUtils.readProperties(associationFile);
		System.out.println("Start searching for product " + assoc.toString());
		assoc.keySet().stream().forEach(key -> {
			
			final Integer catkey = mapcat.get(key);
			
			if (null == catkey) throw new IllegalArgumentException("Invalid category please check your list: " + key);
			
			final String val = assoc.get(key);
			
			Arrays.stream(val.split(","))
			.map(String::toLowerCase)
			.map(String::trim)
			.map(token -> {
				System.out.println("Start searching for product " + token);
				List<OcProductToCategory> result = new ArrayList<>();
				result.addAll(createAssocs(token, mapproducts, catkey));
				return result;
				
			})
			.collect(Collectors.toList());
		});
		
	}
	
	private List<OcProductToCategory> createAssocs(String searchStr, Map<String, Integer> mapproducts,
			Integer catkey) {
		return mapproducts.keySet().stream()
		.filter(k -> k.contains(searchStr))
		.map(item -> {
			System.out.println("found matched " + searchStr);
			Integer productKey = mapproducts.get(item);
			OcProductToCategory assocs = new OcProductToCategory();
			assocs.setCategoryId(catkey);
			assocs.setProductId(productKey);
			dao.create(assocs);
			return assocs;
		})
		.collect(Collectors.toList());
	}
		
	public static void main(String[] args) {
		DataImporter etl = new DataImporter();
		
		long start = System.currentTimeMillis();
		
		File categoryFile = new File("./src/main/database/category.txt");
		List<OcCategory> categories = etl.createCategories(categoryFile);
		
		logger.info("Finished loading categories ");
		
		File dir = new File("/home/paul/Desktop/greeting_cards/");
		List<OcProduct> products = etl.createProducts(dir);
		
		File assocFile = new File("./src/main/database/category2product.txt");
		
		System.out.println(products.size());
		
		System.out.println(categories.size());
		
		etl.createProduct2Category(products, categories, assocFile);
		
		long end = System.currentTimeMillis();
		
		logger.info("loading data took " + (end - start)/1000);
		System.exit(0);
	}
	

}
