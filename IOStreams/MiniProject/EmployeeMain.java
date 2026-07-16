package IOStreams.MiniProject;

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

        int choice;

        do {

            System.out.println("\nMain Menu");

            System.out.println("1. Add an Employee");

            System.out.println("2. Display All");

            System.out.println("3. Exit");

            System.out.print("Enter your choice : ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID : ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Employee Name : ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Employee Age : ");
                    int age = scanner.nextInt();

                    System.out.print("Enter Employee Salary : ");
                    double salary = scanner.nextDouble();

                    Employee employee = new Employee(id, name, age, salary);

                    service.addEmployee(employee);

                    System.out.println("Employee Added Successfully.");

                    break;

                case 2:

                    service.displayEmployees();

                    break;

                case 3:

                    System.out.println("Exiting the System");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        } while (choice != 3);

        scanner.close();

    }

}