class Snap{
	public static String login(String emailId , String password){
	String msg = null;
	if(!emailId.isEmpty()  && password.length() >3)
	msg = "Successfull login";
	else
	msg = "Unsuccessful login ...please provide correct login details....";
	return msg;
	}
	
	public static String login(long phNo , String password , String gender)
	{ String msg = null;
	if(phNo != 0.0 && password.length()==10 && gender != null)
	msg = "Successfull login";
	else
	System.out.println("Unsuccessful login ...please provide correct login details....");
	return msg;}
	
	
	}