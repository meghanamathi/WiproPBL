package LogicBuilding.Day3and4;

import java.util.Scanner;

public class SecondLastDigit {

    public static int getSecondLastDigit(int input1) {

        input1 = Math.abs(input1);

        if (input1 < 10)
            return -1;

        return (input1 / 10) % 10;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int number = sc.nextInt();

        System.out.println(getSecondLastDigit(number));

        sc.close();

    }

}
