import java.util.Scanner;

@FunctionalInterface
interface NumberComparator {
    boolean isFirstGreater(int a, int b);
}

@FunctionalInterface
interface NumberIncrementer {
    int increment(int num);
}

@FunctionalInterface
interface StringConcatenator {
    String concatenate(String str1, String str2);
}

@FunctionalInterface
interface StringConverter {
    String toUpperCase(String str);
}

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberComparator comparator = (a, b) -> a > b;
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Is " + num1 + " greater than " + num2 + "? " + comparator.isFirstGreater(num1, num2));
        
        NumberIncrementer incrementer = num -> num + 1;
        System.out.print("Enter a number to increment: ");
        int numToIncrement = scanner.nextInt();
        System.out.println("Incremented value: " + incrementer.increment(numToIncrement));
        
        StringConcatenator concatenator = (str1, str2) -> str1 + str2;
        System.out.print("Enter first string: ");
        scanner.nextLine(); 
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        System.out.println("Concatenated String: " + concatenator.concatenate(str1, str2));

        StringConverter converter = str -> str.toUpperCase();
        System.out.print("Enter a string to convert to uppercase: ");
        String strToConvert = scanner.nextLine();
        System.out.println("Uppercase: " + converter.toUpperCase(strToConvert));

        scanner.close();
    }
}
