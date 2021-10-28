package com.crud.car;
import com.crud.car.operator.CarModel;

public class CarStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarModel model=new CarModel();
		
		model.add(null);
		model.add("Baleno");
		model.add("Swift");
		model.add("KIA");
		model.add("Ertiga");
		model.add("Duster");
		model.add("Innova");

		model.display();
	}

}
