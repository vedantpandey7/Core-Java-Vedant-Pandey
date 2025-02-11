import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String fullName;
    Long salary;
    String city;

    public Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }
}

public class Question4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul Kumar Singh", 4000L, "Delhi"),
            new Employee("Amit Sharma", 6000L, "Delhi"),
            new Employee("Rahul Sharma", 4500L, "Delhi"),
            new Employee("Vikas Gupta", 3000L, "Mumbai"),
            new Employee("Neha Verma", 3500L, "Delhi"),
            new Employee("Amit Kumar", 4800L, "Delhi"),
            new Employee("Rahul Roy", 4000L, "Delhi")
        );

        Set<String> uniqueFirstNames = employees.stream()
            .filter(emp -> emp.salary < 5000 && "Delhi".equalsIgnoreCase(emp.city))
            .map(Employee::getFirstName) 
            .collect(Collectors.toSet()); 

        System.out.println("Unique first names of eligible employees: " + uniqueFirstNames);
    }
}
