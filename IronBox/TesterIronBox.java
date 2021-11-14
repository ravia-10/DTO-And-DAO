package com.xworkz.IronBox;

import com.xworkz.IronBox.DAO.IronBoxDAO;
import com.xworkz.IronBox.DTO.IronBoxDTO;

public class TesterIronBox {

	public static void main(String[] args) {
		 IronBoxDAO dao = new IronBoxDAO();
		 
		IronBoxDTO  Bajaj = new IronBoxDTO("Bajaj",4000,"green","Automatic",2.5d);
		dao.saveIronBOX(Bajaj);
		
		IronBoxDTO  philips = new IronBoxDTO("Philips",6000,"white","Manual",3.01d);
		dao.saveIronBOX(philips);
		
		IronBoxDTO  Usha  = new IronBoxDTO("Usha",4500,"sliver","Manual",2.98d);
		dao.saveIronBOX(Usha );
		
		IronBoxDTO Daisy = new IronBoxDTO("Daisy",2800,"blue","Automatic",3.4d);
		dao.saveIronBOX(Daisy);
		
		IronBoxDTO  Eveready= new IronBoxDTO("Eveready",4000,"green","Automatic",3.9d);
		dao.saveIronBOX(Eveready);
		
		dao.displayAll();
		dao.displayByBrandName("Daisy");
		
		dao.updateByBrandName("Daisy","mega");
		dao.displayByBrandName("Daisy");
		
		dao.displayAll();
		dao.deleteByBrandName("Daisy");
		dao.displayAll();

	}

}
