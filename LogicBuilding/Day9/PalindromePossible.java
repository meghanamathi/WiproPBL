package LogicBuilding.Day9;

import java.util.Scanner;

public class PalindromePossible {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int number = Math.abs(sc.nextInt());

        int[] frequency = new int[10];

        while (number != 0) {

            frequency[number % 10]++;

            number /= 10;

        }

        int oddCount = 0;

        for (int i = 0; i < 10; i++) {

            if (frequency[i] % 2 != 0) {

                oddCount++;

            }

        }

        if (oddCount <= 1) {

            System.out.println("Palindrome Possible");

        } else {

            System.out.println("Palindrome Not Possible");

        }

        sc.close();

    }

}
