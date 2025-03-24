class FoodPandaRunner{
public static void main(String placeOrder[])
{
	String foodName = "egg bonda";
	String food = "egg biryani";
	int quantity = 5;
double price = FoodPanda.takeOrder(foodName);
System.out.println( "the amount of " + foodName + " is " + price + "\n");


double amount = FoodPanda.takeOrder(food , quantity);
System.out.println( "The amount of " + food  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}	