package com.xworkz.dto;

public class BlueToothDto {
	private String brand;
	private int price;
	private String color;
	private String bluetoothRange;
	private int quantity;
	
	public BlueToothDto() {
	
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

	public String getBluetoothRange() {
		return bluetoothRange;
	}

	public void setBluetoothRange(String bluetoothRange) {
		this.bluetoothRange = bluetoothRange;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BlueToothDto(String brand, int price, String color, String bluetoothRange, int quantity) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.bluetoothRange = bluetoothRange;
		this.quantity = quantity;
	}
	
	
	
	

}
