class Clothes
{	static String items[] = {"silkSaree" , "Shirt" , "pant" , "Jeans" , "Skirt" , "Frock" , "blazer" ,"Gown" , "T -Shirt" , "BathRobe" , "Jacket" , "Scarf" , "Jumper" , "Hoodie" , "maxi" ,
	"Blouse" , "Crop Top" , "Leggings" , "Coat" , "nightie" , "Shorts" , "camisole" , "Pajamas" , "capis" , "Sweater" , "Tank Top" , "Midi dress" , "Slip" , "Sheath Dress" , "Gym cloths" ,
	"Uniform" , "tie" , "belt" , "Ribbon" , "SwimSuit" , "hat" , "HandBag" , "cottonSaree" , "Socks" , "Gagra"};
	
	
	public static void main(String args[])
	{
	System.out.println("Main started");
	System.out.println("The total number of cloths in the list are :" +items.length);
	System.out.println("The Cloths in the list are :" );
	for(String types:items){
	System.out.println(types);
	}
	System.out.println("Main ended");
	}
    
}
