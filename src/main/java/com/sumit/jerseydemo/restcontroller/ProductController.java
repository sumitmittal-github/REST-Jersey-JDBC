package com.sumit.jerseydemo.restcontroller;

import java.util.List;

import com.sumit.jerseydemo.model.Product;
import com.sumit.jerseydemo.service.ProductService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
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
		return productService.getProductList();
    }

	@GET
	@Path("/{id}")
    public Product getProductById(@PathParam("id") long id) {
		return productService.getProductById(id);
    }
	
	@POST
    public void createProduct(Product product) {
		productService.createProduct(product);
    }

}