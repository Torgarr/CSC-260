import java.util.Scanner;

public class DisplayPrimeFactor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompts user for input and stores values
        System.out.print("Enter a positive integer: ");
        double dnumber = input.nextDouble();
        int number = (int)dnumber;
        int index = 2;

        // Makes sure that there are no errors by dividing by 0 or negative numbers
        if (number <= 0) {
            while (number <= 0) {
                System.out.print("The number you entered is invalid please enter a valid positive integer: ");
                dnumber = input.nextDouble();
                number = (int)dnumber;
            }
            System.out.print("The prime factors are: ");

            // Outputs prime factors after second input if user tried to enter 0 or negative number
            while (number / index != 1) {
                if (number % index == 0) {
                    System.out.print(index + " ");
                    number /= index;
                } else
                    index++;
            }
            System.out.print(number);
        }

        // Prints out no prime factors if number entered is 1
        else if (number == 1)
            System.out.print("The prime factors are: ");

        // Outputs prime factors
        else{
            System.out.print("The prime factors are: ");

            while (number / index != 1) {
                if (number % index == 0) {
                    System.out.print(index + " ");
                    number /= index;
                } else
                    index++;
            }
            System.out.print(number);
        }
    }
}