class Swiggy{
	public static double takeOrder(String food)
	{
		double price =0.0;
		if(food == "idly"){
			price = 70.00;
		return price;}
		else if(food == "dosa"){
			price = 110.00;
		return price;}
		else if(food == "puri"){
			price = 85.00;
		return price;}
		else{
			System.out.println(food + " not found");
			
		return price;}
	}
	public static double takeOrder(String foodName ,int quantity)
	{
		double amount =0.0;
		if(foodName == "idly"){
			amount = 70.00 * quantity;
		return amount;}
		else if(foodName == "dosa"){
			amount = 110.00;
		return amount;}
		else if(foodName == "puri"){
			amount = 80.00;
		return amount;}
		
		else{
			System.out.println(foodName +"is not found");
		return amount;}
		
	}
	}