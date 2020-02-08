package com.how2j.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2j.springcloud.client.ProductClientFeign;
import com.how2j.springcloud.pojo.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductClientFeign productClientFeign;
	
	public List<Product> listProducts(){
		return productClientFeign.listProducts();
	}

}
