package interactivejavaapplication;
import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            // Display menu
            System.out.println("\nChoose an option:");
            System.out.println("1. Greet");
            System.out.println("2. Sum of two numbers");
            System.out.println("3. Check if a number is even or odd");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    greetUser(scanner);
                    break;
                case 2:
                    sumOfTwoNumbers(scanner);
                    break;
                case 3:
                    checkEvenOrOdd(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thankyou For Using App. Goodbye!");
                    break;
                default:
                    System.out.println("Please Choose Correct Number. Try Again.");
            }
        }

        scanner.close();
    }

    private static void greetUser(Scanner scanner) {
        System.out.print("Enter your name: ");
        scanner.nextLine(); // Consume newline left-over
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to the Modern Java application.");
    }

    private static void sumOfTwoNumbers(Scanner scanner) {
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    }

    private static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
