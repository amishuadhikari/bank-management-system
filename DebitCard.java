
/**
 * Write a description of class DebitCard here.
 *
 * @author (Amishu Adhikari)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
private int pinNumber;
private int withdrawalAmount;
private String date_of_Withdrawal;
private boolean hasWithdrawn;

public DebitCard(int card_id,String clientName,String issuerBank, double balanceAmount, String bank_Account,int pinNumber)
{
    super(card_id, bank_Account, balanceAmount, issuerBank);
    super.setClientName(clientName);
    this.pinNumber = pinNumber;
    this.hasWithdrawn = false;
}
//giving getter method
public int getPinNumber()
{
    return this.pinNumber;
}
public String getDate_of_Withdrawal()
{
    return this.date_of_Withdrawal;

}
public boolean getHasWithdrawn()
{
    return this.hasWithdrawn;

}
public int getWithdrawalAmount()
{
    return this.withdrawalAmount;
}
//giving setter method
public void setwithdrawalAmount(int withdrawalAmount)
{
    this.withdrawalAmount = withdrawalAmount;

}
public void Withdraw(int withdrawalAmount,String date_of_Withdrawal,int pinNumber)
// add parameters
{
if(pinNumber==this.pinNumber)
{
if(super.getBalanceAmount()>=withdrawalAmount)
{
this.hasWithdrawn=true;
System.out.println("The succesfully withdrawn amount is Rs. "+withdrawalAmount+" from your bank account");
this.date_of_Withdrawal=date_of_Withdrawal;
this.withdrawalAmount=withdrawalAmount;
super.setBalanceAmount(getBalanceAmount()-withdrawalAmount);
System.out.println("After withdrawal of money of Rs"+getWithdrawalAmount()+" from your bank account, the new balance is Rs."+getBalanceAmount()+"");
}
else
{
System.out.println("You haven't got enough balance in your account for withdrawal");
}
}
else
{
System.out.println("Invalid pinNumber. Please try again");
}
}
// displaying details of Debit Card.
public void display()
{
    if(this.hasWithdrawn == true)
    {
    super.display();
    System.out.println("Dear valued Customer , The pin number is" +getPinNumber()+"");
    System.out.println(" Dear valued Customer, The Amount of withdrawalis Rs" +getWithdrawalAmount()+ "from your bank account.");
    System.out.println("Dear valued Customer, The Date of withdrawal is: " +getDate_of_Withdrawal());
}
else
{
  System.out.println("Dear valued Customer, The NRP number is"+super.getBalanceAmount()+" in your bank account.");  
}
}     
}




 
    


