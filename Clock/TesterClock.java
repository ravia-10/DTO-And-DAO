package com.xworkz.Clock;

import com.xworkz.Clock.DAO.ClockDAO;
import com.xworkz.Clock.DTO.ClockDTO;

public class TesterClock {

	public static void main(String[] args) {
		
		ClockDAO  dao = new ClockDAO();
		
		ClockDTO  quartz = new ClockDTO("quatrz","cricle","yellow",1200);
		dao.saveClock(quartz);
		
		ClockDTO  ajanta = new ClockDTO("Ajanta","square"," white",1000);
		dao.saveClock(ajanta);
		
		ClockDTO  random = new ClockDTO("Random","star","sliver",1500);
		dao.saveClock(random);
		
		ClockDTO titan = new ClockDTO("Titan","cricle"," gold",1200);
		dao.saveClock(titan);
		
		ClockDTO  chumbak = new ClockDTO("Chumbak","diamond","white",800);
		dao.saveClock(chumbak);
		
		dao.displayAll();
		dao.displayByBrandName("Random");
		
		dao.updateByBrandName("Random", 2000);
		dao.displayByBrandName("Random");
		
		dao.deleteByBrandName("Random");
		dao.displayAll();
		
		
	}

}
