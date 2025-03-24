class OlaFoodsRunner{
public static void main(String placeOrder[])
{
	String foodName = "kichadi";
	String foodItem = "carrot cake";
	int quantity = 7;
double price = OlaFoods.takeOrder(foodName);
System.out.println( "the amount of " + foodName + " is " + price + "\n");


double amount = OlaFoods.takeOrder(foodItem , quantity);
System.out.println( "The amount of " + foodItem  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}	