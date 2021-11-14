package com.xworkz.Clock.DAO;

import com.xworkz.Clock.DTO.ClockDTO;

public class ClockDAO {

	ClockDTO clockArray[] = new ClockDTO[5];
	int index = 0;

	public ClockDAO() {
		System.out.println("dao is created");
	}

	public void saveClock(ClockDTO dto) {
		System.out.println("save method ");
		System.out.println();
		clockArray[index] = dto;
		index++;

	}

	public void displayAll() {
		System.out.println("display method is called");
		System.out.println();
		for (int i = 0; i < clockArray.length; i++) {
			if (clockArray[i] != null) {
				System.out.println(clockArray[i].getBrand());
				System.out.println(clockArray[i].getShape());
				System.out.println(clockArray[i].getColor());
				System.out.println(clockArray[i].getPrice());
				System.out.println("-----------------------");

			}

		}
	}


	public void displayByBrandName(String brand) {

		System.out.println("display by Name method invoked");
		System.out.println();
		for (int i = 0; i < clockArray.length; i++) {
			if (clockArray[i].getBrand().equals(brand)) {

				System.out.println(clockArray[i].getShape());
				System.out.println(clockArray[i].getBrand());
				System.out.println(clockArray[i].getColor());
				System.out.println(clockArray[i].getPrice());
				System.out.println("-------------------");
				System.out.println();
			}
		}
	}

	public void updateByBrandName(String brand, int newPrice) {
		System.out.println();
		System.out.println("update method invoked");
		for (int i = 0; i < clockArray.length; i++) {
			if (clockArray[i].getBrand().equals(brand)) {
				clockArray[i].setPrice(newPrice);
				System.out.println("updated succesfuly");

			}
		}

	}

	public void deleteByBrandName(String brand) {
		System.out.println();
		System.out.println("delete method invoked");
		for (int i = 0; i < clockArray.length; i++) {
			if (clockArray[i].getBrand().equals(brand)) {
				clockArray[i] = null;
				System.out.println("item is deleted");

			}

		}

	}
}
