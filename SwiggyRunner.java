class SwiggyRunner{
public static void main(String placeOrder[])
{
	String foodName = "dosa";
	String food = "idly";
	int quantity = 9;
double price = Swiggy.takeOrder(foodName);
System.out.println( "the amount of " + foodName + " is " +price + "\n");


double amount = Swiggy.takeOrder(food , quantity);
System.out.println( "The amount of " + food  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}