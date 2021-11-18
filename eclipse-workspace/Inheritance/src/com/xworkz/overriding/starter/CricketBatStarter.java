package com.xworkz.overriding.starter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.overriding.CricketBat;
import com.xworkz.overriding.TypeBat;

public class CricketBatStarter {

	public static void main(String[] args) {

		CricketBat bat = new CricketBat();
		bat.setCompanyName("WOLFER ");
		bat.setType(TypeBat.GM);
		bat.setPrice(5000.0f);
		bat.setWood("willow wood");

		CricketBat bat1 = new CricketBat();
		bat1.setCompanyName("Adidas");
		bat1.setType(TypeBat.MRF);
		bat1.setPrice(4000.0f);
		bat1.setWood("willow wood");

		bat.equals(bat1);

		String s = bat.toString();
		System.out.println(s);

		int code = bat1.hashCode();
		System.out.println(code);

		Class clazz = bat.getClass();
		System.out.println(clazz.getName());
		System.out.println(clazz.getPackage());
		System.out.println(clazz.getSuperclass());
		System.out.println(clazz.getMethods().length);
		System.out.println(clazz.getFields().length);
		System.out.println(clazz.getConstructors().length);

		Constructor[] constructors = clazz.getConstructors();

		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterCount());

		}

		Method[] methods = clazz.getMethods();

		for (int j = 0; j < methods.length; j++) {
			Method method = methods[j];
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getModifiers());

		}

	}

}
