package Collections.TopicstoLearn.StreamAPI.Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Meghana", 22, "Hyderabad"));
        employees.add(new Employee(102, "Rahul", 24, "Pune"));
        employees.add(new Employee(103, "Anjali", 23, "Chennai"));
        employees.add(new Employee(104, "Harish", 25, "Pune"));
        employees.add(new Employee(105, "Kiran", 21, "Bangalore"));

        List<Employee> puneEmployees = employees.stream()
                .filter(e -> e.getLocation().equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune");

        puneEmployees.forEach(System.out::println);

    }

}