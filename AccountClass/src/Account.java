/* Creates the Account classes that is used in TestAccount. This allows you to create accounts either using the
   default data fields or you can initialise the values for id, balance, and annualInterestRate. This also uses getters
   and setters to modify the data values.
   Class: CSC 260-001
   Author: Jakob Banta
 */
import java.util.Date;

// Creates the Account class with its Private data fields
public class Account{
    private int id = Integer.MAX_VALUE;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated = new java.util.Date();
    private static int numberOfAccounts;
    private static double totalValueOfAccounts;

    // Creates a no-arg constructor that creates a default account
    public Account(){
        numberOfAccounts++;
    }

    // Creates a second constructor that receives initial values for id, balance, and annualInterestRate
    public Account(int newId, double newBalance, double newAnnualInterestRate){
        id = newId;
        balance = newBalance;
        annualInterestRate = newAnnualInterestRate;
        numberOfAccounts++;
        totalValueOfAccounts += newBalance;
    }

    // Creates accessor  and  mutator  methods  (“getters  and  setters”)  for  id,  balance,  and annualInterestRate
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setId(int newId){
        id = newId;
    }
    public void setBalance(double newBalance){
        totalValueOfAccounts -= balance;
        totalValueOfAccounts += newBalance;
        balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

    // Creates an accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Creates a method named withdraw that withdraws a specified amount from the account
    public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
        totalValueOfAccounts -= withdrawAmount;
    }

    // Creates a method named deposit that deposits a specified amount to the account
    public void diposit(double dipositAmount){
        balance += dipositAmount;
        totalValueOfAccounts += dipositAmount;
    }

    // Creates a method named getMonthlyInterestRate that returns the account’s monthly interest rate.
    public double getMonthlyInterestRate(){
        double monthlyInterestRate = annualInterestRate / 100;
        monthlyInterestRate = monthlyInterestRate / 12;
        return monthlyInterestRate;
    }

    // Creates a method called awardMonthlyInterest for depositing one month’s worth of interest into the account.
    public void awardMonthlyInterest(){
        totalValueOfAccounts += getMonthlyInterestRate() * balance;
        balance += getMonthlyInterestRate() * balance;
    }

    // Creates a close  method  for closing an account
    public void close(int newId){
        numberOfAccounts--;
        totalValueOfAccounts -= balance;
        System.out.print("Closing account " + newId + "\n");
    }

    // Creates a static  method  called  averageBalance  that  returns  the  average  balance  of  all  of  the accounts
    static double averageBalance(){
        if (numberOfAccounts <= 0)
            return 0;
        else
            return (totalValueOfAccounts / numberOfAccounts);
    }
}