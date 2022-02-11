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
		Product productDb = productRepository.getProductById(id);
		if(productDb != null)
			return productRepository.updateProduct(productDb);
		else
			return null;
    }

	public Product createProduct(Product product) {
		return productRepository.createProduct(product);
	}	

	public Product updateProduct(Product product) {
		Product productDb = productRepository.getProductById(product.getId());
		if(productDb != null)
			return productRepository.updateProduct(product);
		else
			return null;
	}
	
	public String deleteProduct(int id) {
		Product productDb = productRepository.getProductById(id);
		if(productDb != null) {
			productRepository.deleteProduct(id);
			return "Deleted successfully !!!";
		} else
			return "Invalid Id";
	}
}