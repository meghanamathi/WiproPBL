package Collections.TopicstoLearn.StreamAPI.Assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                -10, 15, -8, 22, -5, -12, 17, -18, 9, -20
        ));

        List<Integer> result = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative Even Numbers");

        result.forEach(System.out::println);

    }

}