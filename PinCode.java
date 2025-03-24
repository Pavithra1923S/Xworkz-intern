class PinCode
{
	public static void main(String args[])
	{
		int pinCodes[] ={560001 , 560002 , 560003 , 560004};
	
	// external refering 
		int pinCodes1 = pinCodes[0];
		System.out.println("the pincode is " + pinCodes1);
		
		// for each
		for(int ref : pinCodes){
			System.out.println(ref);
		}
	}
}