import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_SafeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));

            if (b != 0) {
                System.out.println("Division: " + (a / b));
                System.out.println("Modulus: " + (a % b));
            } else {
                try {
                    double result = a / 0;
                    System.out.println(result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                }

                System.out.println("Error: Modulus by zero is not allowed.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            sc.close();
        }
    }
}
