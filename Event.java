class Event{
int noOfEvents;
String location;
String Ownername;
double eventCost;
String eventName;
int noOfParticipants;


Event(){
this(2);
System.out.println("Constructor is invoked");
}
Event(int noOfEvents){
this(10000 , 500000);
this.noOfEvents = noOfEvents;
System.out.println("Event constructor  using int and int");
}
Event(int noOfParticipants ,double eventCost){
this("Bangalore");
this.noOfParticipants = noOfParticipants;
this.eventCost = eventCost;
System.out.println("Event constructor  using int and double");

}
Event(String location){
this("Pavithra " , "Marriage" , 2);
this.location = location;
System.out.println("Event constructor  using string ");
}
Event(String Ownername , String eventName ,int noOfEvents){
this.Ownername = Ownername;
this.eventName = eventName;
this.noOfEvents =noOfEvents;
System.out.println("Event constructor  using string and string and int");
}
public void Display(){
System.out.println("Ownername : " + this.Ownername);
System.out.println("eventName : " + this.eventName);
System.out.println("location : " + this.location);
System.out.println("noOfParticipants : " + this.noOfParticipants);
System.out.println("eventCost : " + this.eventCost);
System.out.println("noOfEvents : " + this.noOfEvents);
}
}

