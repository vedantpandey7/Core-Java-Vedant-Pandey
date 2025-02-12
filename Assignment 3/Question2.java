import java.util.*;

class Employee implements Comparable<Employee> {
    private Double age;
    private Double salary;
    private String firstName;
    private String lastName;


    public Employee(Double age, Double salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Employee other) {
        int firstNameComparison = this.firstName.compareTo(other.firstName);
        return (firstNameComparison != 0) ? firstNameComparison : this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Age: " + age + " | Salary: $" + salary;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getSalary().compareTo(e2.getSalary());
    }
}

public class Question2 {
    public static void main(String[] args) {
 
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(30.0, 60000.0, "Aman", "Awasthi"));
        employees.add(new Employee(28.0, 75000.0, "Jatin", "Jaiswal"));
        employees.add(new Employee(35.0, 50000.0, "Esha", "Gupta"));
        employees.add(new Employee(40.0, 90000.0, "Prabhat", "Kumar"));
        employees.add(new Employee(29.0, 75000.0, "Ritesh", "Gupta"));

        Collections.sort(employees);
        System.out.println("Employees sorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.sort(new SalaryComparator());
        System.out.println("\nEmployees sorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
