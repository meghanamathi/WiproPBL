package WrapperClass.Assignment4;

public class Employee implements Cloneable {

    private int empId;
    private String empName;
    private double salary;

    // Default Constructor
    public Employee() {

    }

    // Parameterized Constructor
    public Employee(int empId, String empName, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.salary = salary;

    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Clone Method
    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();

    }

    // Display Employee Details
    public void display() {

        System.out.println("Employee ID     : " + empId);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Salary          : " + salary);

    }

}