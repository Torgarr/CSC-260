/* Tests the Account class by using the getter and setter methods created in the Account class
   Class: CSC 260-001
   Author: Jakob Banta
 */
public class TestAccount {

    // Creates a method that prints out an accounts information
    public static void printAccount(Account act){
        System.out.printf("%11d  $%,10.2f %5.2f%% %29s\n", act.getId(), act.getBalance(), act.getAnnualInterestRate(), act.getDateCreated());
    }
    public static void main(String[] args){
        System.out.printf("The average account balance is: $%.2f\n\n", Account.averageBalance());

        // Creates a default account then modifies it
        // then it displays the information, average balance, and then closes the account
        Account account1 = new Account();
        System.out.println("Default account:");
        printAccount(account1);
        account1.setId(1122);
        account1.setBalance(20000);
        account1.setAnnualInterestRate(4.5);
        System.out.println("Modified account:");
        printAccount(account1);
        account1.withdraw(2500);
        account1.diposit(3000);
        System.out.println("After withdrawal and deposit:");
        printAccount(account1);
        account1.awardMonthlyInterest();
        account1.awardMonthlyInterest();
        account1.awardMonthlyInterest();
        account1.awardMonthlyInterest();
        account1.awardMonthlyInterest();
        account1.awardMonthlyInterest();
        System.out.println("After six months of interest:");
        printAccount(account1);
        System.out.printf("\nThe average account balance is: $%.2f\n", Account.averageBalance());
        account1.close(1122);
        System.out.println();

        // Creates an array of 5 different accounts and displays them
        System.out.println("Array of five accounts with random balances:");
        Account[] accountArray = new Account[5];
        for (int i = 0; i < accountArray.length; i++){
            accountArray[i] = new Account(i + 11, (Math.random() * (150000.00 - 50000.00) + 1) + 50000.00, 3);
        }
        for(int i = 0; i < accountArray.length; i++){
            printAccount(accountArray[i]);
        }

        // Displays the average account balance
        System.out.printf("\nThe average account balance is: $%.2f\n\n", Account.averageBalance());

        // Adds 6 months of interest to each account and displays them
        System.out.println("Array after awarding 6 months of interest:");
        for(int i = 0; i < accountArray.length; i++) {
            for(int j = 0; j < 6; j++) {
                accountArray[i].awardMonthlyInterest();
            }
            printAccount(accountArray[i]);
        }
        // Displays the new average account balance
        System.out.printf("\nThe average account balance is: $%.2f\n", Account.averageBalance());
    }
}
