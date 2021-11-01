package com.xworkz.dto;

public class CoffeeDto {
	
	private String brand;
	private String type;
	private int cost;
	private int quantity;
	private String flavour;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	
	public CoffeeDto() {
		
	}
	
	
	
	public CoffeeDto(String brand, String type, int cost, int quantity, String flavour) {
		
		this.brand = brand;
		this.type = type;
		this.cost = cost;
		this.quantity = quantity;
		this.flavour = flavour;
	}
	
	
	

}
