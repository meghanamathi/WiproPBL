package Collections.TopicstoLearn.List.Assignment2;

public class TestEmployee {

    public static void main(String[] args) {

        EmployeeDB employeeDB = new EmployeeDB();

        Employee e1 = new Employee(
                101,
                "Meghana",
                "meghana@gmail.com",
                "Female",
                50000);

        Employee e2 = new Employee(
                102,
                "Rahul",
                "rahul@gmail.com",
                "Male",
                45000);

        Employee e3 = new Employee(
                103,
                "Anjali",
                "anjali@gmail.com",
                "Female",
                60000);

        employeeDB.addEmployee(e1);
        employeeDB.addEmployee(e2);
        employeeDB.addEmployee(e3);

        System.out.println("EMPLOYEE DETAILS");

        employeeDB.displayEmployees();

        System.out.println();

        System.out.println(employeeDB.showPaySlip(102));

        System.out.println();

        if (employeeDB.deleteEmployee(102)) {

            System.out.println("Employee Deleted Successfully.");

        }

        else {

            System.out.println("Employee Not Found.");

        }

        System.out.println();

        System.out.println("UPDATED EMPLOYEE LIST");

        employeeDB.displayEmployees();

    }

}