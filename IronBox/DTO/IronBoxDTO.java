package com.xworkz.IronBox.DTO;

public class IronBoxDTO {

	private String brand;
	private int price;
	private String color;
	private String type;
	double lenght;

	public IronBoxDTO(String brand, int price, String color, String type, double lenght) {
		System.out.println("dto is created");
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
		this.lenght = lenght;
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

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

}
