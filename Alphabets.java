class Alphabets
{   
    static char upperCase[] = {'Q' , 'W' , 'E' , 'R' , 'T' , 'Y' ,  'U' , 'I' , 'O' , 'P' };
	public static void main(String args[])
	{
		System.out.println("Main started");
		System.out.println(" The total number of UpperCase in the Context is : " + upperCase.length);
		System.out.println(" The List of UpperCase :");
		for( char characters : upperCase){
		System.out.println(characters);
		}
		System.out.println("Main ended");
	}
	
	
}		