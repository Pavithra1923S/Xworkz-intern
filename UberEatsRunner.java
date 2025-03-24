class UberEatsRunner{
public static void main(String placeOrder[])
{
	String foodName = "mexican bread";
	String foodItem = "gobi manchiri";
	int quantity = 3;
double price = UberEats.takeOrder(foodName);
System.out.println( "the amount of " + foodName + " is " + price + "\n");


double amount = UberEats.takeOrder(foodItem , quantity);
System.out.println( "The amount of " + foodItem  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}	