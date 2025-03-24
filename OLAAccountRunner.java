class OLAAccountRunner 
{
    public static void main(String[] args) 
    {
       
        String message = null;

        message = OLAAccount.accountSignUp("Pavithra", "8618562005", "19/02/2003", "Bengaluru", "Toyota", "Innova", "KA01AB1234", "RC123456", "DL123456", "PUC123456", "1234561234", "PAN123456", "123456123456");

        System.out.println(message);
       
    }
}
