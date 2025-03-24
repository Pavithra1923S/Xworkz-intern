class DominosRunner{
public static void main(String placeOrder[])
{
	String pizzaName = "Dessert";
	String pizza = "GOLDEN CORN";
	int quantity = 5;
double price = Dominos.takeOrder(pizzaName);
System.out.println( "the amount of " + pizzaName + " is " +price + "\n");


double amount = Dominos.takeOrder(pizza , quantity);
System.out.println( "The amount of " + pizza  + "(quantity = " + quantity +")" + " is "  + amount);
} 
}	