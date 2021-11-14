package com.xworkz.PowerBank;

import com.xworkz.PowerBank.DAO.PowerBankDAO;
import com.xworkz.PowerBank.DTO.PowerBankDTO;



public class PowerBankTester {

	
	
	public static void main(String[] args) {
		
		
		System.out.println("inside main");
		PowerBankDAO dao= new PowerBankDAO();
		
		//dao.createPowerBank("mi",10000,"red",1200);
		PowerBankDTO mi=dao.createPowerBank("mi",10000,"red",1200);
		PowerBankDTO  oneplus = dao.createPowerBank("oneplus",10000,"black",2000);
		PowerBankDTO  sony = dao.createPowerBank("sony",15000,"yellow",1500);
		System.out.println();
		dao.displayPowerBankDAO(mi);
		System.out.println();
		dao.displayPowerBankDAO(oneplus);
		System.out.println();
		dao.displayPowerBankDAO(sony );
	
	}


}

