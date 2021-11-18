package com.xworkz.overriding.starter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.xworkz.overriding.Sweet;
import com.xworkz.overriding.SweetColor;
import com.xworkz.overriding.SweetShape;

public class SweetStarter {

	public static void main(String[] args) {
		
			Sweet sweet=new Sweet();
			sweet.setName("MysorePack");
			sweet.setType(SweetColor.GREEN);
			sweet.setPrice(25.0f);
			sweet.setShape(SweetShape.SQUARE);
			
			Sweet sweet1=new Sweet();
			sweet1.setName("Champakali");
			sweet1.setType(SweetColor.YELLOW);
			sweet1.setPrice(25.0f);
			sweet1.setShape(SweetShape.CIRCLE);

		    sweet.equals(sweet1);
	
			System.out.println(sweet.toString());

			System.out.println(sweet.hashCode());

			Class clazz=sweet1.getClass();
			System.out.println(clazz.getName());
			System.out.println(clazz.getPackage());
			System.out.println(clazz.getSuperclass());
			System.out.println(clazz.getMethods().length);
			System.out.println(clazz.getFields().length);
			System.out.println(clazz.getConstructors().length);

			Constructor[] constructors=clazz.getConstructors();

			for(int cat=0;cat<constructors.length;cat++)
			{
				Constructor constructor=constructors[cat];
				System.out.println(constructor.getName());
				System.out.println(constructor.getParameterCount());
			}

			Method[] methods=clazz.getMethods();

			for(int cat=0;cat<methods.length;cat++)
			{
				Method method=methods[cat];
				System.out.println(method.getName());
				System.out.println(method.getParameterCount());
				System.out.println(method.getModifiers());
			}

		}

	}


