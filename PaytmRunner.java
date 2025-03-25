class PaytmAccountRunner 
{
    public static void main(String Paytm[]) 
    {
        
        String message = null;

        message = PaytmAccount.SignUp("Pavithra", "8765432109", "pavi@example.com", "1234", "5678", "123456789012", "123456");

        System.out.println(message);
        
    }
}
