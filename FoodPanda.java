class FoodPanda
{	public static double takeOrder(String foodName)
{
	double amount = 0.0;
	if(foodName == "egg"){
	amount = 25.0;
	return amount;}
	
	else if(foodName == "egg biryani"){
	amount = 83.0;
	return amount;}
	
	else if(foodName == "egg bonda"){
	amount = 23.0;
	return amount;}
	
	else if(foodName == "egg masala"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "egg burji"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "egg kurma"){
	amount = 50.0;
	return amount;}
	
	else if(foodName == "dhahi puri"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "Dhahi vada"){
	amount = 30.0;
	return amount;}
	
	else if(foodName == "pohi"){
	amount = 100.0;
	return amount;}
	
	else if(foodName == "barfi"){
	amount = 40.0;
	return amount;}
	
	else if(foodName == "halva"){
	amount = 95.0;
	return amount;}
	else if(foodName == "mixture"){
	amount = 55.0;
	return amount;}
	else if(foodName == "peri peri"){
	amount = 10.0;
	return amount;}
	
	else if(foodName == "aloo bhujiya"){
	amount = 55.0;
	return amount;}
	else if(foodName == "jalebi"){
	amount = 24.0;
	return amount;}
	
	else if(foodName == "churmuri"){
	amount = 55.0;
	return amount;}
	else if(foodName == "chachori"){
	amount = 30.0;
	return amount;}
	else if(foodName == "kati roll"){
	amount = 65.0;
	return amount;}
	else if(foodName == "laddoo"){
	amount = 65.0;
	return amount;}
	
	else if(foodName == "Maddur vada"){
	amount = 29.0;
	return amount;}
	
	else if(foodName == "mangalore bonda"){
	amount = 55.0;
	return amount;}
	else if(foodName == "mirchi bhajji"){
	amount = 35.0;
	return amount;}
	
	else if(foodName == "modak"){
	amount = 64.0;
	return amount;}
	
	else if(foodName == "chakli"){
	amount = 40.0;
	return amount;}
	
	else if(foodName == "egg dosa"){
	amount = 59.0;
	return amount;}
	
	else if(foodName == "egg vada"){    
	amount = 110.0;
	return amount;}
	
	else if(foodName == "egg idli"){
	amount = 76.0;
	return amount;}
	
	else if(foodName == "mysore pak"){
	amount = 64.0;
	return amount;}
	
	else if(foodName == "kodbale"){
	amount = 55.0;
	return amount;}
	
	else if(foodName == "kajaya"){    
	amount = 76.0;
	return amount;}
	
	else if(foodName == "paneer tikka"){
	amount = 260.0;
	return amount;}
	
	else if(foodName == "chicken tikka"){
	amount = 355.0;
	return amount;}
	
	else if(foodName == "mushroom tikka"){
	amount = 165.0;
	return amount;}
	
	else if(foodName == "mushroom rolls"){
	amount = 90.0;
	return amount;}
	
	else if(foodName == "fullyloaded corn rolls"){
	amount = 198.0;
	return amount;}
	
	else if(foodName == "loaded cheese rolls"){
	amount = 155.0;
	return amount;}
	
	else if(foodName == "chicken cheese roll"){
	amount = 239.0;
	return amount;}
	
	else if(foodName == "loaded paneer tikka rolls"){
	amount = 160.0;
	return amount;}
	else if(foodName == "papad"){
	amount = 50.0;
	return amount;}
	
	else if(foodName == "shawarma"){
	amount = 115.0;
	return amount;}
	
	else{
		System.out.println( foodName +"is not found in the menu");
		return amount;
	}
	}
	public static double takeOrder(String food , int quantity)
{
	double amount = 0.0;
	if(food == "egg"){
	amount = 25.0 * quantity;
	return amount;}
	
	else if(food == "egg biryani"){
	amount = 83.0 * quantity;
	return amount;}
	
	else if(food == "egg bonda"){
	amount = 23.0 * quantity;
	return amount;}
	
	else if(food == "egg masala"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(food == "egg burji"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(food == "egg kurma"){
	amount = 50.0 * quantity;
	return amount;}
	
	else if(food == "dhahi puri"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(food == "Dhahi vada"){
	amount = 30.0 * quantity;
	return amount;}
	
	else if(food == "pohi"){
	amount = 100.0 * quantity;
	return amount;}
	
	else if(food == "barfi"){
	amount = 40.0 * quantity;
	return amount;}
	
	else if(food == "halva"){
	amount = 95.0 * quantity;
	return amount;}
	else if(food == "mixture"){
	amount = 55.0 * quantity;
	return amount;}
	else if(food == "peri peri"){
	amount = 10.0 * quantity;
	return amount;}
	
	else if(food == "aloo bhujiya"){
	amount = 55.0 * quantity;
	return amount;}
	else if(food == "jalebi"){
	amount = 24.0 * quantity;
	return amount;}
	
	else if(food == "churmuri"){
	amount = 55.0 * quantity;
	return amount;}
	else if(food == "chachori"){
	amount = 30.0 * quantity;
	return amount;}
	else if(food == "kati roll"){
	amount = 65.0 * quantity;
	return amount;}
	else if(food == "laddoo"){
	amount = 65.0 * quantity;
	return amount;}
	
	else if(food == "Maddur vada"){
	amount = 29.0 * quantity;
	return amount;}
	
	else if(food == "mangalore bonda"){
	amount = 55.0 * quantity;
	return amount;}
	else if(food == "mirchi bhajji"){
	amount = 35.0 * quantity;
	return amount;}
	
	else if(food == "modak"){
	amount = 64.0 * quantity;
	return amount;}
	
	else if(food == "chakli"){
	amount = 40.0 * quantity;
	return amount;}
	
	else if(food == "egg dosa"){
	amount = 59.0 * quantity;
	return amount;}
	
	else if(food == "egg vada"){    
	amount = 110.0 * quantity;
	return amount;}
	
	else if(food == "egg idli"){
	amount = 76.0 * quantity;
	return amount;}
	
	else if(food == "mysore pak"){
	amount = 64.0 * quantity;
	return amount;}
	
	else if(food == "kodbale"){
	amount = 55.0 * quantity;
	return amount;}
	
	else if(food == "kajaya"){    
	amount = 76.0 * quantity;
	return amount;}
	
	else if(food == "paneer tikka"){
	amount = 260.0 * quantity;
	return amount;}
	
	else if(food == "chicken tikka"){
	amount = 355.0 * quantity;
	return amount;}
	
	else if(food == "mushroom tikka"){
	amount = 165.0 * quantity;
	return amount;}
	
	else if(food == "mushroom rolls"){
	amount = 90.0 * quantity;
	return amount;}
	
	else if(food == "fullyloaded corn rolls"){
	amount = 198.0 * quantity;
	return amount;}
	
	else if(food == "loaded cheese rolls"){
	amount = 155.0 * quantity;
	return amount;}
	
	else if(food == "chicken cheese roll"){
	amount = 239.0 * quantity;
	return amount;}
	
	else if(food == "loaded paneer tikka rolls"){
	amount = 160.0 * quantity;
	return amount;}
	else if(food == "papad"){
	amount = 50.0 * quantity;
	return amount;}
	
	else if(food == "shawarma"){
	amount = 115.0 * quantity;
	return amount;}
	
	else{
		System.out.println( food +"  is not found in the menu");
		return amount;
	}
	}
	}