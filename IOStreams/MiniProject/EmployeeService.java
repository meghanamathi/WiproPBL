package IOStreams.MiniProject;

import java.util.ArrayList;

public class EmployeeService {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {

        employees.add(employee);

    }

    public void displayEmployees() {

        if (employees.isEmpty()) {

            System.out.println("No Employees Found.");
            return;

        }

        System.out.println("-----Report-----");

        for (Employee employee : employees) {

            System.out.println(
                    employee.getEmployeeId() + " "
                    + employee.getEmployeeName() + " "
                    + employee.getEmployeeAge() + " "
                    + employee.getEmployeeSalary());

        }

        System.out.println("-----End of Report-----");

    }

}