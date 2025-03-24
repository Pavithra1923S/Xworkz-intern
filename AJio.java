class AJio
{
	 public static String join(String email , String name , String gender , String phNo)
	{	String ref = null;
		boolean isValidProfile = validProfile(email , name , gender , phNo );
		if(isValidProfile == true)
		ref = "Suceesfully joined";
		else
		System.out.println("Unsuccessful");
		return ref;
	}

	public static boolean validProfile(String email , String name , String gender , String phNo)
	{	
		boolean isEmailValid = false;
		if(email != null && email.length() <= 40 )
			isEmailValid = true;
		else 
			System.out.println("Invalid Email...plz enter proper Email");
		
		boolean isNameValid = false;
		if(name != null && name.length() >= 3 )
			isNameValid = true;
		else
			System.out.println("Invalid Name...plz enter proper Name");
		
		boolean isGenderValid = false;
		if(gender != null )
			isGenderValid = true;
		else
			System.out.println("Invalid gender...plz enter proper gender");
		
		boolean isPhNoValid = false;
		if(phNo.length() == 10)
			isPhNoValid = true;
		else
			System.out.println("Invalid PhNo...plz enter proper PhNo");
		boolean isValidProfile = false;
		if(isEmailValid == true && isNameValid == true && isGenderValid == true && isPhNoValid == true )
			isValidProfile = true;
		else 
			System.out.println("plz provide Valid Information");
		return isValidProfile;
		
	}
}