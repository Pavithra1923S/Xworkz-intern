class SwiggyRunner{
public static void main(String placeOrder[])
{
	String foodName = "dosa";
	String food = "idly";
	int quantity = 9;
double price = Swiggy.takeOrder(food);
System.out.println( "the amount of " + food + " is " +price + "\n");


double amount = Swiggy.takeOrder(foodName , quantity);
System.out.println( "The amount of " + foodName  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}