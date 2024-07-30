
/**
 * Write a description of class BankCard here.
 *
 * @author(Amishu Adhikari)
 * @version (a version number or a date)
 */

public class BankCard
{
    private int card_id;
    private String bank_Account;
    private double balanceAmount;
    private String clientName;
    private String issuerBank;
    public BankCard( int card_id,String bank_Account, double balanceAmount, String issuerBank){
        this.card_id= card_id;
        this.bank_Account = bank_Account;
        this.balanceAmount = balanceAmount;
        this.clientName = "";
        this.issuerBank = issuerBank;
    }
    //giving getter method

    public int getCard_id(){
        return this.card_id;

    }

    public String getClientName()
    {
        return this.clientName;
    }

    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    
    public String getBank_Account(){
        return this.bank_Account;
    }
    
    public double getBalanceAmount(){
        return this.balanceAmount;
    }
    //giving setter method
    public void setClientName(String clientName){
        this.clientName = clientName;
    }

    public void setBalanceAmount(double balanceAmount){
        this.balanceAmount = balanceAmount;
    }
    //display details of Bank Card
    public void display()
    {
        if(this.clientName == "")
        {
            System.out.println("The client name is not being assigned. Please re-enter your name.");
        }
        else
        {
         System.out.println("Enter your name is "+this.clientName);  
         System.out.println("Dear valued Customer, The NRP is "+this.balanceAmount+" in your bank account.");
         System.out.println("Dear valued Customer, The  account number is "+this.bank_Account+"");
         System.out.println("Dear valued Customer, The Card Id is"+this.card_id+"");
         System.out.println("Dear valued Customer, The bank of issue is"+this.issuerBank+"");
    
        }
        
        
        
    }

}
