package LogicBuilding.Day9;

import java.util.Scanner;

public class HillPatternWeight {

    public static int hillWeight(int input1, int input2, int input3) {

        int totalWeight = 0;
        int currentWeight = input2;

        for (int level = 1; level <= input1; level++) {

            totalWeight += level * currentWeight;

            currentWeight += input3;

        }

        return totalWeight;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Levels: ");
        int input1 = sc.nextInt();

        System.out.print("Enter Weight of Top Level: ");
        int input2 = sc.nextInt();

        System.out.print("Enter Increment per Level: ");
        int input3 = sc.nextInt();

        int result = hillWeight(input1, input2, input3);

        System.out.println("Hill Weight = " + result);

        sc.close();

    }

}
