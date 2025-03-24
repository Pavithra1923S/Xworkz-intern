class PavithraParadise
{
	 static String menu[] = { "Dosa" , "Idly" , "Puri" , "VegBiryani" , "FriedRice" , "Gobimanchuri" , "Masalapuri" , "Bhelpuri" , "Mushroom Curry" , "Butter Kulcha"};
	public static void main(String args[])
	{	System.out.println("Main started");
		System.out.println(" The total number of Food Items are :" + menu.length);
		System.out.println(" list of menu :");
		for(String table : menu ){
		System.out.println(table);
		}
		System.out.println("Main Ended");
	
	}
}