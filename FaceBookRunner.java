class FaceBookRunner
{
public static void main(String login[])
{
String msg = FaceBook.login("pavi@gmail.com" , "biryani");
System.out.println(msg);
boolean isLogin = FaceBook.login("biryani" , "female" , "9880478053" );
System.out.println(isLogin);
}}