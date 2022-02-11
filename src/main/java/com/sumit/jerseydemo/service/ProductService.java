package com.sumit.jerseydemo.service;

import java.util.List;

import com.sumit.jerseydemo.model.Product;
import com.sumit.jerseydemo.repository.ProductRepository;

public class ProductService {
	
	ProductRepository productRepository = new ProductRepository();
	
	public List<Product> getProductList() {
		return productRepository.getProductList();
    }

	public Product getProductById(int id) {
		return productRepository.getProductById(id);
    }

	public Product createProduct(Product product) {
		return productRepository.createProduct(product);
	}	

	public Product updateProduct(Product product) {
		return productRepository.updateProduct(product);
	}
}