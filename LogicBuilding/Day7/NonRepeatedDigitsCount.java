package LogicBuilding.Day7;

import java.util.Scanner;

public class NonRepeatedDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int number = Math.abs(sc.nextInt());

        int[] frequency = new int[10];

        while (number != 0) {

            int digit = number % 10;

            frequency[digit]++;

            number /= 10;

        }

        int count = 0;

        for (int i = 0; i < 10; i++) {

            if (frequency[i] == 1) {

                count++;

            }

        }

        System.out.println("Non-Repeated Digits Count = " + count);

        sc.close();

    }

}
