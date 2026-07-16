package Collections.TopicstoLearn.List.Assignment7;

public class Employee {

    private int empId;
    private String empName;
    private String email;
    private String gender;
    private double salary;

    public Employee() {

    }

    public Employee(int empId, String empName, String email,
                    String gender, double salary) {

        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {

        return "Employee ID : " + empId +
               "\nEmployee Name : " + empName +
               "\nEmail : " + email +
               "\nGender : " + gender +
               "\nSalary : " + salary;

    }

}
