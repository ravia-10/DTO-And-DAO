package com.xworkz.JunctionBox.DAO;

import com.xworkz.JunctionBox.DTO.JunctionBoxDTO;

public class JunctionBoxDAO {

	public JunctionBoxDAO() {
		System.out.println("dao is created");
	}

	JunctionBoxDTO junctionBoxArray[] = new JunctionBoxDTO[5];
	int index = 0;

	public void saveJunctionBOX(JunctionBoxDTO dto) {
		System.out.println("save method ");
		System.out.println();
		junctionBoxArray[index] = dto;
		index++;

	}

	public void displayAll() {
		System.out.println("display method is called");
		System.out.println();
		for (int i = 0; i < junctionBoxArray.length; i++) {
			if (junctionBoxArray[i] != null) {
				System.out.println(junctionBoxArray[i].getBrand());
				System.out.println(junctionBoxArray[i].getColor());
				System.out.println(junctionBoxArray[i].getLength());
				System.out.println(junctionBoxArray[i].getNoOfPins());
				System.out.println(junctionBoxArray[i].getShape());
				System.out.println(junctionBoxArray[i].getPrice());
				System.out.println("-----------------------");

			}

		}
	}

	public void displayByBrandName(String brand) {

		System.out.println("display by Name method invoked");
		System.out.println();
		for (int i = 0; i < junctionBoxArray.length; i++) {
			if (junctionBoxArray[i].getBrand().equals(brand)) {
				System.out.println(junctionBoxArray[i].getBrand());
				System.out.println(junctionBoxArray[i].getColor());
				System.out.println(junctionBoxArray[i].getLength());
				System.out.println(junctionBoxArray[i].getNoOfPins());
				System.out.println(junctionBoxArray[i].getShape());
				System.out.println(junctionBoxArray[i].getPrice());
				System.out.println("-----------------------");
				System.out.println();
			}
		}
	}

	public void updateByBrandName(String brand, int newNoOfPins) {
		System.out.println();
		System.out.println("update method invoked");
		for (int i = 0; i < junctionBoxArray.length; i++) {
			if (junctionBoxArray[i].getBrand().equals(brand)) {
				junctionBoxArray[i].setNoOfPins(newNoOfPins);
				System.out.println("updated succesfuly");

			}
		}

	}

	public void deleteByBrandName(String brand) {
		System.out.println();
		System.out.println("delete method invoked");
		for (int i = 0; i < junctionBoxArray.length; i++) {
			if (junctionBoxArray[i].getBrand().equals(brand)) {
				junctionBoxArray[i] = null;
				System.out.println("item is deleted");

			}

		}

	}

}
