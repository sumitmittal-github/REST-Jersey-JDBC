package com.sumit.jerseydemo.restcontroller;

import java.util.List;

import com.sumit.jerseydemo.model.Product;
import com.sumit.jerseydemo.service.ProductService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/product")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class ProductController {
	
	ProductService productService = new ProductService();

	@GET
	@Path("/list")
    public List<Product> getProductList() {
		System.out.println("getProductList ...");
		return productService.getProductList();
    }

	@GET
	@Path("/{id}")
    public Product getProductById(@PathParam("id") int id) {
		System.out.println("getProductById ... id = "+id);
		return productService.getProductById(id);
    }
	
	@POST
    public Product createProduct(Product product) {
		System.out.println("createProduct ... product = "+product);
		return productService.createProduct(product);
    }

	@PUT
    public Product updateProduct(Product product) {
		System.out.println("updateProduct ... product = "+product);
		return productService.updateProduct(product);
    }

}