package LogicBuilding.Day9;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = sc.nextInt();

        int original = Math.abs(number);
        int temp = original;
        int reverse = 0;

        while (temp != 0) {

            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;

        }

        if (original == reverse) {

            System.out.println("Palindrome Number");

        } else {

            System.out.println("Not a Palindrome Number");

        }

        sc.close();

    }

}
