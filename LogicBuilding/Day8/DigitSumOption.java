package LogicBuilding.Day8;

import java.util.Scanner;

public class DigitSumOption {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int number = Math.abs(sc.nextInt());

        System.out.println("1. Sum of Even Digits");

        System.out.println("2. Sum of Odd Digits");

        System.out.print("Enter Your Choice: ");

        int choice = sc.nextInt();

        int temp = number;

        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;

            if (choice == 1 && digit % 2 == 0) {

                sum += digit;

            }

            else if (choice == 2 && digit % 2 != 0) {

                sum += digit;

            }

            temp /= 10;

        }

        if (choice == 1) {

            System.out.println("Sum of Even Digits = " + sum);

        }

        else if (choice == 2) {

            System.out.println("Sum of Odd Digits = " + sum);

        }

        else {

            System.out.println("Invalid Choice");

        }

        sc.close();

    }

}