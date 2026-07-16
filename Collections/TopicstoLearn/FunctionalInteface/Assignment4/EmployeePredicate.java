package Collections.TopicstoLearn.FunctionalInteface.Assignment4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeePredicate {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Meghana", 8000));
        employees.add(new Employee(102, "Rahul", 15000));
        employees.add(new Employee(103, "Anjali", 9500));
        employees.add(new Employee(104, "Harish", 22000));
        employees.add(new Employee(105, "Kiran", 7000));

        Predicate<Employee> salaryPredicate =
                employee -> employee.getSalary() < 10000;

        System.out.println("Employees having Salary less than 10000");

        employees.stream()
                .filter(salaryPredicate)
                .forEach(employee ->
                        System.out.println(employee.getName()));

    }

}
