package LogicBuilding.Day7;

import java.util.Scanner;

public class UniqueDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int number = Math.abs(sc.nextInt());

        boolean[] digit = new boolean[10];

        while (number != 0) {

            int remainder = number % 10;

            digit[remainder] = true;

            number /= 10;

        }

        int count = 0;

        for (int i = 0; i < 10; i++) {

            if (digit[i]) {

                count++;

            }

        }

        System.out.println("Unique Digits Count = " + count);

        sc.close();

    }

}
