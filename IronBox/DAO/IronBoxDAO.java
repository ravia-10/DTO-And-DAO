package com.xworkz.IronBox.DAO;

import com.xworkz.IronBox.DTO.IronBoxDTO;

public class IronBoxDAO {

	public IronBoxDAO() {
		System.out.println("dao is created");
	}

	IronBoxDTO ironBoxArray[] = new IronBoxDTO[5];
	int index = 0;

	public void saveIronBOX(IronBoxDTO dto) {
		System.out.println("save method ");
		System.out.println();
		ironBoxArray[index] = dto;
		index++;

	}

	public void displayAll() {
		System.out.println("display method is called");
		System.out.println();
		for (int i = 0; i < ironBoxArray.length; i++) {
			if (ironBoxArray[i] != null) {
				System.out.println(ironBoxArray[i].getBrand());
				System.out.println(ironBoxArray[i].getColor());
				System.out.println(ironBoxArray[i].getPrice());
				System.out.println(ironBoxArray[i].getType());
				System.out.println(ironBoxArray[i].getLenght());
				System.out.println("-----------------------");

			}

		}
	}

	public void displayByBrandName(String brand) {

		System.out.println("display by Name method invoked");
		System.out.println();
		for (int i = 0; i < ironBoxArray.length; i++) {
			if (ironBoxArray[i].getBrand().equals(brand)) {
				
				System.out.println(ironBoxArray[i].getBrand());
				System.out.println(ironBoxArray[i].getColor());
				System.out.println(ironBoxArray[i].getPrice());
				System.out.println(ironBoxArray[i].getType());
				System.out.println(ironBoxArray[i].getLenght());
				System.out.println("-------------------");
				System.out.println();
			}
		}
	}

	public void updateByBrandName(String brand, String newType) {
		System.out.println();
		System.out.println("update method invoked");
		for (int i = 0; i < ironBoxArray.length; i++) {
			if (ironBoxArray[i].getBrand().equals(brand)) {
				ironBoxArray[i].setType(newType);
				System.out.println("updated succesfuly");

			}
		}

	}

	public void deleteByBrandName(String brand) {
		System.out.println();
		System.out.println("delete method invoked");
		for (int i = 0; i < ironBoxArray.length; i++) {
			if (ironBoxArray[i].getBrand().equals(brand)) {
				ironBoxArray[i] = null;
				System.out.println("item is deleted");

			}

		}

	}

}
