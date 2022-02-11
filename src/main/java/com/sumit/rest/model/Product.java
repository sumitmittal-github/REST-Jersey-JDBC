package com.sumit.rest.model;

import java.util.Date;
import java.util.Objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	/*
	CREATE TABLE product (
	    id INT AUTO_INCREMENT PRIMARY KEY,
	    name VARCHAR(255) NOT NULL,
	    image_url VARCHAR(255),
	    price DOUBLE NOT NULL,
	    quantity INT default 0,
	    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
	)  ENGINE=INNODB;
	*/

	private Integer id;
	private String name;
	private String imageUrl;
	private Double price;
	private Integer quantity;
	private Date createdAt;
	
	
	public Product() {
	}

	public Product(Integer id, String name, String imageUrl, Double price, Integer quantity, Date createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.quantity = quantity;
		this.createdAt = createdAt;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, imageUrl, name, price, quantity, createdAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(imageUrl, other.imageUrl)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(createdAt, other.createdAt);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", price=" + price + ", quantity=" + quantity + ", createdAt=" + createdAt + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}