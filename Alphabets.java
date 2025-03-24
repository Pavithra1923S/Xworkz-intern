class Alphabets
{   
    static char upperCase[] = {'Q' , 'W' , 'E' , 'R' , 'T' , 'Y' ,  'U' , 'I' , 'O' , 'P' };
	public static void main(String args[])
	{
		System.out.println("Main started");
		getupperCase();
		System.out.println("Main ended");
	}
	
	public static void getupperCase()
	{
		System.out.println(" inside the getupperCase ");
		System.out.println(" The total number of UpperCase in the Context is : " + upperCase.length);
		System.out.println(" The List of UpperCase :");
		for( char characters : upperCase){
		System.out.println(characters);
		}
		System.out.println("out of getupperCase");
	}
}		