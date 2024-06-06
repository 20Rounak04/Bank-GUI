
/**
 * Write a description of class BackCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    //*declaring the attributes by using acces modifier as private*/
    private String ClientName;
    private int CardID;
    private String BankAccount;
    private String IssuerBank;
    private double BalanceAmount;
    
    public BankCard(int CardID, double BalanceAmount, String BankAccount, String IssuerBank)
    {
     this.ClientName="";
     this.CardID= CardID;
     this.BankAccount= BankAccount;
     this.IssuerBank= IssuerBank;
     this.BalanceAmount= BalanceAmount;
    }
    
    //*using accessor method(get) to the given attributes*/
    public String get_ClientName()
    {
        return this.ClientName;
    }
    public int get_CardID()
    {
       return this.CardID; 
    }  
    public String get_BankAccount()
    {
        return this.BankAccount;
    }
    public String get_IssuerBank()
    {
        return this.IssuerBank;
    }
    public double get_BalanceAmount()
    {
        return this.BalanceAmount;
    }
    
    //* using mutator method(set) to the following attributes*/
    public void set_ClientName( String ClientName)
    {
        this.ClientName=ClientName;
    }
    public void set_BalanceAmount( double BalanceAmount)
    {
        this.BalanceAmount=BalanceAmount;
    } 
    
    //*using display method to show the output*/
    public void display()
    {
        if(this.ClientName.isEmpty())
        {
            System.out.println("The following Client Name is not assigned");
        }
        else
        {
            System.out.println("Card ID:" + this.CardID);
            System.out.println("Bank Account:" + this.BankAccount);
            System.out.println("Issuer Bank:" + this.IssuerBank);
            System.out.println("Balance Amount:" + this.BalanceAmount);
        }
    }
}