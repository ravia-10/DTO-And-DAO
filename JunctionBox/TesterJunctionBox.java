package com.xworkz.JunctionBox;

import com.xworkz.JunctionBox.DAO.JunctionBoxDAO;
import com.xworkz.JunctionBox.DTO.JunctionBoxDTO;

public class TesterJunctionBox {

	public static void main(String[] args) {
		JunctionBoxDAO dao = new JunctionBoxDAO();
		
		JunctionBoxDTO  stone = new JunctionBoxDTO("stone","white","rectangle",4,9.8d,350);
		dao.saveJunctionBOX(stone);
		
		JunctionBoxDTO   fant = new JunctionBoxDTO("fant","green","round",2,5.6d,200);
		dao.saveJunctionBOX(fant);
		
		JunctionBoxDTO  elmex = new JunctionBoxDTO("Elmex","red","circle",5,12.66d,400);
		dao.saveJunctionBOX(elmex);
		
		JunctionBoxDTO  hatsun = new JunctionBoxDTO("Hatsun","grey","rectangle",6,10.8d,560);
		dao.saveJunctionBOX(hatsun);
		
		JunctionBoxDTO  leader= new JunctionBoxDTO("Leader"," balck","square",4,11.223d,800);
		dao.saveJunctionBOX(leader);
		
		dao.displayAll();
		dao.displayByBrandName("Leader");
		
		dao.updateByBrandName("Leader",6);
		dao.displayAll();
		
		dao.deleteByBrandName("Leader");
		dao.displayAll();
	}

}
