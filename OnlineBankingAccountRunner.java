class OnlineBankingAccountRunner 
{
    public static void main(String[] args) 
    {
        
        String message = null;

        message = OnlineBankingAccount.accountSignUp("123456789012", "123456", "987654321", "pavithra@example.com", "1234567812345678", "17/2/2003", "securePass123", "securePass123");

        System.out.println(message);
        
    }
}
