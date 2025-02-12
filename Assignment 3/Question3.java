import java.util.Objects;
import java.util.*;

class Employee {
    private String name;
    private int age;
    private String designation;

    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Designation: " + designation;
    }
}

class SalaryComparator implements Comparator<Map.Entry<Employee, Double>> {
    @Override
    public int compare(Map.Entry<Employee, Double> e1, Map.Entry<Employee, Double> e2) {
        return Double.compare(e2.getValue(), e1.getValue()); 
    }
}

public class Question3 {
    public static void main(String[] args) {
      
        Map<Employee, Double> employeeSalaryMap = new HashMap<>();

        employeeSalaryMap.put(new Employee("Alice", 30, "Manager"), 80000.0);
        employeeSalaryMap.put(new Employee("John", 28, "Developer"), 60000.0);
        employeeSalaryMap.put(new Employee("Emma", 35, "Analyst"), 75000.0);
        employeeSalaryMap.put(new Employee("Michael", 40, "Director"), 100000.0);
        employeeSalaryMap.put(new Employee("Sophia", 32, "HR"), 70000.0);

        // Convert Map to List and Sort
        List<Map.Entry<Employee, Double>> entryList = new ArrayList<>(employeeSalaryMap.entrySet());
        entryList.sort(new SalaryComparator()); // ✅ Fixed: Sort the List

        // Display the sorted employees
        System.out.println("Employees sorted by Salary (Descending Order):");
        for (Map.Entry<Employee, Double> entry : entryList) {
            System.out.println(entry.getKey() + " | Salary: $" + entry.getValue());
        }
    }
}