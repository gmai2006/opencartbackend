package com.opencart.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.sql.Timestamp;
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
	
	/**
	 * `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `model` varchar(64) NOT NULL,
  `sku` varchar(64) NOT NULL,
  `upc` varchar(12) NOT NULL,
  `ean` varchar(14) NOT NULL,
  `jan` varchar(13) NOT NULL,
  `isbn` varchar(17) NOT NULL,
  `mpn` varchar(64) NOT NULL,
  `location` varchar(128) NOT NULL,
  `quantity` int(4) NOT NULL DEFAULT '0',
  `stock_status_id` int(11) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `manufacturer_id` int(11) NOT NULL,
  `shipping` tinyint(1) NOT NULL DEFAULT '1',
  `price` decimal(15,4) NOT NULL DEFAULT '0.0000',
  `points` int(8) NOT NULL DEFAULT '0',
  `tax_class_id` int(11) NOT NULL,
  `date_available` date NOT NULL DEFAULT '0000-00-00',
  `weight` decimal(15,8) NOT NULL DEFAULT '0.00000000',
  `weight_class_id` int(11) NOT NULL DEFAULT '0',
  `length` decimal(15,8) NOT NULL DEFAULT '0.00000000',
  `width` decimal(15,8) NOT NULL DEFAULT '0.00000000',
  `height` decimal(15,8) NOT NULL DEFAULT '0.00000000',
  `length_class_id` int(11) NOT NULL DEFAULT '0',
  `subtract` tinyint(1) NOT NULL DEFAULT '1',
  `minimum` int(11) NOT NULL DEFAULT '1',
  `sort_order` int(11) NOT NULL DEFAULT '0',
  `status` tinyint(1) NOT NULL DEFAULT '0',
  `viewed` int(5) NOT NULL DEFAULT '0',
  `date_added` datetime NOT NULL,
  `date_modified` datetime NOT NULL,
  PRIMARY KEY (`product_id`)
	 */
	private OcProduct createProduct(File name) {
		
		logger.info("Start creatingp product " + name);
		
		Date d = new Date();
		OcProduct product = new OcProduct();
		product.setModel(generateName(name));
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
	
	/**
	 * `product_id` int(11) NOT NULL,
  `language_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` text NOT NULL,
  `tag` text NOT NULL,
  `meta_title` varchar(255) NOT NULL,
  `meta_description` varchar(255) NOT NULL,
  `meta_keyword` varchar(255) NOT NULL,
  PRIMARY KEY (`product_id`,`language_id`),
  KEY `name` (`name`)
	 * @param product
	 * @return
	 */
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
		Date d = new Date();
		Date future = new Date(System.currentTimeMillis() + 72000);
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
		final Map<String, Integer> mapproducts = buildProductMap(products);
		final Map<String, Integer> mapcat = buildCategoryMap(categories);
		
		Map<String, String> assoc = readProperties(associationFile);
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
	
	private Map<String, String> readProperties(File file) {
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
	
	private Map<String, Integer> buildProductMap(List<OcProduct> products) {
		return products.stream()
		.collect(Collectors.toMap(
				e -> (String) e.getModel().toLowerCase(),
				e -> (Integer) e.getProductId()
			));
	}
	
	private Map<String, Integer> buildCategoryMap(List<OcCategory> categories) {
		return categories
				.stream()
				.collect(Collectors.toMap(
			e -> (String) e.getImage(),
			e -> (Integer) e.getCategoryId()
		));
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
	
	private static String generateName(File file) {
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
