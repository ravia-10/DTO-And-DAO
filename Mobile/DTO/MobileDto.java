package com.xworkz.Mobile.DTO;

public class MobileDto {
	private String Brand;
	private String model;
	private int price;
	private String color;

	public MobileDto(String brand, String model, int price, String color) {
		System.out.println("inside the constructor of mobiledto");
		//System.out.println();
		this.Brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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

}
