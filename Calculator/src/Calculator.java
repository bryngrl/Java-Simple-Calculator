import java.util.Scanner;

public class Calculator {
    static void Addition(int num1, int num2) {
        int answer = num1 + num2;
        System.out.println("The answer is: " + answer);
    }

    static void Subtraction(int num1, int num2) {
        int answer = num1 - num2;
        System.out.println("The answer is: " + answer);
    }

    static void Multiplication(int num1, int num2) {
        int answer = num1 * num2;
        System.out.println("The answer is: " + answer);
    }

    static void Division(int num1, int num2) {
        int answer = num1 / num2;

        int remainder = num1 % num2;
        if (remainder != 0) {
            System.out.print("The answer is: " + answer + " with a remainder of " + remainder);
        } else {
            System.out.println("The answer is: " + answer);
        }
    }

    // The below code is the main
    public static void main(String[] args) throws Exception {

        // Declartion of the scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        int num1 = scanner.nextInt();
        System.out.println("Second number: ");
        int num2 = scanner.nextInt();
        System.out.println("[1]Addition:\n[2]Subtraction:\n[3]Multiplication:\n[4]Division:");
        System.out.println("Enter a number for Operation: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Addition(num1, num2);
        } else if (choice == 2) {
            Subtraction(num1, num2);
        } else if (choice == 3) {
            Multiplication(num1, num2);
        } else if (choice == 4) {
            Division(num1, num2);
        }

    }
}
