class OlaFoods
{	public static double takeOrder(String foodName)
{
	double amount = 0.0;
	if(foodName == "kichadi"){
	amount = 45.0;
	return amount;}
	
	else if(foodName == "beans salad"){
	amount = 23.0;
	return amount;}
	
	else if(foodName == "charrot alva"){
	amount = 123.0;
	return amount;}
	
	else if(foodName == "mazza"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "Sprit"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "pepsi"){
	amount = 50.0;
	return amount;}
	
	else if(foodName == "goodday biscuit"){
	amount = 15.0;
	return amount;}
	
	else if(foodName == "parle g"){
	amount = 10.0;
	return amount;}
	
	else if(foodName == "mari gold"){
	amount = 10.0;
	return amount;}
	
	else if(foodName == "mari light"){
	amount = 10.0;
	return amount;}
	
	else if(foodName == "nitrilight"){
	amount = 25.0;
	return amount;}
	else if(foodName == "hide&sick"){
	amount = 55.0;
	return amount;}
	else if(foodName == "darkfantacy"){
	amount = 100.0;
	return amount;}
	
	else if(foodName == "kinderjoy"){
	amount = 55.0;
	return amount;}
	else if(foodName == "dairymilk oreo"){
	amount = 249.0;
	return amount;}
	
	else if(foodName == "dairymilk"){
	amount = 55.0;
	return amount;}
	else if(foodName == "dairymilk silk"){
	amount = 330.0;
	return amount;}
	else if(foodName == "perk"){
	amount = 15.0;
	return amount;}
	else if(foodName == "kitkat"){
	amount = 35.0;
	return amount;}
	
	else if(foodName == "5 star"){
	amount = 69.0;
	return amount;}
	
	else if(foodName == "veg pups"){
	amount = 55.0;
	return amount;}
	else if(foodName == "paneer pups"){
	amount = 65.0;
	return amount;}
	
	else if(foodName == "egg pups"){
	amount = 89.0;
	return amount;}
	
	else if(foodName == "kara bun"){
	amount = 40.0;
	return amount;}
	
	else if(foodName == "egg bun"){
	amount = 59.0;
	return amount;}
	
	else if(foodName == "dilpasand"){    
	amount = 110.0;
	return amount;}
	
	else if(foodName == "monaco"){
	amount = 76.0;
	return amount;}
	
	else if(foodName == "nutrichoice"){
	amount = 64.0;
	return amount;}
	
	else if(foodName == "50-50"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "krackjack"){    
	amount = 76.0;
	return amount;}
	
	else if(foodName == "moms magic"){
	amount = 26.0;
	return amount;}
	
	else if(foodName == "bourborn"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "oreo"){
	amount = 65.0;
	return amount;}
	
	else if(foodName == "twist"){
	amount = 60.0;
	return amount;}
	
	else if(foodName == "butter delight"){
	amount = 98.0;
	return amount;}
	
	else if(foodName == "googly"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "bread"){
	amount = 39.0;
	return amount;}
	
	else if(foodName == "wheat bread"){
	amount = 60.0;
	return amount;}
	else if(foodName == "baguetta"){
	amount = 250.0;
	return amount;}
	
	else if(foodName == "carrot cake"){
	amount = 115.0;
	return amount;}
	
	else{
		System.out.println( foodName +"is  not found in the list");
		return amount;
	}
	}
	
	public static double takeOrder(String foodItem , int quantity)
{
	double amount = 0.0;
	if(foodItem == "kichadi"){
	amount = 45.0 * quantity;
	return amount;}
	
	else if(foodItem == "beans salad"){
	amount = 23.0* quantity;
	return amount;}
	
	else if(foodItem == "charrot alva"){
	amount = 123.0 * quantity;
	return amount;}
	
	else if(foodItem == "mazza"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(foodItem == "Sprit"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(foodItem == "pepsi"){
	amount = 50.0 * quantity;
	return amount;}
	
	else if(foodItem == "goodday biscuit"){
	amount = 15.0 * quantity;
	return amount;}
	
	else if(foodItem == "parle g"){
	amount = 10.0 * quantity;
	return amount;}
	
	else if(foodItem == "mari gold"){
	amount = 10.0 * quantity;
	return amount;}
	
	else if(foodItem == "mari light"){
	amount = 10.0 * quantity;
	return amount;}
	
	else if(foodItem == "nitrilight"){
	amount = 25.0 * quantity;
	return amount;}
	else if(foodItem == "hide&sick"){
	amount = 55.0 * quantity;
	return amount;}
	else if(foodItem == "darkfantacy"){
	amount = 100.0 * quantity;
	return amount;}
	
	else if(foodItem == "kinderjoy"){
	amount = 55.0 * quantity;
	return amount;}
	else if(foodItem == "dairymilk oreo"){
	amount = 249.0 * quantity;
	return amount;}
	
	else if(foodItem == "dairymilk"){
	amount = 55.0 * quantity;
	return amount;}
	else if(foodItem == "dairymilk silk"){
	amount = 330.0 * quantity;
	return amount;}
	else if(foodItem == "perk"){
	amount = 15.0 * quantity;
	return amount;}
	else if(foodItem == "kitkat"){
	amount = 35.0 * quantity;
	return amount;}
	
	else if(foodItem == "5 star"){
	amount = 69.0 * quantity;
	return amount;}
	
	else if(foodItem == "veg pups"){
	amount = 55.0 * quantity;
	return amount;}
	else if(foodItem == "paneer pups"){
	amount = 65.0 * quantity;
	return amount;}
	
	else if(foodItem == "egg pups"){
	amount = 89.0 * quantity;
	return amount;}
	
	else if(foodItem == "kara bun"){
	amount = 40.0 * quantity;
	return amount;}
	
	else if(foodItem == "egg bun"){
	amount = 59.0 * quantity;
	return amount;}
	
	else if(foodItem == "dilpasand"){    
	amount = 110.0 * quantity;
	return amount;}
	
	else if(foodItem == "monaco"){
	amount = 76.0 * quantity;
	return amount;}
	
	else if(foodItem == "nutrichoice"){
	amount = 64.0 * quantity;
	return amount;}
	
	else if(foodItem == "50-50"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(foodItem == "krackjack"){    
	amount = 76.0 * quantity;
	return amount;}
	
	else if(foodItem == "moms magic"){
	amount = 26.0 * quantity;
	return amount;}
	
	else if(foodItem == "bourborn"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(foodItem == "oreo"){
	amount = 65.0 * quantity;
	return amount;}
	
	else if(foodItem == "twist"){
	amount = 60.0 * quantity;
	return amount;}
	
	else if(foodItem == "butter delight"){
	amount = 98.0 * quantity;
	return amount;}
	
	else if(foodItem == "googly"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(foodItem == "bread"){
	amount = 39.0 * quantity;
	return amount;}
	
	else if(foodItem == "wheat bread"){
	amount = 60.0 * quantity;
	return amount;}
	else if(foodItem == "baguetta"){
	amount = 250.0 * quantity;
	return amount;}
	
	else if(foodItem == "carrot cake"){
	amount = 115.0 * quantity;
	return amount;}
	
	else{
		System.out.println( foodItem +" is not found in the list");
		return amount;
	}
	}
	}