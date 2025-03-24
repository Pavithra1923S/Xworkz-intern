class Dmart
{
	public static void main(String args[])
	{
	// array
	String stationaries[] ={"pen" , "pencil" , "eraser" , "Scale" , "ColorPencils" , "Books" , "Box" , "Storybooks" , "Sharpner" , "Stickers" , "Stetchpens"};
	System.out.println("Number of items Available are :" + stationaries.length );
	System.out.println("list of items Available are :");
	System.out.println(stationaries[0] + " " + stationaries[1] + " " + stationaries[2] + " " + stationaries[3] + " " + stationaries[4] + " " + stationaries[5] + " " + stationaries[6] + " " + stationaries[7] + " " + stationaries[8] + " " + stationaries[9] + "\n" );
	
	
	
	String alcohols[] ={"BlackWhite" , "kingFisher" , "Omr" , "LookOut"};
	System.out.println("The total number of drinks present :" + alcohols.length);
	System.out.println("The total number of Items Present are :");
	System.out.println(alcohols[0]  + " " +   alcohols[1]+ " "   +  alcohols[2] + " " + alcohols[3]+"\n" );
	
	// external refering
	String ref1 = alcohols[1];
	System.out.println(ref1);
	
	String dairyProducts[] ={"Milk" , "Curd" , "Ghee" , "Cheese"};
	System.out.println("The total number of Product are:" +dairyProducts.length);
	System.out.println("The list of dairy products are: ");
	System.out.println(dairyProducts[0] + " " + dairyProducts[1] + " " + dairyProducts[2] + " " + dairyProducts[3] );
	}
}