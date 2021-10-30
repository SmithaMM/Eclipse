package com.xworkz.dto;

public class ChargerDto {
	private String brand;
	private int price;
	private String color;
	private String type;
	private int quantity;
	
	public ChargerDto()
	{
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ChargerDto(String brand, int price, String color, String type, int quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
		this.quantity = quantity;
	}
	
	

}
