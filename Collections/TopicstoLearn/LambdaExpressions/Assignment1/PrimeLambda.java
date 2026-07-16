package Collections.TopicstoLearn.LambdaExpressions.Assignment1;

import java.util.ArrayList;
import java.util.Random;

public class PrimeLambda {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            numbers.add(random.nextInt(100) + 1);
        }

        System.out.println("All Numbers");

        numbers.forEach(n -> System.out.print(n + " "));

        System.out.println("\n");

        System.out.println("Prime Numbers");

        numbers.stream()
                .filter(PrimeLambda::isPrime)
                .forEach(n -> System.out.print(n + " "));
    }

    public static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;

        }

        return true;
    }

}