package com.pro.problems;

public class Product {
	String productName;
	String category;
	int price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productName, String category, int price) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", category=" + category + ", price=" + price + "]";
	}
	
	

}
