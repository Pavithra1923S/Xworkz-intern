class Nyka
{
	public static String register(String name , String gender)
	{
		
	String msg = null;
	boolean isValid = false;
	isValid = validate(name,gender);
	if(isValid == true)
	{
		msg = "registration is successfull";
	}
	else
	{
		 msg = "unsuccessfull";
	}
	return msg;
	}
	
	public static boolean validate(String name , String gender)
	{
	boolean isValid = false;
	boolean isName = false;
	if(name != null && !name.isEmpty())
		isName = true;
	else
		System.out.println(" provide Valid name details.." );
	
	boolean isGender = false;
	if(gender != null && !gender.isEmpty())
		isGender = true;
	else
			System.out.println(" provide Valid gender details.." );
		
	if(isName == true && isGender == true)
		isValid = true;
	else 
		System.out.println(" enter valid details..");
		
	return isValid;

}

}