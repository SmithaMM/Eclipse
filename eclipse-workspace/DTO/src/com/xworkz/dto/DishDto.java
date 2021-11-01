package com.xworkz.dto;

public class DishDto {
	
	private String name;
	private int price;
	private int quantity;
	private String type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public DishDto() {
		
	}
	
	
	public DishDto(String name, int price, int quantity, String type) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		
	}
	
	
	

}
