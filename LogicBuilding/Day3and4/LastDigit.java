package LogicBuilding.Day3and4;

import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int input1) {

        return Math.abs(input1 % 10);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int number = sc.nextInt();

        System.out.println(getLastDigit(number));

        sc.close();

    }

}