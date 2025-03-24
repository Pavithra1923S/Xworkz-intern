class HyperMarket
{
	static String groceries[] ={"rice" , "oil" , "maggi" , "salt" , "ghee" , "popcorn" , "flour" , "sugar" , "potatoes" , "Honey" , "cocoo powder"};
	static String purfumes[] ={"Amen" , "M7" , "polo" , "ferrari" , "dkny" , "js" , "212vip" , "Cool Water" , "bella vita" , "Wild Stone"};
	static String utensils[] ={"Plate" , "Cooker" , "Spoon" , "bowl" , "bottle" , "Kadai" , "frypan" , "tawa" , "Cutlery" , "Spatulas" , "knife"};
	static String vegetables[] ={"Tomato" , "Potato" , "Onion" , "ladys finger" , "Pumpkin" , "Beetroot" , "Beans" , "Carrot" , "brinjal" , "Capsicum"};
	
	
	public static void main(String args[])
	{
	System.out.println("Main started");
	System.out.println(" The total number of groceries are :" + groceries.length);
	System.out.println(" The total list of groceries are :");
	for( String items : groceries){
	System.out.println(items);
	}
	
	System.out.println(" The total number of purfumes are :" + purfumes.length);
	System.out.println(" The total list of purfumes are :");
	for( String items : purfumes){
	System.out.println(items);
	}
	
	System.out.println(" The total number of utensils are :" + utensils.length);
	System.out.println(" The total list of utensils are :");
	for( String items : utensils){
	System.out.println(items);
	}
	
	System.out.println(" The total number of vegetables are :" + vegetables.length);
	System.out.println(" The total list of vegetables are :");
	for( String items : vegetables){
	System.out.println(items);
	}
	System.out.println("Main ended");
	}

}