package LogicBuilding.Day10;

import java.util.Scanner;

public class MostFrequentDigit {

    public static int mostFrequentDigit(int input1,
                                        int input2,
                                        int input3,
                                        int input4) {

        int[] frequency = new int[10];

        int[] numbers = {input1, input2, input3, input4};

        for (int number : numbers) {

            number = Math.abs(number);

            if (number == 0) {

                frequency[0]++;

            }

            while (number != 0) {

                frequency[number % 10]++;

                number /= 10;

            }

        }

        int max = 0;

        int digit = 0;

        for (int i = 0; i <= 9; i++) {

            if (frequency[i] > max) {

                max = frequency[i];

                digit = i;

            }

        }

        return digit;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int b = sc.nextInt();

        System.out.print("Enter Number 3: ");
        int c = sc.nextInt();

        System.out.print("Enter Number 4: ");
        int d = sc.nextInt();

        System.out.println("Most Frequent Digit = "
                + mostFrequentDigit(a, b, c, d));

        sc.close();

    }

}
