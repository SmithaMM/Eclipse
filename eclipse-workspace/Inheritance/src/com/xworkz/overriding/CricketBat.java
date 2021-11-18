package com.xworkz.overriding;

public class CricketBat {
		private String companyName;
		private TypeBat type;
		private float price;
		private String wood;

		public CricketBat()
		{
			System.out.println("Invoked no-arg constructor")	;
		}

		public String toString()
		{
			System.out.println("invoked toString from CricketBat");
			System.out.println(this.companyName);
			System.out.println(this.type);
			System.out.println(this.price);
			System.out.println(this.wood);

			return "CricketBat";

		}
		public int hashCode()
		{
			System.out.println("Invoked hashCode from CricketBat");
			return 17;
		}



		public boolean equals(Object obj)
		{
			System.out.println("Invoked equals method from CricketBat");
			if(obj!=null)
			{
				System.out.println("ref is not null");

			if(obj instanceof CricketBat)
			{
				System.out.println("Ref is CricketBat");
				CricketBat casted=(CricketBat)obj;
				String castedCompany=casted.getCompanyName();
				TypeBat castedType=casted.getType();
				if(this.companyName.equals(castedCompany)&& this.type.equals(castedType))
				{
					System.out.println("Comapny name and Type are matching");
					return true;
				}
				else
				{
					System.err.println("Company name or type is not matching");
				}
			}
			else
			{
				System.err.println(" not matching");

			}
			}
		else
			{
				System.err.println("Referance cannot be null!!");
			}
			return false;

		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public TypeBat getType() {
			return type;
		}

		public void setType(TypeBat type) {
			this.type = type;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public String getWood() {
			return wood;
		}

		public void setWood(String wood) {
			this.wood = wood;
		}



	}

