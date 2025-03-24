class InsuranceProvider
{
	public static double termInsurance(String insuranceName)
	{	double termPrice = 0.00;
	
		if(insuranceName == "SBI LIFE INSURANCE"){
		termPrice = 8000;
		return termPrice;}
	
		else if(insuranceName == "HDFC LIFE INSURANCE"){
		termPrice = 7500;
		return termPrice;}
		
		else if(insuranceName == "KOTAK LIFE INSURANCE"){
		termPrice = 9999.99;
		return termPrice;}
		
		else if(insuranceName == "CANARA LIFE INSURANCE"){
		termPrice = 8000;
		return termPrice;}
		
		else if(insuranceName == "AXIS BANK LIFE INSURANCE"){
		termPrice = 5000;
		return termPrice;}
		
		else if(insuranceName == "TATA AIA LIFE INSURANCE"){
		termPrice = 7999.99;
		return termPrice;}
		
		else if(insuranceName == "ICICI LIFE INSURANCE"){
		termPrice = 8500;
		return termPrice;}
		
		else if(insuranceName == "BAJAJ ALLIANZ LIFE INSURANCE"){
		termPrice = 10000.00;
		return termPrice;}
		
		else if(insuranceName == "SMART POLICY LIFE INSURANCE"){
		termPrice = 7999.00;
		return termPrice;}
		
		else if(insuranceName == "LIC LIFE INSURANCE"){
		termPrice = 9999.99;
		return termPrice;}
		
		else{
		System.out.println(insuranceName + " is not found");
		return termPrice;}
		
		
		
		}}