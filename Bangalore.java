class Bangalore
{
static int pinCode[] ={560001 , 560002 , 560003 , 560004};
	public static void main(String args[])
	{
		System.out.println("main started");
		getpinCode();
		System.out.println("main ended");
		
	}	
	public static void getpinCode()
	{
		System.out.println(" inside the getpinCodes()");
		System.out.println(" list of area pincodes");
		for(int pincode :pinCode){
			System.out.println(pincode);
			
			
			
		}
		
	}
}