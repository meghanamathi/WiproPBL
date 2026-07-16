package Collections.TopicstoLearn.FunctionalInteface.Assignment8;

import java.util.ArrayList;
import java.util.function.Supplier;

public class PrimeSupplier {

    public static void main(String[] args) {

        Supplier<ArrayList<Integer>> supplier = () -> {

            ArrayList<Integer> primes = new ArrayList<>();

            int number = 2;

            while (primes.size() < 10) {

                if (isPrime(number)) {

                    primes.add(number);

                }

                number++;

            }

            return primes;

        };

        ArrayList<Integer> primeNumbers = supplier.get();

        System.out.println("First 10 Prime Numbers");

        primeNumbers.forEach(System.out::println);

    }

    public static boolean isPrime(int number) {

        if (number < 2) {

            return false;

        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {

                return false;

            }

        }

        return true;

    }

}