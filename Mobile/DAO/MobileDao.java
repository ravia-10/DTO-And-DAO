package com.xworkz.Mobile.DAO;

import com.xworkz.Mobile.DTO.MobileDto;

public class MobileDao {
	
	public void displayMobileDao(MobileDto obj) {
		System.out.println("inside the display method");
		System.out.println(obj.getBrand());
		System.out.println(obj.getModel());
		System.out.println(obj.getPrice());
		System.out.println(obj.getColor());

	}

	
	
	public  MobileDto displayMobileDto(String brand , String model , int price, String color ) {
		System.out.println("inside the displayMobileDto");
		MobileDto mobileDto = new MobileDto(brand, model, price, color);
		return mobileDto;
		
	}
	
	public void mobileArray(MobileDto mobileArray[]){
			System.out.println();
		System.out.println("inside the array method");
		System.out.println();
		for (int i = 0; i < mobileArray.length; i++) {
			System.out.println(mobileArray[i].getBrand());
			System.out.println(mobileArray[i].getModel());
			System.out.println(mobileArray[i].getPrice());
			System.out.println(mobileArray[i].getColor());
			System.out.println();
			
		}
	}
}
