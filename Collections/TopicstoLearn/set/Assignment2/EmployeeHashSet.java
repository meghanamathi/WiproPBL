package Collections.TopicstoLearn.set.Assignment2;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Meghana");
        employees.add("Rahul");
        employees.add("Anjali");
        employees.add("Kiran");
        employees.add("Harish");

        Iterator<String> iterator = employees.iterator();

        System.out.println("Employee Names");

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }

}