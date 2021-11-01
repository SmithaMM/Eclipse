package com.xworkz.dto;

public class SolarDto {
	private String brand;
	private int price;
	private int noOfPanels;
	private String cellType;
	private int powerTolerence;
	
	public SolarDto() {
	
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

	public int getNoOfPanels() {
		return noOfPanels;
	}

	public void setNoOfPanels(int noOfPanels) {
		this.noOfPanels = noOfPanels;
	}

	public String getCellType() {
		return cellType;
	}

	public void setCellType(String cellType) {
		this.cellType = cellType;
	}

	public int getPowerTolerence() {
		return powerTolerence;
	}

	public void setPowerTolerence(int powerTolerence) {
		this.powerTolerence = powerTolerence;
	}

	public SolarDto(String brand, int price, int noOfPanels, String cellType, int powerTolerence) {
		super();
		this.brand = brand;
		this.price = price;
		this.noOfPanels = noOfPanels;
		this.cellType = cellType;
		this.powerTolerence = powerTolerence;
	}
	
}
