package com.xworkz.Mobile;

import com.xworkz.Mobile.DAO.MobileDao;
import com.xworkz.Mobile.DTO.MobileDto;

public class  MobileTester {

	public static void main(String[] args) {
		System.out.println("inside the main");
		System.out.println();
		MobileDao dao = new MobileDao();
		
		MobileDto Redmi =  new MobileDto("Redmi", "note7s", 12000, "red");
		MobileDto vivo =  new MobileDto("vivo", "v3", 14000, "white");
		MobileDto samsung =  new MobileDto("samsung", "A1", 18000,"black");
		MobileDto realme =  new MobileDto("realme", "6r", 19000,"sliver");
		MobileDto moto =  new MobileDto("moto", "motog4", 11000, "black");
		
		MobileDto mobileArray[] ={Redmi,vivo,samsung,realme,moto};
		
		dao.mobileArray(mobileArray);
		

	}

}
