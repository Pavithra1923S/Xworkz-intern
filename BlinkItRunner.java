class BlinkItRunner{
public static void main(String placeOrder[])
{
	String foodName = "kara pongal";
	String food = "kara pongal";
	int quantity = 6;
double price = BlinkIt.takeOrder(foodName);
System.out.println( "the amount of " + food + " is " +price + "\n");


double amount = BlinkIt.takeOrder(food , quantity);
System.out.println( "The amount of " + food  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}