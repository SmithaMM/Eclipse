package com.xworkz.dto.starter;

import com.xworkz.dto.CementDto;
import com.xworkz.dto.dao.CementDAO;

public class CementDaoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CementDAO ref=new CementDAO();
		CementDto ref1=new CementDto("ACC", 400, 50, "HDPE", "Shimoga");
		CementDto ref2=new CementDto("ULTRATECH", 400, 50, "HDPE", "Shimoga");
		
		ref.add(ref1);
		ref.add(ref2);
		
		ref.delete(0);

	}

}
