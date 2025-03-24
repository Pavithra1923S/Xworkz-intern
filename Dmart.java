class Dmart
{
	static String stationaries[] ={"pen" , "pencil" , "eraser" , "Scale" , "ColorPencils" , "Books" , "Box" , "Storybooks" , "Sharpner" , "Stickers" , "Stetchpens"};
	static String alcohols[] ={"BlackWhite" , "kingFisher" , "Omr" , "LookOut"};
	static String dairyProducts[] ={"Milk" , "Curd" , "Ghee" , "Cheese"};
	
	public static void main(String args[])
	{System.out.println("Main started");
	 getstationaries();
	 getalcohols();
	 getdairyProducts();
	 System.out.println("Main ended");
	}
	
	public static void getstationaries()
	{
		System.out.println(" inside the getstationaries ");
		System.out.println(" The total number of stationaries are :" + stationaries.length);
	    System.out.println(" The total list of Stationaries are :");
		for( String items : stationaries){
		System.out.println(items);
		}
		System.out.println("out of getstationaries");
	}
	
	public static void getalcohols()
	{
		System.out.println(" inside the getalcohols ");
		System.out.println(" The total number of alcohols are :" + alcohols.length);
	    System.out.println(" The total list of alcohols are :");
		for( String items : alcohols){
		System.out.println(items);
		}
		System.out.println("out of getalcohols");
	}
	
	public static void getdairyProducts()
	{
		System.out.println(" inside the getdairyProducts ");
		System.out.println(" The total number of dairyProducts are :" + dairyProducts.length);
	    System.out.println(" The total list of dairyProducts are :");
		for( String items : dairyProducts){
		System.out.println(items);
		}
		System.out.println("out of getdairyProducts");
	}
	
	
}