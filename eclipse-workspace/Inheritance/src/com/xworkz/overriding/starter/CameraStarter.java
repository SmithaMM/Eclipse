package com.xworkz.overriding.starter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.overriding.Camera;

public class CameraStarter {

	public static void main(String[] args) {
		Camera camera = new Camera();
		camera.setBrand("Canon");
		camera.setModelNo(10);
		camera.setPrice(50000.0f);
		camera.setCompany("Canon");

		Camera camera1 = new Camera();
		camera1.setBrand("Nikon");
		camera1.setModelNo(5);
		camera1.setPrice(45000.0f);
		camera1.setCompany("Nikon");

		camera.equals(camera1);

		System.out.println(camera.toString());

		System.out.println(camera1.hashCode());

		Class classs = camera1.getClass();
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
