package com.sumit.jerseydemo.service;

import java.util.List;

import com.sumit.jerseydemo.model.Product;
import com.sumit.jerseydemo.repository.ProductRepository;

public class ProductService {
	
	ProductRepository productRepository = new ProductRepository();
	
	public List<Product> getProductList() {
		return productRepository.getProductList();
    }

	public Product getProductById(long id) {
		return productRepository.getProductById(id);
    }

	public void createProduct(Product product) {
		productRepository.createProduct(product);
	}	
	
}