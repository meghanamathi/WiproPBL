package LogicBuilding.Day3and4;

import java.util.Scanner;

public class IsOdd {

    public static int isOdd(int input1) {

        if (input1 % 2 != 0)
            return 2;
        else
            return 1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int number = sc.nextInt();

        System.out.println(isOdd(number));

        sc.close();

    }

}
