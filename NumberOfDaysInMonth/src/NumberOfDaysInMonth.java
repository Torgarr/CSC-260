import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        //Gets users input
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the month as an integer (Ex: 1 for January): ");
        int month = input.nextInt();

        //Determines the days in that month
        switch (month){
            case 1: System.out.println("There are 31 days in that month.");
                break;
            case 2: System.out.print("Enter the year as an integer: ");
                int year = input.nextInt();

            //Determines if leap year
                int days = (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))? 29 : 28);
                System.out.println("There are " + days + " days in that month.");
                break;
            case 3: System.out.println("There are 31 days in that month.");
                break;
            case 4: System.out.println("There are 30 days in that month.");
                break;
            case 5: System.out.println("There are 31 days in that month.");
                break;
            case 6: System.out.println("There are 30 days in that month.");
                break;
            case 7: System.out.println("There are 31 days in that month.");
                break;
            case 8: System.out.println("There are 31 days in that month.");
                break;
            case 9: System.out.println("There are 30 days in that month.");
                break;
            case 10: System.out.println("There are 31 days in that month.");
                break;
            case 11: System.out.println("There are 30 days in that month.");
                break;
            case 12: System.out.println("There are 31 days in that month.");
                break;
            default: System.out.println("Error: Invalid month number");
            System.exit(1);
        }
    }
}
