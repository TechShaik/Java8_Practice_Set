package java8_practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;

     public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

     public String getDepartment() {
        return department;
    }
    
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
         List<Employee> employees = Arrays.asList(
            new Employee("Shaik", "CSE"),
            new Employee("Shahid", "ECE"),
            new Employee("Sravani", "CSE"),
            new Employee("Suhail", "MEC"));

         Map<String, List<Employee>> groupedByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

         groupedByDepartment.forEach((department, empList) -> {
            System.out.println(department + ": " + empList);
        });
    }
}
