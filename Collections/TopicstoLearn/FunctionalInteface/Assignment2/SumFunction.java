package Collections.TopicstoLearn.FunctionalInteface.Assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class SumFunction {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                10, 20, 30, 40, 50,
                60, 70, 80, 90, 100
        ));

        Function<ArrayList<Integer>, Integer> sumFunction = list -> {

            int sum = 0;

            for (int num : list) {
                sum += num;
            }

            return sum;

        };

        int sum = sumFunction.apply(numbers);

        System.out.println("Numbers : " + numbers);

        System.out.println("Sum = " + sum);

    }

}