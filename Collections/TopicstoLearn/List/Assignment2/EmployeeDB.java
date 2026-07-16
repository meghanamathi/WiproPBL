package Collections.TopicstoLearn.List.Assignment2;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    // Add Employee
    public boolean addEmployee(Employee e) {

        return list.add(e);

    }

    // Delete Employee
    public boolean deleteEmployee(int empId) {

        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {

            Employee emp = iterator.next();

            if (emp.getEmpId() == empId) {

                iterator.remove();

                return true;

            }

        }

        return false;

    }

    // Display Pay Slip
    public String showPaySlip(int empId) {

        for (Employee emp : list) {

            if (emp.getEmpId() == empId) {

                return "Pay Slip for Employee ID "
                        + empId
                        + "\nEmployee Name : "
                        + emp.getEmpName()
                        + "\nSalary : "
                        + emp.getSalary();

            }

        }

        return "Employee not found.";

    }

    // Display All Employees
    public void displayEmployees() {

        for (Employee emp : list) {

            emp.GetEmployeeDetails();

        }

    }

}
