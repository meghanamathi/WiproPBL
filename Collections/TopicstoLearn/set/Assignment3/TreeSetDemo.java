package Collections.TopicstoLearn.set.Assignment3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("India");
        treeSet.add("Australia");
        treeSet.add("Japan");
        treeSet.add("USA");
        treeSet.add("Canada");

        System.out.println("Reverse Order");

        Iterator<String> reverseIterator = treeSet.descendingIterator();

        while (reverseIterator.hasNext()) {

            System.out.println(reverseIterator.next());

        }

        System.out.println();

        System.out.println("Ascending Order");

        Iterator<String> iterator = treeSet.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        System.out.println();

        String search = "India";

        if (treeSet.contains(search)) {

            System.out.println(search + " exists.");

        }

        else {

            System.out.println(search + " does not exist.");

        }

    }

}