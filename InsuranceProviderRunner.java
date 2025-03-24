class InsuranceProviderRunner
{
	public static void main(String args[])
	{	
	String insuranceName = "TATA AIA LIFE INSURANCE";
	double termPrice = InsuranceProvider.termInsurance(insuranceName);
	System.out.println("The Term price of the " +insuranceName +" is " +termPrice);
	}
	}	