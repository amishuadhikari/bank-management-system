
/**
 * Write a description of class CreditCard here.
 *
 * @author (Amishu Adhikari)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
  private int cvcNumber;
  private double creditLimit;
  private double interestRate;
  private String expirationDate;
  private int gracePeriod;
  private boolean isGranted;
  
  public CreditCard(int card_id,String clientName,String issuerBank, double balanceAmount, String bank_Account, int cvcNumber,double interestRate,
  String expirationDate)
  {
      super(card_id, bank_Account, balanceAmount, issuerBank);
      super.setClientName(clientName);
      this.cvcNumber = cvcNumber;
      this.interestRate = interestRate;
      this.expirationDate = expirationDate;
      this.isGranted = false;
  }
  // using getter method
  public int getCVCNumber()
  {
      return this.cvcNumber;
  }
  public int getGracePeriod()
  {
      return this.gracePeriod;
  }
  public double getCreditLimit()
  {
      return this.creditLimit;
  }
  public double getInterestRate()
  {
      return this.interestRate;
  }
  public String getExpirationDate()
  {
    return this.expirationDate;
  }
  public boolean getIsGranted()
  {
      return this.isGranted;
  }
  public void setCreditLimit(double creditLimit, int gracePeriod)
  {
      if(creditLimit <=2.5*super.getBalanceAmount())
      {
          this.creditLimit = creditLimit;
          this.gracePeriod = gracePeriod;
          this.isGranted = true;
      }
      else
      {
          System.out.println("Credit can't be issued. ");
      }
  }
  //To remove credit card of the client
  public void cancelCreditCard()
  {
      this.cvcNumber = 0;
      this.creditLimit = 0;
      this.gracePeriod = 0;
      this.isGranted = false;
      System.out.println("cancelled");
  }
  //display method
  public void display()
  {
      if(this.isGranted == true)
      {
          super.display();
          System.out.println("CVC Number= "+getCVCNumber());
          System.out.println("credit limit= "+getCreditLimit());
          System.out.println("The rate of interest is "+getInterestRate());
          System.out.println("credit expiration date: "+getExpirationDate());
          System.out.println("grace period is "+getGracePeriod());
      }
      else
      {
          super.display();
          System.out.println("CVC Number ="+getCVCNumber());
          System.out.println("The rate of interest is ="+getInterestRate());
          System.out.println("credit expiration date :"+getExpirationDate());
          
      }
  }
    
}

