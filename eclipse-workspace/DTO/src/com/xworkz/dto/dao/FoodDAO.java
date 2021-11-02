package com.xworkz.dto.dao;
import com.xworkz.dto.FoodDto;
import com.xworkz.dto.Type;

public class FoodDAO {
	
	private FoodDto[] foodContainer = new FoodDto[10];
	private int count=0;
	
	public FoodDAO()
	{
		System.out.println("Invoked FoodDAO with no-argument");
	}
	
	public void save(FoodDto food)
	{
		if(food!=null && count<this.foodContainer.length)
		{
			this.foodContainer[count]=food;
			System.out.println("Index: ".concat(String.valueOf(count)).concat(" ").concat(food.getName()).concat(" ")
					.concat(String.valueOf(food.getId())).concat(" ").concat(String.valueOf(food.getType())).concat(" ")
					.concat(String.valueOf(food.getPrice())).concat(" ").concat(String.valueOf(food.getQuantity())));
			count++;
		}
		else
		{
			System.err.println("Container is full or you have passed null");
		}
	}
	
	
	public void updatePriceByName(String name,double price)
	{
		if(name!=null && price>0)
		{
			for(int cat=0; cat<this.foodContainer.length;cat++)
			{
				FoodDto food=this.foodContainer[cat];
				if(food!=null)
				{
					String foodName=food.getName();
					if(foodName.equals(name))
					{
						System.out.println("Name matched ".concat(name).concat(" ").concat(",updating price"));
						food.setPrice(price);
						System.out.println("Updated price: ".concat(String.valueOf(food.getPrice())));

					}
					else
					{
						System.out.println("Name is not matched");
					}
				}
				
			}
		}
		else
		{
			System.err.println("Nmae cannot be null and price should be greater than zero");
		}
	}
	
	
	
	public void updateQuantityByName(String name, int quantity)
	{
		if(name!=null && quantity>=0)
		{
			for(int cat=0; cat<this.foodContainer.length;cat++)
			{
				FoodDto food=this.foodContainer[cat];
				if(food!=null)
				{
					String foodName=food.getName();
					if(foodName.equals(name))
					{
						System.out.println("Name matched ".concat(name).concat(" ").concat(",updating quantity"));
						food.setQuantity(quantity);
						System.out.println("Updated Quantity: ".concat(String.valueOf(food.getQuantity())));

					}
					else
					{
						System.out.println("Name is not matched");
					}
				}
				
			}
		}
		else
		{
			System.err.println("Name cannot be null and quantity should be greater than or equal to zero");
		}
	}
	
	
	
	public void findByName(String name)
	{
		if(name!=null)
		{
			for(int cat=0; cat<this.foodContainer.length; cat++)
			{
				FoodDto food=foodContainer[cat];
				if(food!=null)
				{
					String matchName=food.getName();
					if(name.equals(matchName))
					{
						System.out.println("Name matched at the index :".concat(String.valueOf(cat)).concat(" and the name is ")
								.concat(" ").concat(matchName));
					}
					else
					{
						System.out.println("Not matched");
					}
				}
				else
				{
					System.err.println("Name cannot be null");
				}
			}
		}
	}
	
	
	public void findByNameAndPrice(String name,double price)
	{
			if(name!=null && price>0)
			{
				for(int cat=0; cat<this.foodContainer.length; cat++)
				{
					FoodDto food=this.foodContainer[cat];
					if(food!=null)
					{
						String matchName=food.getName();
						double matchPrice=food.getPrice();
						if(matchName.equals(name) && price==matchPrice)
						{
							System.out.println("Name and price are matched, name:  ".concat(name).concat(" ")
									.concat("and price: ").concat(" ").concat(String.valueOf(price)));
						}
						else
						{
							System.out.println("Name or Price not matched ");
						}
					}
					
				}
			}
			else
			{
				System.err.println("Food cannot be null and Price should be greater than zero ");
			}
	}
	

	
	public void findByNameAndType(String name,Type type)
	{
			if(name!=null && type!=null)
			{
				for(int cat=0; cat<this.foodContainer.length; cat++)
				{
					FoodDto food=this.foodContainer[cat];
					if(food!=null)
					{
						String matchFood=food.getName();
						Type matchType=food.getType();
						if(matchFood.equals(name) && matchType.equals(type))
						{
							System.out.println("Name and type are matched, name:  ".concat(name).concat(" ").concat("and type: ")
									.concat(String.valueOf(type)));
						}
						else
						{
							System.out.println("Name or type not matched ");
						}
					}	
				}
			}
			else
			{
				System.err.println("Name and type cannot be null");
			}
}
	
	
	public void displayDetails()
	{
		for(int cat=0; cat<this.foodContainer.length; cat++)
		{
			FoodDto displayDetails=this.foodContainer[cat];
			if(displayDetails!=null)
			{
			int id=displayDetails.getId();
			String name=displayDetails.getName();
			Type type=displayDetails.getType();
			double price=displayDetails.getPrice();
			int quantity=displayDetails.getQuantity();
			
			System.out.println("ID:".concat(" ").concat(String.valueOf(id)));
			System.out.println("NAME:".concat(" ").concat(name));
			System.out.println("TYPE:".concat(" ").concat(String.valueOf(type)));
			System.out.println("PRICE:".concat(" ").concat(String.valueOf(price)));
			System.out.println("QUANTITY:".concat(" ").concat(String.valueOf(quantity)));
		}
	}
}
	
	
	public void totalFoodItems()
	{
		int total=0;
		for(int cat=0; cat<this.foodContainer.length; cat++)
		{
			FoodDto food=foodContainer[cat];
			
			if(food!=null)
			{
				total=total+1;	
			}

		}
		System.out.println("total food items: ".concat(" ").concat(String.valueOf(total)));
	}

}
