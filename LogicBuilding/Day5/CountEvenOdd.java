package LogicBuilding.Day5;

import java.util.Scanner;

public class CountEvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 5 Numbers:");

        for (int i = 1; i <= 5; i++) {

            int number = sc.nextInt();

            if (number % 2 == 0) {

                evenCount++;

            } else {

                oddCount++;

            }

        }

        System.out.println("Even Numbers = " + evenCount);

        System.out.println("Odd Numbers = " + oddCount);

        sc.close();
    }
}
