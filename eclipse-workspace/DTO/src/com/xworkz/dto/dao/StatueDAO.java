package com.xworkz.dto.dao;
import com.xworkz.dto.StatueDto;

public class StatueDAO {
	
	private StatueDto[] statueContainer=new StatueDto[2];
	private int count=0;
	
	public StatueDAO()
	{
		System.out.println("invoked StatueDAO with no-arg");
	}
	
    public void add(StatueDto statue )
    {
   	 if(this.count<this.statueContainer.length && statue!=null)
   	 {
   		 this.statueContainer[count]=statue;
   		 System.out.println("Index: ".concat(String.valueOf(count)).concat(" ").concat("NAME: ").concat(statue.getName()));
   	     count++; }


   	 else
   	 {
   		 System.out.println("Container is full or Passed null");
   	 }
    }

}
