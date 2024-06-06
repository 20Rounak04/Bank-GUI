import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.ArrayList;

public class Bank_GUI implements ActionListener
{
    // creating and calling arraylist for Bank card class
    private ArrayList<BankCard> bankcard = new ArrayList<BankCard>(); 

    //declaring variables 
    private JFrame Debit_Frame, WithDraw_Frame;
    private JFrame Credit_Frame, CreditLimit_Frame;

    private JPanel Debit_Panel, Credit_Panel;
    private JPanel Withdraw_Panel, CreditLimit_Panel;

    private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8;
    private JTextField ctf1, ctf2, ctf3, ctf4, ctf5, ctf6, ctf7, ctf8, ctf9;

    private JButton DisplayButton, ClearButton, WithdrawButton, SwitchButton, AddCardButton, backButton, WithdrawClearButton, WithdrawAmountButton,WithdrawDisplayButton;
    private JButton CDisplayButton,CClearButton ,CreditlimitButton , Switch2DebitButton, AddCCardButton, CancelCardButton, BackButton, clearButton, SetLimitButton, LimitDisplayButton;

    private JLabel title1, CardID, ClientName, IssuerBank, BankAccount, PINnumber, BalanceAmount,WithdrawTitle,pinnumber, withdrawalAmount, dateOfWithdrawal;
    private JLabel CreditCard,CClientName , CCardID, CIssuerBank,CBankAccount , CBalanceAmount, CreditLimitTitle, CVCnumber, CreditLimit, GracePeriod, InterestRate ,ExpirationDate;

    private JComboBox DayCombobox,MonthCombobox,YearCombobox;
    private JComboBox daycombobox,monthcombobox,yearcombobox;

    public Bank_GUI()
    {
        //Creating JFrame, JPanel , JTextfields and JLabels and initializing them
        Debit_Frame = new JFrame("Rounak_Joshi_22067875");
        Debit_Panel = new JPanel();

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();

        DisplayButton = new JButton("Display");
        ClearButton = new JButton("Clear");
        WithdrawButton = new JButton("Withdraw Amount");
        SwitchButton = new JButton("Switch to Credit Card");
        AddCardButton = new JButton("Add Debit Card");

        title1 = new JLabel("Debit Card");
        CardID = new JLabel("Card ID");
        ClientName = new JLabel("Client Name");
        IssuerBank = new JLabel("Issuer Bank");
        BankAccount = new JLabel("Bank Account");
        PINnumber = new JLabel("PIN Number");
        BalanceAmount = new JLabel("Balance Amount");

        //setting bounds to the the objects
        title1.setBounds(411,17,124,36);
        CardID.setBounds(26,92,55,22);
        ClientName.setBounds(26,147,88,21);
        PINnumber.setBounds(26,200,92,22);
        BalanceAmount.setBounds(448,83,117,22);
        BankAccount.setBounds(448,143,98,22);
        IssuerBank.setBounds(448,195,84,22);

        tf1.setBounds(177,87,180,27);
        tf2.setBounds(177,141,180,27);
        tf3.setBounds(177,195,180,27);
        tf4.setBounds(631,87,180,27);
        tf5.setBounds(631,138,180,27);
        tf6.setBounds(631,189,180,27);

        DisplayButton.setBounds(700,300,120,32);
        ClearButton.setBounds(850,300,120,32);
        WithdrawButton.setBounds(500,250,140,32);
        SwitchButton.setBounds(21,300,235,32);
        AddCardButton.setBounds(320,250,140,32);

        //adding the objects to the panel
        Debit_Panel.add(title1);
        Debit_Panel.add(CardID);
        Debit_Panel.add(ClientName);
        Debit_Panel.add(IssuerBank);
        Debit_Panel.add(BankAccount);
        Debit_Panel.add(PINnumber);
        Debit_Panel.add(BalanceAmount);

        Debit_Panel.add(tf1);
        Debit_Panel.add(tf2);
        Debit_Panel.add(tf3);
        Debit_Panel.add(tf4);
        Debit_Panel.add(tf5);
        Debit_Panel.add(tf6);

        Debit_Panel.add(DisplayButton);
        Debit_Panel.add(ClearButton);
        Debit_Panel.add(WithdrawButton);
        Debit_Panel.add(SwitchButton);
        Debit_Panel.add(AddCardButton);

        //Adding actionlistener to the buttons
        DisplayButton.addActionListener(this);
        ClearButton.addActionListener(this);
        WithdrawButton.addActionListener(this);
        SwitchButton.addActionListener(this);
        AddCardButton.addActionListener(this);

        //seeting the background to the frame and the buttons
        title1.setFont(new Font("Arial Black",Font.PLAIN,20));
        Debit_Panel.setBackground(new Color(165,202,205));
        DisplayButton.setBackground(new Color(246,176,146));
        ClearButton.setBackground(new Color(246,176,146));
        WithdrawButton.setBackground(new Color(246,176,146));
        SwitchButton.setBackground(new Color(246,176,146));
        AddCardButton.setBackground(new Color(246,176,146));

        //adding frames to the panel, setting the size, visibility and layout 
        Debit_Frame.add(Debit_Panel);
        Debit_Frame.setSize(1000,400);
        Debit_Panel.setLayout(null);
        Debit_Frame.setVisible(true);
        Debit_Frame.setResizable(false);
        Debit_Frame.setDefaultCloseOperation(Debit_Frame.EXIT_ON_CLOSE);

        //creating a new frame, objects and panel for the withdrawing amount
        WithDraw_Frame = new JFrame("Rounak_Joshi_22067875");
        Withdraw_Panel = new JPanel();
        
        //Creating JFrame, JPanel , JTextfields and JLabels and initializing them
        WithdrawTitle = new JLabel("Withdraw Amount");
        pinnumber = new JLabel("PIN Number");
        withdrawalAmount = new JLabel("Withdrawal Amount");
        dateOfWithdrawal = new JLabel("Date of Withdrawal");
        dateOfWithdrawal = new JLabel("WithdrawCardID");

        tf7 = new JTextField();
        tf8 = new JTextField();

        backButton = new JButton("Back");
        WithdrawClearButton = new JButton("Clear");
        WithdrawAmountButton = new JButton("Withdraw Amount");
        WithdrawDisplayButton = new JButton("Display");

        String[] DD = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        DayCombobox = new JComboBox(DD);
        String[] MM = {"January","february","March","April","May","June","July","August","September","October","November","December"};
        MonthCombobox = new JComboBox(MM);
        String[] YYYY = {"2023"};
        YearCombobox = new JComboBox(YYYY);

        //setting the bounds to the objects
        WithdrawTitle.setBounds(168,9,198,36);
        pinnumber.setBounds(10,75,92,22);
        withdrawalAmount.setBounds(10,132,117,22);
        dateOfWithdrawal.setBounds(10,189,135,22);

        tf7.setBounds(216,75,180,27);
        tf8.setBounds(216,132,180,27);

        backButton.setBounds(10,300,120,32);
        WithdrawClearButton.setBounds(310,300,120,32);
        WithdrawAmountButton.setBounds(148,246,141,32);
        WithdrawDisplayButton.setBounds(160,300,120,32);

        DayCombobox.setBounds(216,189,57,32);
        MonthCombobox.setBounds(282,189,57,32);
        YearCombobox.setBounds(347,189,57,32);

        //adding the objects to the withdraw panel
        Withdraw_Panel.add(WithdrawTitle);
        Withdraw_Panel.add(pinnumber);
        Withdraw_Panel.add(withdrawalAmount);
        Withdraw_Panel.add(dateOfWithdrawal);
        Withdraw_Panel.add(backButton);
        Withdraw_Panel.add(WithdrawClearButton);
        Withdraw_Panel.add(WithdrawAmountButton);
        Withdraw_Panel.add(WithdrawDisplayButton);
        Withdraw_Panel.add(DayCombobox);
        Withdraw_Panel.add(MonthCombobox);
        Withdraw_Panel.add(YearCombobox);
        Withdraw_Panel.add(tf7);
        Withdraw_Panel.add(tf8);

        //adding the actionlistener to the buttons
        backButton.addActionListener(this);
        WithdrawClearButton.addActionListener(this);
        WithdrawAmountButton.addActionListener(this);
        WithdrawDisplayButton.addActionListener(this);

        //seetting the background color of the panel and button
        Withdraw_Panel.setBackground(new Color(165,202,205));
        WithdrawTitle.setFont(new Font("Arial Black",Font.PLAIN,18));
        backButton.setBackground(new Color(246,176,146));
        WithdrawClearButton.setBackground(new Color(246,176,146));
        WithdrawAmountButton.setBackground(new Color(246,176,146));
        WithdrawDisplayButton.setBackground(new Color(246,176,146));

        //adding frames to the panel, setting the size, visibility and layout 
        WithDraw_Frame.add(Withdraw_Panel);
        WithDraw_Frame.setSize(500,400);
        Withdraw_Panel.setLayout(null);
        WithDraw_Frame.setVisible(false);
        WithDraw_Frame.setResizable(false);
        WithDraw_Frame.setDefaultCloseOperation(WithDraw_Frame.EXIT_ON_CLOSE);

        //creating a new frame, objects and panel for the credit card
        Credit_Frame = new JFrame("Rounak_Joshi_22067875");
        Credit_Panel = new JPanel();

        ctf1 = new JTextField();
        ctf2 = new JTextField();
        ctf3 = new JTextField();
        ctf4 = new JTextField();
        ctf5 = new JTextField();
        ctf6 = new JTextField();
        ctf7 = new JTextField();

        CDisplayButton = new JButton("Display");
        CClearButton = new JButton("Clear");
        CreditlimitButton = new JButton("Set Credit Limit");
        Switch2DebitButton = new JButton("Switch to Debit Card");
        AddCCardButton = new JButton("Add Credit Card");
        CancelCardButton = new JButton("Cancel Credit Card");

        CreditCard = new JLabel("Credit Card");
        CClientName = new JLabel("Client Name");
        CCardID = new JLabel("Card ID");
        CIssuerBank = new JLabel("Issuer Bank");
        CBankAccount = new JLabel("Bank Account");
        CBalanceAmount = new JLabel("Balance Amount");
        CVCnumber = new JLabel("CVC Number");
        InterestRate = new JLabel("Interest Rate");
        ExpirationDate = new JLabel("Expiration Date");

        String[] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        daycombobox = new JComboBox(Day);
        String[] Month = {"January","february","March","April","May","June","July","August","September","October","November","December"};
        monthcombobox = new JComboBox(Month);
        String[] Year = {"2023","2024","2025","2026","2027"};
        yearcombobox = new JComboBox(Year);

        //setting the bounds to the objects 
        CreditCard.setBounds(411,19,133,36);
        CClientName.setBounds(36,73,88,22);
        CCardID.setBounds(36,124,55,22);
        CIssuerBank.setBounds(36,175,84,22);
        InterestRate.setBounds(36,226,92,23);
        CBankAccount .setBounds(418,73,98,22);
        CVCnumber.setBounds(418,128,88,22);
        CBalanceAmount.setBounds(418,175,117,22);
        ExpirationDate.setBounds(418,231,109,23);

        ctf1.setBounds(181,73,180,27);
        ctf2.setBounds(181,124,180,27);
        ctf3.setBounds(181,175,180,27);
        ctf4.setBounds(181,226,180,26);
        ctf5.setBounds(592,73,180,27);
        ctf6.setBounds(592,124,180,27);
        ctf7.setBounds(592,175,180,27);

        CDisplayButton.setBounds(820,396,120,32);
        CClearButton.setBounds(680,396,120,32);
        CreditlimitButton.setBounds(163,288,156,32);
        Switch2DebitButton.setBounds(14,396,180,32);
        AddCCardButton.setBounds(361,288,156,32);
        CancelCardButton.setBounds(559,288,156,32);

        daycombobox.setBounds(592,226,58,33);
        monthcombobox.setBounds(667,226,58,33);
        yearcombobox.setBounds(742,226,58,33);

        //adding the objects to the panel
        Credit_Panel.add(CreditCard);
        Credit_Panel.add(CClientName);
        Credit_Panel.add(CCardID);
        Credit_Panel.add(CIssuerBank);
        Credit_Panel.add(CBankAccount );
        Credit_Panel.add(CVCnumber);
        Credit_Panel.add(CBalanceAmount);
        Credit_Panel.add(InterestRate);
        Credit_Panel.add(ExpirationDate);
        Credit_Panel.add(ctf1);
        Credit_Panel.add(ctf2);
        Credit_Panel.add(ctf3);
        Credit_Panel.add(ctf4);
        Credit_Panel.add(ctf5);
        Credit_Panel.add(ctf6);
        Credit_Panel.add(ctf7);
        Credit_Panel.add(CDisplayButton);
        Credit_Panel.add(CClearButton);
        Credit_Panel.add(CreditlimitButton);
        Credit_Panel.add(Switch2DebitButton);
        Credit_Panel.add(AddCCardButton);
        Credit_Panel.add(CancelCardButton);
        Credit_Panel.add(daycombobox);
        Credit_Panel.add(monthcombobox);
        Credit_Panel.add(yearcombobox);

        //adding actionlistener to the buttons
        CDisplayButton.addActionListener(this);
        CClearButton.addActionListener(this);
        CreditlimitButton.addActionListener(this);
        Switch2DebitButton.addActionListener(this);
        AddCCardButton.addActionListener(this);
        CancelCardButton.addActionListener(this);

        //setting the background of the panel and the buttons
        Credit_Panel.setBackground(new Color(165,202,205));
        CreditCard.setFont(new Font("Arial Black",Font.PLAIN,20));
        CDisplayButton.setBackground(new Color(246,176,146));
        CClearButton.setBackground(new Color(246,176,146));
        CreditlimitButton.setBackground(new Color(246,176,146));
        Switch2DebitButton.setBackground(new Color(246,176,146));
        AddCCardButton.setBackground(new Color(246,176,146));
        CancelCardButton.setBackground(new Color(246,176,146));

        //adding frames to the panel, setting the size, visibility and layout 
        Credit_Frame.add(Credit_Panel);
        Credit_Frame.setSize(1000,500);
        Credit_Panel.setLayout(null);
        Credit_Frame.setVisible(false);
        Credit_Frame.setResizable(false);
        Credit_Frame.setDefaultCloseOperation(Credit_Frame.EXIT_ON_CLOSE);

        //creating a new frame, objects and panel for the credit limit
        CreditLimit_Frame = new JFrame("Rounak_Joshi_22067875");
        CreditLimit_Panel = new JPanel();

        CreditLimitTitle = new JLabel("Set Credit limit");
        CreditLimit = new JLabel("Credit Limit");
        GracePeriod = new JLabel("Grace Period");

        ctf8= new JTextField();
        ctf9 = new JTextField();

        BackButton = new JButton("Back");
        clearButton= new JButton("Clear");
        SetLimitButton= new JButton("Set Credit Limit");
        LimitDisplayButton = new JButton("Display");

        //setting the bounds of the objects 
        CreditLimitTitle.setBounds(176,29,204,37);
      
        CreditLimit.setBounds(15,127,81,23);
        GracePeriod.setBounds(15,172,94,23);

        ctf8.setBounds(176,122,180,28);
        ctf9.setBounds(176,172,180,28);
        
        BackButton.setBounds(6,310,120,33);
        clearButton.setBounds(350,310,120,33);
        SetLimitButton.setBounds(176,260,156,33);
        LimitDisplayButton.setBounds(180,310,120,33);

        //adding the objects to credit limit panel
        CreditLimit_Panel.add(CreditLimitTitle);
        CreditLimit_Panel.add(CreditLimit);
        CreditLimit_Panel.add(GracePeriod);
        CreditLimit_Panel.add(ctf8);
        CreditLimit_Panel.add(ctf9);
        CreditLimit_Panel.add(BackButton);
        CreditLimit_Panel.add(clearButton);
        CreditLimit_Panel.add(SetLimitButton);
        CreditLimit_Panel.add(LimitDisplayButton);

        //adding actionlistener to the button 
        BackButton.addActionListener(this);
        clearButton.addActionListener(this);
        SetLimitButton.addActionListener(this);
        LimitDisplayButton.addActionListener(this);

        //setting the background of the panel and buttons
        CreditLimit_Panel.setBackground(new Color(165,202,205));
        CreditLimitTitle.setFont(new Font("Arial Black",Font.PLAIN,18));
        BackButton.setBackground(new Color(246,176,146));
        clearButton.setBackground(new Color(246,176,146));
        SetLimitButton.setBackground(new Color(246,176,146));
        LimitDisplayButton.setBackground(new Color(246,176,146));

        //adding frames to the panel, setting the size, visibility and layout 
        CreditLimit_Frame.add(CreditLimit_Panel);
        CreditLimit_Frame.setSize(500,400);
        CreditLimit_Panel.setLayout(null);
        CreditLimit_Frame.setVisible(false);
        CreditLimit_Frame.setResizable(false);
        CreditLimit_Frame.setDefaultCloseOperation(CreditLimit_Frame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent cw)
    {
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==DisplayButton)
        {
            for(BankCard bankCard: bankcard)
            {
                if(bankCard instanceof DebitCard)
                {
                    DebitCard debitcard = (DebitCard) bankCard;
                    debitcard.display();
                }
            }
        }

        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==AddCardButton)
        {
            try
            {
                int CardID = Integer.parseInt(tf1.getText());
                String ClientName = tf2.getText();
                int PINnumber = Integer.parseInt(tf3.getText());
                double BalanceAmount = Double.parseDouble(tf4.getText());
                String BankAccount= tf5.getText();
                String IssuerBank = tf6.getText();
                if(CardID<=0 || ClientName.equals("") || IssuerBank.equals("") || BankAccount.equals("") || PINnumber<=0 || BalanceAmount<0) 
                {
                    JOptionPane.showMessageDialog(Debit_Frame,"Please Fill the required area to add the card","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    for(BankCard bankCard: bankcard)
                    {
                        if(bankCard instanceof DebitCard && bankCard.get_CardID()==CardID)
                        {
                            JOptionPane.showMessageDialog(Debit_Frame,"The cardId you have entered already exists","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                    DebitCard objDebitCard = new DebitCard(CardID,BalanceAmount,BankAccount,IssuerBank,ClientName,PINnumber);
                    bankcard.add(objDebitCard);
                    JOptionPane.showMessageDialog(Debit_Frame,"The card has been added successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch(NumberFormatException cw1)
            {
                JOptionPane.showMessageDialog(Debit_Frame,"Please enter valid information to the areas","ERROR",JOptionPane.ERROR_MESSAGE);
            }   
        }

        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==ClearButton)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            tf6.setText("");
        }
        
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==WithdrawButton)
        {
            WithDraw_Frame.setVisible(true);
            Debit_Frame.setVisible(false);
        }
             
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==WithdrawAmountButton)
        {
            try
            {
                int CardID = Integer.parseInt(tf1.getText());
                int pinnumber = Integer.parseInt(tf7.getText());
                int withdrawalAmount = Integer.parseInt(tf8.getText());
                double BalanceAmount = Double.parseDouble(tf4.getText());
                String dateOfWithdrawal = DayCombobox.getSelectedItem().toString()+"-"+ MonthCombobox.getSelectedItem().toString()+"-"+YearCombobox.getSelectedItem().toString();
                if(tf3.getText().equals( tf7.getText()))
                {
                    for(BankCard bankCard: bankcard)
                    {
                        if(bankCard instanceof DebitCard)
                        {
                            DebitCard debitcard = (DebitCard) bankCard;
                            if(withdrawalAmount>debitcard.get_BalanceAmount())
                            {
                                JOptionPane.showMessageDialog(WithDraw_Frame,"Transaction failed due to insufficient balance","ERROR",JOptionPane.ERROR_MESSAGE); 
                                return;
                            }
                            if(debitcard.get_CardID()== CardID)
                            {
                                debitcard.withdraw(withdrawalAmount,dateOfWithdrawal,pinnumber);
                                JOptionPane.showMessageDialog(WithDraw_Frame,"The amount has been withdrawn successfully.withdrawalAmount:"+withdrawalAmount,"Successful",JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(WithDraw_Frame,"The PIN number you have entered is incorrect","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
            catch(NumberFormatException cw2)
            {
                JOptionPane.showMessageDialog(WithDraw_Frame,"Please enter valid information to the areas","ERROR",JOptionPane.ERROR_MESSAGE);
            } 
        }

        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==backButton)
        {
            WithDraw_Frame.setVisible(false);
            Debit_Frame.setVisible(true);  
        }
        
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==WithdrawClearButton)
        {
            tf7.setText("");
            tf8.setText("");
            DayCombobox.setSelectedIndex(0);
            MonthCombobox.setSelectedIndex(0);
            YearCombobox.setSelectedIndex(0);
        }

         // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==WithdrawDisplayButton)
        {
            for(BankCard bankCard: bankcard)
            {
                if(bankCard instanceof DebitCard)
                {
                    DebitCard debitcard = (DebitCard) bankCard;
                    debitcard.display();
                }
            }
        }
        
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==SwitchButton)
        {
            Credit_Frame.setVisible(true);
            Debit_Frame.setVisible(false);
        }

        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==CDisplayButton)
        {
            for(BankCard bankCard: bankcard)
            {
                if(bankCard instanceof CreditCard)
                {
                    CreditCard creditcard = (CreditCard) bankCard;
                    creditcard.display();
                }
            }
        }
    
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==AddCCardButton)
        {
            try
            {
                String CClientName = ctf1.getText();
                int CCardID =  Integer.parseInt(ctf2.getText());
                String CIssuerBank = ctf3.getText();
                double InterestRate = Double.parseDouble(ctf4.getText());
                String CBankAccount = ctf5.getText();
                int CVCnumber = Integer.parseInt(ctf6.getText());
                double CBalanceAmount = Double.parseDouble(ctf7.getText());
                String ExpirationDate = daycombobox.getSelectedItem().toString()+"-"+ monthcombobox.getSelectedItem().toString()+"-"+yearcombobox.getSelectedItem();
                if(CCardID<=0 || CClientName.equals("") || CIssuerBank.equals("") || CBankAccount.equals("") || CBalanceAmount<0 || InterestRate<=0|| CVCnumber<=0)
                {
                    JOptionPane.showMessageDialog(Credit_Frame,"Please Fill the required area to add the card","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    for(BankCard bankCard: bankcard)
                    {
                        if(bankCard instanceof CreditCard && bankCard.get_CardID()== CCardID)
                        {
                            JOptionPane.showMessageDialog(Credit_Frame,"The cardId you have entered already exists","Error",JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                    CreditCard objCreditCard = new CreditCard(CCardID,CBalanceAmount,CBankAccount,CIssuerBank,CClientName,CVCnumber,InterestRate,ExpirationDate);
                    bankcard.add(objCreditCard);
                    JOptionPane.showMessageDialog(Credit_Frame,"The card has been added successfully","Successful",JOptionPane.INFORMATION_MESSAGE);
                }
            }

            catch(NumberFormatException cw3)
            {
                JOptionPane.showMessageDialog(Credit_Frame,"Please enter valid information to the areas","ERROR",JOptionPane.ERROR_MESSAGE);
            }   
        }

        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==CClearButton)
        {
            ctf1.setText("");
            ctf2.setText("");
            ctf3.setText("");
            ctf4.setText("");
            ctf5.setText("");
            ctf6.setText("");
            ctf7.setText("");
            daycombobox.setSelectedIndex(0);
            monthcombobox.setSelectedIndex(0);
            yearcombobox.setSelectedIndex(0);
        }
        
         // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==Switch2DebitButton)
        {
            Credit_Frame.setVisible(false);
            Debit_Frame.setVisible(true);
        }
        
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==CreditlimitButton)
        {
            Credit_Frame.setVisible(false);
            CreditLimit_Frame.setVisible(true);
        }
        
        // method of button to perform its action as needed through actionlistener
       if(cw.getSource()==SetLimitButton)
        {
            try{
            int CCardID =  Integer.parseInt(ctf2.getText());
            double CreditLimit = Double.parseDouble(ctf8.getText());
            int GracePeriod = Integer.parseInt(ctf9.getText());
            for(BankCard bankCard: bankcard)
            {
                if(bankCard instanceof CreditCard)
                {
                    CreditCard creditcard = (CreditCard) bankCard;
                    if(CreditLimit>creditcard.get_BalanceAmount())
                    {
                        JOptionPane.showMessageDialog(CreditLimit_Frame,"The following credit limit cannot be granted","ERROR",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(creditcard.get_CardID()==CCardID)
                    {
                            creditcard.set_CreditLimit(CreditLimit,GracePeriod);
                            JOptionPane.showMessageDialog(CreditLimit_Frame,"Your new credit limit has been set along with a grace period","Successful",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            }
            catch(NumberFormatException cw1)
            {
                JOptionPane.showMessageDialog(CreditLimit_Frame,"Please enter valid information to the areas","ERROR",JOptionPane.ERROR_MESSAGE);
            } 
        }
       
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==CancelCardButton)
        {
            int CCardID =  Integer.parseInt(ctf2.getText());
            for(BankCard bankCard: bankcard)
            {
                if(bankCard instanceof CreditCard)
                {
                    CreditCard creditcard = (CreditCard) bankCard;
                    if(creditcard.get_CardID()==CCardID)
                    {
                        creditcard.cancelCreditCard();
                        JOptionPane.showMessageDialog(Credit_Frame,"The following card has been Cancelled","Successful",JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()== clearButton)
        {
            ctf8.setText("");
            ctf9.setText("");
        }
        
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==BackButton)
        {
            Credit_Frame.setVisible(true);
            CreditLimit_Frame.setVisible(false);
        }
        
        // method of button to perform its action as needed through actionlistener
        if(cw.getSource()==LimitDisplayButton)
        {
            for(BankCard bankCard: bankcard)
            {
                if(bankCard instanceof CreditCard)
                {
                    CreditCard creditcard = (CreditCard) bankCard;
                    creditcard.display();
                }
            }
        }
    }
    //creation of main method to create new instance of bank GUI
       public static void main(String[]args)
    {
        new Bank_GUI();
    }
}