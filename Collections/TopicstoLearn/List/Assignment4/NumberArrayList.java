package Collections.TopicstoLearn.List.Assignment4;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        // ArrayList that stores only Number objects
        ArrayList<Number> numbers = new ArrayList<>();

        // Adding different types of numbers
        numbers.add(10);          // Integer
        numbers.add(25.5);        // Double
        numbers.add(35.75f);      // Float
        numbers.add(100L);        // Long
        numbers.add((short)50);   // Short
        numbers.add((byte)5);     // Byte

        System.out.println("Elements in the ArrayList:");

        for (Number num : numbers) {

            System.out.println(num);

        }

    }

}
