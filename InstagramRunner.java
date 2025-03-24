class InstagramAccountRunner 
{
    public static void main(String Instagram[]) 
	{
        
        String message = null;

        message = InstagramAccount.SignUp( "PAV@example.com","pavi S", "pavi123", "securePass123","securePass123","00/00/2003", "8619876543" );

        System.out.println(message);
        
    }
}
