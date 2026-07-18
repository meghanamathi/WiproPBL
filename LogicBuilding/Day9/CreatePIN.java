package LogicBuilding.Day9;

import java.util.Scanner;

public class CreatePIN {

    public static int createPIN(int input1, int input2, int input3) {

        int unit = Math.min(input1 % 10,
                Math.min(input2 % 10, input3 % 10));

        int ten = Math.min((input1 / 10) % 10,
                Math.min((input2 / 10) % 10,
                        (input3 / 10) % 10));

        int hundred = Math.min((input1 / 100) % 10,
                Math.min((input2 / 100) % 10,
                        (input3 / 100) % 10));

        int max = 0;

        int[] arr = {input1, input2, input3};

        for (int num : arr) {

            while (num > 0) {

                int digit = num % 10;

                if (digit > max) {

                    max = digit;

                }

                num /= 10;

            }

        }

        return max * 1000 + hundred * 100 + ten * 10 + unit;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alpha: ");
        int input1 = sc.nextInt();

        System.out.print("Enter Beta: ");
        int input2 = sc.nextInt();

        System.out.print("Enter Gamma: ");
        int input3 = sc.nextInt();

        int pin = createPIN(input1, input2, input3);

        System.out.println("Generated PIN = " + pin);

        sc.close();

    }

}
