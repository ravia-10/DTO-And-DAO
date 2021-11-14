package com.xworkz.JunctionBox.DTO;

public class JunctionBoxDTO {
	private String Brand;
	private String Color;
	private String Shape;
	private int noOfPins;
	private double length;
	private int price;

	public JunctionBoxDTO(String brand, String color, String shape,int noOfPins, double length, int price) {
		System.out.println("dto is created");
		Brand = brand;
		Color = color;
		Shape = shape;
		this.noOfPins = noOfPins;
		this.length = length;
		this.price = price;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getShape() {
		return Shape;
	}

	public void setShape(String shape) {
		Shape = shape;
	}

	public int getNoOfPins() {
		return noOfPins;
	}

	public void setNoOfPins(int noOfPins) {
		this.noOfPins = noOfPins;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
