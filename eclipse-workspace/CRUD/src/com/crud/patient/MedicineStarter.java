package com.crud.patient;
import com.crud.patient.operator.MedicineOperator;

public class MedicineStarter {
  public static void main(String[] args)
{
	MedicineOperator medicine=new MedicineOperator();
	
	medicine.add("Acitrome");
	medicine.add(null);
	
	medicine.display();
	
	medicine.add("Paracetamol");
	medicine.add("dextromethorphan");
	medicine.add("Echinacea");
	medicine.add("Afrin");
	
	medicine.display();
	
	
}

} 
