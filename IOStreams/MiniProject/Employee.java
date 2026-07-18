package IOStreams.MiniProject;

public class Employee {

    private int employeeId;
    private String employeeName;
    private int employeeAge;
    private double employeeSalary;

    public Employee(int employeeId, String employeeName, int employeeAge, double employeeSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

}