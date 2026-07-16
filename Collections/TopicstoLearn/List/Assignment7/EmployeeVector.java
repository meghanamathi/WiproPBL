package Collections.TopicstoLearn.List.Assignment7;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(
                101,
                "Meghana",
                "meghana@gmail.com",
                "Female",
                50000));

        employees.add(new Employee(
                102,
                "Rahul",
                "rahul@gmail.com",
                "Male",
                45000));

        employees.add(new Employee(
                103,
                "Anjali",
                "anjali@gmail.com",
                "Female",
                60000));

        System.out.println("Displaying Employee Details using Iterator");

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

            System.out.println();

        }

        System.out.println("--------------------------------------");

        System.out.println("Displaying Employee Details using Enumeration");

        Enumeration<Employee> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {

            System.out.println(enumeration.nextElement());

            System.out.println();

        }

    }

}