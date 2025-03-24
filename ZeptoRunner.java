class ZeptoRunner{
public static void main(String placeOrder[])
{
	String foodName = "kushka";
	String foodItem = "thali";
	int quantity = 7;
double price = Zepto.takeOrder(foodName);
System.out.println( "the amount of " + foodName + " is " + price + "\n");


double amount = Zepto.takeOrder(foodItem , quantity);
System.out.println( "The amount of " + foodItem  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}	