package LogicBuilding.Day8;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");

        int number = Math.abs(sc.nextInt());

        int sum = 0;

        while (number != 0) {

            sum += number % 10;

            number /= 10;

        }

        System.out.println("Sum of Digits = " + sum);

        sc.close();

    }

}
