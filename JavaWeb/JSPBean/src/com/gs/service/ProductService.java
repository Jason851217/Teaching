package com.gs.service;

import java.util.List;

import com.gs.bean.Product;

public interface ProductService {

	public List<Product> queryAll();
	
	public Product queryById(int id);
	
	public void add(Product product);
	
}
