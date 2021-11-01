package com.xworkz.dto;

public class StatueDto {
	
	private String name;
	private float height;
	private float width;
	private String location;
	private String materialUsed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMaterialUsed() {
		return materialUsed;
	}
	public void setMaterialUsed(String materialUsed) {
		this.materialUsed = materialUsed;
	}
	
	
	public StatueDto(String name, float height, float width, String location, String materialUsed) {
		
		this.name = name;
		this.height = height;
		this.width = width;
		this.location = location;
		this.materialUsed = materialUsed;
	}
	
	
	public StatueDto() {
		
	}
	
}
