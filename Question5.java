import java.util.InputMismatchException;
import java.util.Scanner;

public class Question5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
            int result = 100 / num;
            System.out.println("Result: 100 / " + num + " = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Alert: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Alert: Please enter a valid integer.");
        } finally {
            scanner.close();
            System.out.println("Program completed.");
        }
    }
}
