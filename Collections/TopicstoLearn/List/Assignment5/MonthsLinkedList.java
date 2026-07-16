package Collections.TopicstoLearn.List.Assignment5;

import java.util.Iterator;
import java.util.LinkedList;

public class MonthsLinkedList {

    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> months = new LinkedList<>();

        // Add all months
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Create an Iterator
        Iterator<String> iterator = months.iterator();

        System.out.println("Months of the Year:");

        // Print all elements
        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

    }

}