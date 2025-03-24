class PrimaryConsumers
{
	public static void details(){
	System.out.println("get into PrimaryConsumers");
	SecondaryConsumers.details();
	System.out.println("get out of PrimaryConsumers");
}
}