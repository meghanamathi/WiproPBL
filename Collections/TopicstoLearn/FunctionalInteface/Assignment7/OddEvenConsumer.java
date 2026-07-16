package Collections.TopicstoLearn.FunctionalInteface.Assignment7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                2, 5, 10, 13, 18,
                25, 30, 41, 50, 61
        ));

        Consumer<Integer> consumer = number -> {

            if (number % 2 == 0) {

                System.out.println(number + " Even");

            }

            else {

                System.out.println(number + " Odd");

            }

        };

        numbers.forEach(consumer);

    }

}
