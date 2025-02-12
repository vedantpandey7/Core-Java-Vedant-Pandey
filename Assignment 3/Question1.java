import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        List<Double> numbers = new ArrayList<>();

        
        System.out.println("Enter 5 floating-point numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            double num = scanner.nextDouble(); 
            numbers.add(num);
        }

        
        scanner.close();


        Iterator<Double> iterator = numbers.iterator();
        double sum = 0;

        while (iterator.hasNext()) {
            sum += iterator.next();
        }

        
        System.out.println("Sum of the numbers in the list: " + sum);
    }
}
