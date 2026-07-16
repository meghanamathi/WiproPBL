package Collections.TopicstoLearn.List.Assignment6;

import java.util.Iterator;
import java.util.Vector;

public class MonthsVector {

    public static void main(String[] args) {

        Vector<String> months = new Vector<>();

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

        Iterator<String> iterator = months.iterator();

        System.out.println("Months of the Year:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}