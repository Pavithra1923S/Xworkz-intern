class Instagram{
	public static String login(String emailId , String password){
	String msg = null;
	if(!emailId.isEmpty()  && password.length() >5)
	msg = "Successfull login";
	else
	msg = "Unsuccessful login ...please provide correct login details....";
	return msg;
	}
	
	public static boolean login(long phNo , String password)
	{ boolean isLogin = false;
	if(phNo != 0.0 && password != null)
	isLogin = true;
	else
	System.out.println("Unsuccessful login ...please provide correct login details....");
	return isLogin;}
	
	
	}