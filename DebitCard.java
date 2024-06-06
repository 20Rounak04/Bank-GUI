
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    //*declaring the attributes by using acces modifier as private*/
    private int PINnumber;
    private int WithdrawalAmount;
    private String DateOfWithdrawal;
    private boolean HasWithdrawn;
    
    public DebitCard( int CardID, double BalanceAmount, String BankAccount, String IssuerBank, String ClientName, int PINnumber)
    {
      super(CardID,BalanceAmount, BankAccount, IssuerBank);
      set_ClientName(ClientName);
      this.PINnumber = PINnumber;
      this.HasWithdrawn = false;
    }
    
    //*using accessor method(get) to the given attributes*/
    public int get_PINnumber()
    {
        return this.PINnumber;
    }
    public int get_WithdrawalAmount()
    {
        return this.WithdrawalAmount;
    }
    public String get_DateOfWithdrawal()
    {
        return this.DateOfWithdrawal;
    }
    public boolean get_HasWithdrawn()
    {
        return this.HasWithdrawn;
    }
        
    //* using mutator method(set) to the following attributes*/
    public void set_withdrawalAmount( int WithdrawalAmount)
    {
        this.WithdrawalAmount = WithdrawalAmount;
    }
    
    //*creating a method withdraw /
    public void withdraw(int WithdrawalAmount, String DateOfWithdrawal, int PINnumber)
    {
        if (PINnumber==this.PINnumber)
        {
            if (WithdrawalAmount <= get_BalanceAmount())
            {
                set_BalanceAmount(get_BalanceAmount() -WithdrawalAmount);
                this.WithdrawalAmount = WithdrawalAmount;
                this.DateOfWithdrawal = DateOfWithdrawal;
                this.HasWithdrawn = true;
                System.out.println("Amount Withdrawn Successfully."+ WithdrawalAmount);
                System.out.println("Current Amount" + get_BalanceAmount());
            }
            else
            {
                System.out.println("Transaction failed due to insufficient balance");
            }
        }
        else
        {
            System.out.println("The provided PIN number is invalid");
        }
    }
    
    //*using display method to show the output*/
    public void display()
    {
        super.display();
        System.out.println("PIN Number" +this.PINnumber);
        if(HasWithdrawn)
        {
            System.out.println("Withdrawal Amount" + this.WithdrawalAmount);
            System.out.println("Date of Withdrawal" + this.DateOfWithdrawal);
        }
}
}