package com.code.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id")
	private int product_id;
	@Column(name="name", nullable=false, length=20)
	private String name;
	@Column(name="price", nullable=false)
	private double price;
	@Column(name="stockQuantity", nullable=false)
	private int  stockQuantity;
	
	@ManyToOne
	@JoinColumn(name="categoryid")
	private Category category;
	
	
	public Product() {
		this.name= null;
		this.price=0.0;
		this.stockQuantity=0;
		this.category=null;
		
	}


	public Product(String name, double price, int stockQuantity, Category category) {
		super();
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.category = category;
	}


	public int getId() {
		return product_id;
	}


	public void setId(int id) {
		this.product_id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStockQuantity() {
		return stockQuantity;
	}


	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [id=" + product_id + ", name=" + name + ", price=" + price + ", stockQuantity=" + stockQuantity
				+ ", category=" + category + "]";
	}
	
	
	
	
	
	
	
	
}
