package com.xworkz.overriding.starter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.overriding.Pendrive;

public class PendriveStarter {

	public static void main(String[] args) {
		Pendrive drive=new Pendrive();
		drive.setCapacity(8.0f);
		drive.setWorking(true);
		drive.setBrand("SanDisk");
		drive.setPrice(1500.0f);

		Pendrive drive1=new Pendrive();
		drive1.setCapacity(8.0f);
		drive1.setWorking(true);
		drive1.setBrand("SanDisk");
		drive1.setPrice(1500.0f);

		drive.equals(drive1);

		System.out.println(drive.toString());

		System.out.println(drive1.hashCode());

		Class classs=drive.getClass();
		System.out.println(classs.getName());
		System.out.println(classs.getPackage());
		System.out.println(classs.getSuperclass());
		System.out.println(classs.getMethods().length);
		System.out.println(classs.getFields().length);
		System.out.println(classs.getConstructors().length);

Constructor[] constructors=classs.getConstructors();

		for(int cat=0;cat<constructors.length;cat++)
		{
			Constructor constructor=constructors[cat];
			System.out.println(constructor.getName());
			System.out.println(constructor.getParameterCount());
		}

		Method[] methods=classs.getMethods();

		for(int cat=0;cat<methods.length;cat++)
		{
			Method method=methods[cat];
			System.out.println(method.getName());
			System.out.println(method.getParameterCount());
			System.out.println(method.getModifiers());


		}

	}

	}

