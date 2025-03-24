class SBIRunner 
{
    public static void main(String SBI[]) 
    {
        
        String message = null;

        message = SBIAccount.SignUp( "pAVI", "9591534551","9876543210","mahesh@example.com", "07/06/2003",  "ABCDE1234F", "123456789012");

        System.out.println(message);
       
    }
}
