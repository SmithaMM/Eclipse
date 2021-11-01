package com.xworkz.dto.starter;
import com.xworkz.dto.dao.StatueDAO;
import com.xworkz.dto.StatueDto;

public class StatueDaoStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StatueDAO statue=new StatueDAO();
		StatueDto statue1=new StatueDto("Thiruvalluvar Statue", 133.f, 0.0f, "Kanyakumari", "Rock");
		StatueDto statue2=new StatueDto("Statue of Unity", 597.0f, 0.0f, "Gujarat", "Bronze");
		
		statue.add(statue1);
		statue.add(statue2);

	}

}
