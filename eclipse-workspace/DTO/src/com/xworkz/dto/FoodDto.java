package com.xworkz.dto;

public class FoodDto {
	private int id;
	private String name;
	private Type type;
	private double price;
	private int quantity;
	
	
	public FoodDto() {
		
	}
		
	
	public FoodDto(int id, String name, Type type, double price, int quantity) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}




	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
