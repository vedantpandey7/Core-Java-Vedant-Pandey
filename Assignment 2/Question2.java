import java.util.Scanner;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class MathUtil {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathUtil mathUtil = new MathUtil();

        MathOperation addition = mathUtil::add;

        MathOperation subtraction = mathUtil::subtract;

        MathOperation multiplication = MathUtil::multiply;

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition result: " + addition.operate(num1, num2));
        System.out.println("Subtraction result: " + subtraction.operate(num1, num2));
        System.out.println("Multiplication result: " + multiplication.operate(num1, num2));

        scanner.close();
    }
}
