class Dominos{
	public static double takeOrder(String pizzaName)
	{
		double price = 0.0;
		
		if(pizzaName == "Pizza"){
			price = 4.00;
		return price;
		}
		
		else if(pizzaName == "Margherita"){
			price = 210.00;
		return price;
		}
		
		else if(pizzaName == "Double Cheese Margherita")
		{
			price = 330.00;
		return price;
		}
		
		else if(pizzaName == "Farm House")
		{
			price = 165.00;
		return price;
		}
		
		else if(pizzaName == "Peppy Paneer")
		{
			price = 272.00;
		return price;
		}
		
		else if(pizzaName == "Mexican Green Wave")
		{
			price = 195.00;
		return price;
		}
		
		else if(pizzaName == "Deluxe Veggie")
		{
			price = 330.00;
		return price;
		}
		
		else if(pizzaName == "Veg Extravaganza")
		{
			price = 440.00;
		return price;
		}
		
		else if(pizzaName == "CHEESE N CORN")
		{
			price = 150.00;
		return price;}
		
		else if(pizzaName == "FRESH VEGGIE")
		{
			price = 130.00;
		return price;}
		
		else if(pizzaName == "VEGGIE PARADISE")
		{
			price = 265.00;
		return price;}
		
		else if(pizzaName == "PANEER MAKHANI")
		{
			price = 210.00;
		return price;}
		
		else if(pizzaName == "Indi Tandoori Paneer")
		{
			price = 450.00;
		return price;}
		
		else if(pizzaName == "Moroccan Spice Pasta Pizza")
		{
			price = 654.00;
		return price;}
		
		else if(pizzaName == "Achari Do Pyaza")
		{
			price = 258.00;
		return price;}
		
		else if(pizzaName == "Chicken Golden Delight")
		{
			price = 615.00;
		return price;}
		
		else if(pizzaName == "PEPPER BARBECUE & ONION")
		{
			price = 359.00;
		return price;}
		
		else if(pizzaName == "Chicken Dominator")
		{
			price = 717.00;
		return price;}
		
		else if(pizzaName == "PEPPER BARBECUE CHICKEN")
		{
			price = 360.00;
		return price;}
		
		else if(pizzaName == "CHICKEN SAUSAGE")
		{
			price = 387.00;
		return price;}
		
		else if(pizzaName == "CHICKEN FIESTA")
		{
			price = 240.00;
		return price;}
		
		else if(pizzaName == "Indi Chicken Tikka")
		{
			price = 512.00;
		return price;}
		
		else if(pizzaName == "Chicken Pepperoni")
		{
			price = 470.00;
		return price;}
		
		else if(pizzaName == "Creamy Tomato Pasta Pizza ")
		{
			price = 747.00;
		return price;}
		
		else if(pizzaName == "Keema Do Pyaza")
		{
			price = 875.00;
		return price;}
		
		else if(pizzaName == "Moroccan Spice Pasta Pizza")
		{       
			price = 550.00;
		return price;}
		
		 else if(pizzaName == "VEG LOADED")
		 {
			price = 98.00;
		return price;}
		
		else if(pizzaName == "CHEESY")
		{
			price = 110.00;
		return price;}
		
		else if(pizzaName == "PANEER & ONION")
		{
			price = 89.00;
		return price;}
		
		else if(pizzaName == "GOLDEN CORN")
		{
			price = 70.00;
		return price;}
		
		else if(pizzaName == "CHEESE N TOMATO")
		{
			price = 115.00;
		return price;}
		
		else if(pizzaName == "Garlic Breadsticks")
		{
			price = 253.00;
		return price;}
		
		else if(pizzaName == "Stuffed Garlic Bread")
		{
			price = 112.00;
		return price;}
		
		else if(pizzaName == "Paneer Tikka Stuffed Garlic Bread")
		{
			price = 234.00;
		return price;}
		
		else if(pizzaName == "Chicken Pepperoni Stuffed Garlic Bread")
		{
			price = 450.00;
		return price;}
		
		else if(pizzaName == "Moroccan Spice Pasta Veg")
		{
			price = 287.00;
		return price;}
		
		else if(pizzaName == "Tikka Masala Pasta Veg")
		{
			price = 240.00;
		return price;}
		
		else if(pizzaName == "Creamy Tomato Pasta Veg")
		{
			price = 349.00;
		return price;}
		
		else if(pizzaName == "Coke")
		{
			price = 125.00;
		return price;}
		
		else if(pizzaName == "Dessert")
		{
			price = 180.00;
		return price;}
		
		else{
			System.out.println( pizzaName +" the food is not found in the menu");
        return price;}
		
	}
	
	public static double takeOrder(String pizza , int quantity)
	{
		double price = 0.0;
		
		if(pizza == "Pizza"){
			price = 4.00 * quantity;
		return price;
		}
		
		else if(pizza == "Margherita"){
			price = 210.00 * quantity;
		return price;
		}
		
		else if(pizza == "Double Cheese Margherita")
		{
			price = 330.00 * quantity;
		return price;
		}
		
		else if(pizza == "Farm House")
		{
			price = 165.00* quantity;
		return price;
		}
		
		else if(pizza == "Peppy Paneer")
		{
			price = 272.00 * quantity;
		return price;
		}
		
		else if(pizza == "Mexican Green Wave")
		{
			price = 195.00 * quantity;
		return price;
		}
		
		else if(pizza == "Deluxe Veggie")
		{
			price = 330.00 * quantity;
		return price;
		}
		
		else if(pizza == "Veg Extravaganza")
		{
			price = 440.00 * quantity;
		return price;
		}
		
		else if(pizza == "CHEESE N CORN")
		{
			price = 150.00 * quantity;
		return price;}
		
		else if(pizza == "FRESH VEGGIE")
		{
			price = 130.00 * quantity;
		return price;}
		
		else if(pizza == "VEGGIE PARADISE")
		{
			price = 265.00 * quantity;
		return price;}
		
		else if(pizza == "PANEER MAKHANI")
		{
			price = 210.00 * quantity;
		return price;}
		
		else if(pizza == "Indi Tandoori Paneer")
		{
			price = 450.00 * quantity;
		return price;}
		
		else if(pizza == "Moroccan Spice Pasta Pizza")
		{
			price = 654.00 * quantity;
		return price;}
		
		else if(pizza == "Achari Do Pyaza")
		{
			price = 258.00 * quantity;
		return price;}
		
		else if(pizza == "Chicken Golden Delight")
		{
			price = 615.00 * quantity;
		return price;}
		
		else if(pizza == "PEPPER BARBECUE & ONION")
		{
			price = 359.00 * quantity;
		return price;}
		
		else if(pizza == "Chicken Dominator")
		{
			price = 717.00 * quantity;
		return price;}
		
		else if(pizza == "PEPPER BARBECUE CHICKEN")
		{
			price = 360.00 * quantity;
		return price;}
		
		else if(pizza == "CHICKEN SAUSAGE")
		{
			price = 387.00 * quantity;
		return price;}
		
		else if(pizza == "CHICKEN FIESTA")
		{
			price = 240.00 * quantity;
		return price;}
		
		else if(pizza == "Indi Chicken Tikka")
		{
			price = 512.00 * quantity;
		return price;}
		
		else if(pizza == "Chicken Pepperoni")
		{
			price = 470.00 * quantity;
		return price;}
		
		else if(pizza == "Creamy Tomato Pasta Pizza ")
		{
			price = 747.00 * quantity;
		return price;}
		
		else if(pizza == "Keema Do Pyaza")
		{
			price = 875.00 * quantity;
		return price;}
		
		else if(pizza == "Moroccan Spice Pasta Pizza")
		{       
			price = 550.00 * quantity;
		return price;}
		
		 else if(pizza == "VEG LOADED")
		 {
			price = 98.00 * quantity;
		return price;}
		
		else if(pizza == "CHEESY")
		{
			price = 110.00 * quantity;
		return price;}
		
		else if(pizza == "PANEER & ONION")
		{
			price = 89.00 * quantity;
		return price;}
		
		else if(pizza == "GOLDEN CORN")
		{
			price = 70.00 * quantity;
		return price;}
		
		else if(pizza == "CHEESE N TOMATO")
		{
			price = 115.00 * quantity;
		return price;}
		
		else if(pizza == "Garlic Breadsticks")
		{
			price = 253.00 * quantity;
		return price;}
		
		else if(pizza == "Stuffed Garlic Bread")
		{
			price = 112.00 * quantity;
		return price;}
		
		else if(pizza == "Paneer Tikka Stuffed Garlic Bread")
		{
			price = 234.00 * quantity;
		return price;}
		
		else if(pizza == "Chicken Pepperoni Stuffed Garlic Bread")
		{
			price = 450.00 * quantity;
		return price;}
		
		else if(pizza == "Moroccan Spice Pasta Veg")
		{
			price = 287.00 * quantity;
		return price;}
		
		else if(pizza == "Tikka Masala Pasta Veg")
		{
			price = 240.00 * quantity;
		return price;}
		
		else if(pizza == "Creamy Tomato Pasta Veg")
		{
			price = 349.00 * quantity;
		return price;}
		
		else if(pizza == "Coke")
		{
			price = 125.00 * quantity;
		return price;}
		
		else if(pizza == "Dessert")
		{
			price = 180.00 * quantity;
		return price;}
		
		else{
			System.out.println( pizza +" the food is not found in the menu");
        return price;}
		
	}
	}