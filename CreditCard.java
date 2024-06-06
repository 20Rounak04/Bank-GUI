
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    /*declaring the attributes by using acces modifier as private*/
    private int CVCnumber;
    private double CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private int GracePeriod;
    private boolean IsGranted;
    
    public CreditCard(int CardID, double BalanceAmount, String BankAccount, String IssuerBank, String ClientName, int CVCnumber, double InterestRate, String ExpirationDate)
    {
        super(CardID,BalanceAmount, BankAccount, IssuerBank);
        set_ClientName(ClientName);
        this.CVCnumber = CVCnumber;
        this.InterestRate = InterestRate;
        this.ExpirationDate = ExpirationDate;
        this.IsGranted = false;
    }
    
    //*using accessor method(get) to the given attributes*/
    public int get_CVCnumber()
    {
        return this.CVCnumber;
    }
    public double get_CreditLimit()
    {
        return this.CreditLimit;
    }
    public double get_InterestRate()
    {
        return this.InterestRate;
    }
    public String get_ExpirationDate()
    {
        return this.ExpirationDate;
    }
    public int get_GracePeriod()
    {
        return this.GracePeriod;
    }
    
    //* using mutator method(set) to the following attributes*/
    public void set_CreditLimit(double newCreditLimit, int newGracePeriod)
    {
        if(newCreditLimit <= get_BalanceAmount()*2.5)
        {
          this.CreditLimit = newCreditLimit;
          this.GracePeriod = newGracePeriod;
          this.IsGranted = true;
          System.out.println("The Credit has been granted with credit limit of" + newCreditLimit +"and a Grace Period of " + newGracePeriod);  
        }
        else
        {
            System.out.println("The following credit cannot be issued");
        }
    }
    
    //*creating a method cancel cerditcard*/
    public void cancelCreditCard()
    {
            this.CVCnumber = 0;
            this.CreditLimit = 0;
            this.GracePeriod = 0;
            this.IsGranted = false;
            System.out.println("The credit card has been cancelled");
    }
    
    //*using display method to show the output*/
    public void display()
    {
        super.display();
        if(IsGranted=true)
        {
            System.out.println("CVC Number" + this.CVCnumber);
            System.out.println("Credit Limit:" + this.CreditLimit);
            System.out.println("Grace Period:" + this.GracePeriod);
            System.out.println("Expiration Date:" + this.ExpirationDate);
        }
        
        else
        {
            System.out.println("The Credit limit and grace period has not been granted");
        }
    }
}