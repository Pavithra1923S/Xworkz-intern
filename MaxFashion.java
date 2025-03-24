class MaxFashion
{
	public static String signUp(String firstName , String lastName , String phoneNumber , String dob , String mailId , String gender )
	{ // validating
		String ref = null;
		
		boolean userValid = validateUserProfile(firstName , lastName , phoneNumber , dob , mailId , gender);		
		if(userValid == true){
		ref = "User signup is successfull";
		}
		else{
			ref = "User signUp is unsuccessfull";
		}
		return ref;
	}
	
	
	
	public static boolean validateUserProfile(String firstName , String lastName , String phoneNumber , String dob , String mailId , String gender)
	{	
		boolean userValid = false;
		boolean isFirstNameValid = false;
		boolean isLastNameValid = false;
		boolean isPhoneNumberValid = false;
		boolean isMailIdValid = false;
		boolean isDobValid = false;
		boolean isGenderValid = false;
		
		if(firstName != null && firstName.length() >= 3){
		isFirstNameValid = true;}
		else{
			System.out.println("firstName is invalid .. please provide valid firstName");
		}
		
		if(lastName != null && lastName.length() >= 1)
		{isLastNameValid = true;}
		else{
			System.out.println("lastName is invalid.. please provide valid lastname");
		}
		
		if(phoneNumber!= null && phoneNumber.length() == 10 )
		{isPhoneNumberValid = true;}
		else{
		System.out.println("phoneNumber is invalid ..plz  provide valid phone number");
	    }
		
		if(mailId!= null && mailId.length() >=1 )
		{isMailIdValid = true;}
		else{
		System.out.println("mailId is invalid ..plz  provide valid mailId");
	    }
		
		if(dob!= null && dob.length() >=1 )
		{isDobValid = true;}
		else{
		System.out.println("dob is invalid ..plz  provide valid dob");
	    }
		
		if(gender!= null && gender.length() >=1 )
		{isGenderValid = true;}
		else{
		System.out.println("gender is invalid ..plz  provide valid gender");
	    }
		
		if(isFirstNameValid == true && isLastNameValid == true && isPhoneNumberValid == true && isMailIdValid == true && isDobValid == true && isGenderValid == true){
		userValid = true;
		}
			return userValid;
			
			
	}
	}