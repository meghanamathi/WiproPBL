package LogicBuilding.Day5;

import java.util.Scanner;

public class CountOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter 5 Numbers:");

        for (int i = 1; i <= 5; i++) {

            int number = sc.nextInt();

            if (number % 2 != 0) {

                count++;

            }

        }

        System.out.println("Number of Odd Numbers = " + count);

        sc.close();
    }
}