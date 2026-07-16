package LogicBuilding.Day10;

import java.util.Scanner;

public class PalindromeString {

    public static int isPalindrome(String input) {

        input = input.toLowerCase();

        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            reverse += input.charAt(i);

        }

        if (input.equals(reverse)) {

            return 2;

        }

        return 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String str = sc.nextLine();

        System.out.println(isPalindrome(str));

        sc.close();

    }

}
