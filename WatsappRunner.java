class WatsappRunner
{
public static void main(String login[])
{
String msg = Watsapp.login("Pavithra@gmail" , "biryani");
System.out.println(msg);

boolean isLogin = Watsapp.login(9880478053L , "biryani");
System.out.println(isLogin);
}}