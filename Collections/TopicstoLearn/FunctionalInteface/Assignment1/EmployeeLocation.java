package Collections.TopicstoLearn.FunctionalInteface.Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Meghana", "Hyderabad", 35000));
        employees.add(new Employee(102, "Rahul", "Pune", 45000));
        employees.add(new Employee(103, "Anjali", "Chennai", 40000));
        employees.add(new Employee(104, "Harish", "Bangalore", 50000));
        employees.add(new Employee(105, "Kiran", "Delhi", 38000));

        Function<Employee, String> function = Employee::getLocation;

        List<String> locations = employees.stream()
                .map(function)
                .collect(Collectors.toList());

        System.out.println("Employee Locations");

        locations.forEach(System.out::println);

    }

}