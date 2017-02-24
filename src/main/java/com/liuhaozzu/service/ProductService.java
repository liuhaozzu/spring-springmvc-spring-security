package com.liuhaozzu.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuhaozzu.dao.ProductDao;

@Service("productService")
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	public Map<String, String> getProduct(String id){
		return productDao.getProduct(id);
	}
}
