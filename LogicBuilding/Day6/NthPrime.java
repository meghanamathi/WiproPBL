package LogicBuilding.Day6;

import java.util.Scanner;

public class NthPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int count = 0;
        int number = 2;

        while (true) {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {

                    isPrime = false;
                    break;

                }

            }

            if (isPrime) {

                count++;

                if (count == n) {

                    System.out.println("Nth Prime Number = " + number);
                    break;

                }

            }

            number++;

        }

        sc.close();

    }

}
