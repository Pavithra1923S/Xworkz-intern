class Swiggy{
	public static double takeOrder(String foodName)
	{
		double price =0.0;
		if(foodName == "idly"){
			price = 70.00;
		return price;}
		
		else if(foodName == "dosa")
		{
			price = 85.00;
		return price;}
		
		else if(foodName == "vada")
		{
			price = 30.00;
		return price;}
		
		else if(foodName == "chapathi")
		{
			price = 65.00;
		return price;}
		
		else if(foodName == "porota")
		{
			price = 70.00;
		return price;}
		
		else if(foodName == "puri"){
			price = 95.00;
		return price;}
		
		else if(foodName == "palav"){
			price = 160.00;
		return price;}
		
		else if(foodName == "gulab jamun"){
			price = 40.00;
		return price;}
		
		else if(foodName == "kheer"){
			price = 50.00;
		return price;}
		
		else if(foodName == "ragi ball"){
			price = 30.00;
		return price;}
		
		else if(foodName == "sambhar"){
			price = 65.00;
		return price;}
		
		else if(foodName == "veg biryani"){
			price = 210.00;
		return price;}
		
		else if(foodName == "thali"){
			price = 450.00;
		return price;}
		
		else if(foodName == "rasgulla"){
			price = 200.00;
		return price;}
		
		else if(foodName == "mitai"){
			price = 25.00;
		return price;}
		
		else if(foodName == "veg curry"){
			price = 115.00;
		return price;}
		
		else if(foodName == "kosambari"){
			price = 35.00;
		return price;}
		
		else if(foodName == "apple juice"){
			price = 77.00;
		return price;}
		
		else if(foodName == "mango juice"){
			price = 60.00;
		return price;}
		
		else if(foodName == "pineapple juice"){
			price = 87.00;
		return price;}
		
		else if(foodName == "watermelon juice"){
			price = 40.00;
		return price;}
		
		else if(foodName == "jackfruit juice"){
			price = 112.00;
		return price;}
		
		else if(foodName == "sapota juice"){
			price = 70.00;
		return price;}
		
		else if(foodName == "orange juice"){
			price = 47.00;
		return price;}
		
		else if(foodName == "dragonfruit juice"){
			price = 155.00;
		return price;}
		
		else if(foodName == "pomogranite juice"){       
			price = 250.00;
		return price;}
		
		 else if(foodName == "carrot juice"){
			price = 98.00;
		return price;}
		
		else if(foodName == "beetroot juice"){
			price = 39.00;
		return price;}
		
		else if(foodName == "grapes juice"){
			price = 47.00;
		return price;}
		
		else if(foodName == "coconut drink"){
			price = 70.00;
		return price;}
		
		else if(foodName == "tomato juice"){
			price = 15.00;
		return price;}
		
		else if(foodName == "Berry juice"){
			price = 53.00;
		return price;}
		
		else if(foodName == "Sugarcane juice"){
			price = 12.00;
		return price;}
		
		else if(foodName == "cherry juice"){
			price = 34.00;
		return price;}
		
		else if(foodName == "wheatgrass juice"){
			price = 150.00;
		return price;}
		
		else if(foodName == "curdrice"){
			price = 87.00;
		return price;}
		
		else if(foodName == "whiterice"){
			price = 20.00;
		return price;}
		
		else if(foodName == "moosambi juice"){
			price = 49.00;
		return price;}
		
		else if(foodName == "lime juice"){
			price = 25.00;
		return price;}
		
		else if(foodName == "strawberry juice"){
			price = 80.00;
		return price;}
		
		else{
			System.out.println(foodName + " is not found in the menu");
        return price;}
	}
	
	public static double takeOrder(String food ,int quantity)
	{
		double price =0.0;
		if(food == "idly"){
			price = 70.00 * quantity;
		return price;}
		
		else if(food == "dosa")
		{
			price = 85.00 * quantity;
		return price;}
		
		else if(food == "vada")
		{
			price = 30.00 * quantity;
		return price;}
		
		else if(food == "chapathi")
		{
			price = 65.00 * quantity;
		return price;}
		
		else if(food == "porota")
		{
			price = 70.00 * quantity;
		return price;}
		
		else if(food == "puri"){
			price = 95.00 * quantity;
		return price;}
		
		else if(food == "palav"){
			price = 160.00 * quantity;
		return price;}
		
		else if(food == "gulab jamun"){
			price = 40.00 * quantity;
		return price;}
		
		else if(food == "kheer"){
			price = 50.00 * quantity;
		return price;}
		
		else if(food == "ragi ball"){
			price = 30.00 * quantity;
		return price;}
		
		else if(food == "sambhar"){
			price = 65.00 * quantity;
		return price;}
		
		else if(food == "veg biryani"){
			price = 210.00 * quantity;
		return price;}
		
		else if(food == "thali"){
			price = 450.00 * quantity;
		return price;}
		
		else if(food == "rasgulla"){
			price = 200.00 * quantity;
		return price;}
		
		else if(food == "mitai"){
			price = 25.00 * quantity;
		return price;}
		
		else if(food == "veg curry"){
			price = 115.00 * quantity;
		return price;}
		
		else if(food == "kosambari"){
			price = 35.00 * quantity;
		return price;}
		
		else if(food == "apple juice"){
			price = 77.00 * quantity;
		return price;}
		
		else if(food == "mango juice"){
			price = 60.00 * quantity;
		return price;}
		
		else if(food == "pineapple juice"){
			price = 87.00 * quantity;
		return price;}
		
		else if(food == "watermelon juice"){
			price = 40.00 * quantity;
		return price;}
		
		else if(food == "jackfruit juice"){
			price = 112.00 * quantity;
		return price;}
		
		else if(food == "sapota juice"){
			price = 70.00 * quantity;
		return price;}
		
		else if(food == "orange juice"){
			price = 47.00 * quantity;
		return price;}
		
		else if(food == "dragonfruit juice"){
			price = 155.00 * quantity;
		return price;}
		
		else if(food == "pomogranite juice"){       
			price = 250.00 * quantity;
		return price;}
		
		 else if(food == "carrot juice"){
			price = 98.00 * quantity;
		return price;}
		
		else if(food == "beetroot juice"){
			price = 39.00 * quantity;
		return price;}
		
		else if(food == "grapes juice"){
			price = 47.00 * quantity;
		return price;}
		
		else if(food == "coconut drink"){
			price = 70.00 * quantity;
		return price;}
		
		else if(food == "tomato juice"){
			price = 15.00 * quantity;
		return price;}
		
		else if(food == "Berry juice"){
			price = 53.00 * quantity;
		return price;}
		
		else if(food == "Sugarcane juice"){
			price = 12.00 * quantity;
		return price;}
		
		else if(food == "cherry juice"){
			price = 34.00 * quantity;
		return price;}
		
		else if(food == "wheatgrass juice"){
			price = 150.00 * quantity;
		return price;}
		
		else if(food == "curdrice"){
			price = 87.00 * quantity;
		return price;}
		
		else if(food== "whiterice"){
			price = 20.00 * quantity;
		return price;}
		
		else if(food == "moosambi juice"){
			price = 49.00 * quantity;
		return price;}
		
		else if(food == "lime juice"){
			price = 25.00 * quantity;
		return price;}
		
		else if(food == "strawberry juice"){
			price = 80.00 * quantity;
		return price;}
		
		else{
			System.out.println(food + "is not found in the menu");
        return price;}
	}
	}