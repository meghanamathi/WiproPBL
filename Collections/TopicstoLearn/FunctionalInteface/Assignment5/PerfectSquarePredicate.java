package Collections.TopicstoLearn.FunctionalInteface.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PerfectSquarePredicate {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                4, 7, 9, 10, 16,
                21, 25, 30, 36, 50
        ));

        Predicate<Integer> perfectSquare = number -> {

            int root = (int) Math.sqrt(number);

            return root * root == number;

        };

        System.out.println("Perfect Square Numbers");

        numbers.stream()
                .filter(perfectSquare)
                .forEach(System.out::println);

    }

}