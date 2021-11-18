package com.xworkz.overriding.starter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.overriding.Bridge;

public class BridgeStarter {

	public static void main(String[] args) {

		Bridge bridge = new Bridge();
		bridge.setName("Bhupen Hazarika Setu");
		bridge.setLength(9.50f);
		bridge.setCost(50.0f);
		bridge.setOpenYear(2017);

		Bridge bridge1 = new Bridge();
		bridge1.setName("Bhupen Hazarika Setu");
		bridge1.setLength(9.50f);
		bridge1.setCost(50.0f);
		bridge1.setOpenYear(2017);

		bridge.equals(bridge1);

		System.out.println(bridge.toString());

		System.out.println(bridge.hashCode());

		Class classs = bridge.getClass();
		System.out.println(classs.getName());
		System.out.println(classs.getPackage());
		System.out.println(classs.getSuperclass());
		System.out.println(classs.getMethods().length);
		System.out.println(classs.getFields().length);
		System.out.println(classs.getConstructors().length);

		Constructor[] constructors = classs.getConstructors();

		for (int cat = 0; cat < constructors.length; cat++) {
			Constructor constructor = constructors[cat];
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterCount());
		}

		Method[] methods = classs.getMethods();

		for (int cat = 0; cat < methods.length; cat++) {
			Method method = methods[cat];
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getModifiers());
		}

	}

}
