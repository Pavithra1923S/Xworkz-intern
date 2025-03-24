class Dmart
{
	static String stationaries[] ={"pen" , "pencil" , "eraser" , "Scale" , "ColorPencils" , "Books" , "Box" , "Storybooks" , "Sharpner" , "Stickers" , "Stetchpens"};
	static String alcohols[] ={"BlackWhite" , "kingFisher" , "Omr" , "LookOut"};
	static String dairyProducts[] ={"Milk" , "Curd" , "Ghee" , "Cheese"};
	
	public static void main(String args[])
	{
		System.out.println("Main started");
		System.out.println(" The total number of stationaries are :" + stationaries.length);
	    System.out.println(" The total list of Stationaries are :");
		for( String items : stationaries){
		System.out.println(items);
		}
		
		System.out.println(" The total number of alcohols are :" + alcohols.length);
	    System.out.println(" The total list of alcohols are :");
		for( String items : alcohols){
		System.out.println(items);
		}
		
		System.out.println(" The total number of dairyProducts are :" + dairyProducts.length);
	    System.out.println(" The total list of dairyProducts are :");
		for( String items : dairyProducts){
		System.out.println(items);
		}
		
	 System.out.println("Main ended");
	}
	
}