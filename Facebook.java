class Facebook
{
	 public static String register(String firstName , String surName) // int age , String gender , String email , String dob , String
	 {
		// if(firstName != null && surName != null ) and
			 //   || surName != null ) // or
			 String message = null;
			 if(firstName != null  )
			{
				message = "User Registration successfull";
			}else{
			message = "User reg unsuccesful";
			}
			return message;				
	 }
	 
	 
 }