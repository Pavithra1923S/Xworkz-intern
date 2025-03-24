class  Communities
{
	public static void provideTickets()
	{
		System.out.println("inside provideTickets()");
		
		Participants.buyTickets();
		System.out.println("out of provideTickets ()");
	}
}
