class AC
{
	static boolean isConnected = false;
	static int currentTemperature;
	static int maxTemperature = 6;
	static int minTemperature;
	
	
public static void onOff() 
{ 

if(isConnected == false){
isConnected = true;
System.out.println("the AC is on");

}
else
{
	isConnected = false;
	System.out.println(" the AC is turned off");
}
}




public static void increaseTemperature()
{ 
	if(isConnected == true ){
		if(currentTemperature < maxTemperature){
		currentTemperature = currentTemperature + 1; //update
	System.out.println("the currentTemperature is" + currentTemperature);
	}
	else System.out.println("Max temperature reached...");
	}
	else 
		System.out.println("gubee turn on the AC first");
	
}


public static void decreaseTemperature()
{
	if(isConnected == true ){
		if(currentTemperature > maxTemperature){
		currentTemperature = currentTemperature - 1; //update
	System.out.println("the currentTemperature is" + currentTemperature);
	}
	else System.out.println("Min temperature reached...");
	}
	else 
		System.out.println("gubee turn on the AC first");
}
}