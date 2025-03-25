class PassPort
{	
	 public static String register(String cpvLocation , String dcdrLocation , String givenName , String surName , String dob , String email , String loginSame , String loginId , String pwd , String confirmPwd , String hintQues , String hintAns , String captcha)
	{	String ref = null;
		boolean isValidProfile = validProfile(cpvLocation , dcdrLocation , givenName , surName , dob , email , loginSame , loginId , pwd , confirmPwd , hintQues , hintAns , captcha );
		if(isValidProfile == true)    //argument is passed in line 5
		ref = "Suceesfully registration";
		else
		System.out.println("Unsuccessful registration");
		return ref; // return stringtype
	}

	public static boolean validProfile(String cpvLocation  , String dcdrLocation , String givenName , String surName , String dob , String email , String loginSame , String loginId , String pwd , String confirmPwd , String hintQues , String hintAns , String captcha)
	{	
		boolean isCpvLocation = false;
		if(cpvLocation != null && (cpvLocation == "PO" || cpvLocation == "CPVD") )
		isCpvLocation =true;
		else
		System.out.println("Invalid cpvLocation...plz enter proper cpvLocation");
	
		boolean isDcdrLocation = false;
		if(dcdrLocation != null && dcdrLocation.length() >=3)
		isDcdrLocation =true;
		else
		System.out.println("Invalid dcdrLocation...plz enter proper dcdrLocation");
	
		boolean isGivenNameValid = false;
		if(givenName != null && givenName.length() >= 3 )
			isGivenNameValid = true;
		else
			System.out.println("Invalid givenName...plz enter proper GivenName");
		
		boolean isSurNameValid = false;
		if(surName != null && surName.length() >= 1 )
			isSurNameValid = true;
		else
			System.out.println("Invalid SurName...plz enter proper SurName");
		
		boolean isDobValid = false;
		if(dob != null)
			isDobValid = true;
		else
			System.out.println("Invalid dob...plz enter proper dob");
		
		boolean isEmailValid = false;
		if(email != null && email.length() <= 40 )
			isEmailValid = true;
		else 
			System.out.println("Invalid Email...plz enter proper Email");
		
		boolean isLoginSameValid = false;
		if(loginSame == "true" )
			isLoginSameValid = true;
		else 
			System.out.println("plz enter same login id");
		
		boolean isLoginIdValid = false;
		if(loginId == email)
			isLoginIdValid = true;
		else 
			System.out.println("plz enter same login id");
		
		
		boolean isPwdValid = false;
		if(pwd != null && pwd.length() >= 10 )
			isPwdValid = true;
		else 
			System.out.println("Invalid pwd...plz enter proper Pwd");
		
		boolean isConfirmPwdValid = false;
		if(confirmPwd != null && confirmPwd == pwd )
			isConfirmPwdValid = true;
		else 
			System.out.println("Invalid pwd...plz enter proper Pwd");
		
		
		boolean isHintQues = false;
		if(hintQues != null )
			isHintQues = true;
		else 
			System.out.println("Invalid hintQues...plz enter proper hintQues");
		
		boolean isHintAns = false;
		if(hintAns != null && hintAns.length() >= 4 )
			isHintAns = true;
		else 
			System.out.println("Invalid Hintans...plz enter proper hintAns");
		
		boolean isCaptcha = false;
		if(captcha != null && captcha.length() >= 4 )
			isCaptcha = true;
		else 
			System.out.println("Invalid captcha...plz enter proper captcha");
		

		boolean isValidProfile = false;
		if(isCpvLocation == true && isDcdrLocation == true && isGivenNameValid == true && isSurNameValid == true && isDobValid == true && isEmailValid == true && isLoginSameValid == true && isLoginIdValid == true && isPwdValid == true && isConfirmPwdValid == true && isHintQues == true && isHintAns == true && isCaptcha == true )
			isValidProfile = true;
		else 
			System.out.println("plz provide Valid Information");
		return isValidProfile;
		
	}
}