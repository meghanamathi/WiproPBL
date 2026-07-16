package LogicBuilding.Day7;

import java.util.Scanner;

public class AllDigitsCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int number = Math.abs(sc.nextInt());

        int count = 0;

        if (number == 0) {

            count = 1;

        } else {

            while (number != 0) {

                count++;

                number /= 10;

            }

        }

        System.out.println("Total Digits = " + count);

        sc.close();

    }

}
