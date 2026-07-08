package Oops.TopicstoLearn.Inheritance.Assignment2;

public class Test{

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Meghana",
                600000,
                2026,
                "NI12345");

        System.out.println("Name : " + emp.getName());
        System.out.println("Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("Insurance Number : " + emp.getNationalInsuranceNumber());
    }
}
