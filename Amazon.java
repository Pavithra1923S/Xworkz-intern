class Amazon{
	int id;
	String name;
	long phNo;
	String mailId;
	
	// no args constructor
	Amazon(){
	System.out.println(" constructor is invoked");
	
}


Amazon(int userId , String yourName, long phNo , String mailId )
{
	id = userId;
	name = yourName;
	this.phNo = phNo;
	this.mailId = mailId;
}

public void details(){
	System.out.println("the user id is " + this.id);
	System.out.println("the user name is " + this.name);
	System.out.println("the user phNo is" + this.phNo);
	System.out.println(" the user mailid is" + this.mailId);
}
	}