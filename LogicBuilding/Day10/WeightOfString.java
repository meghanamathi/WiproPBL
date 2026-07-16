package LogicBuilding.Day10;

import java.util.Scanner;

public class WeightOfString {

    public static int weight(String input) {

        int sum = 0;

        input = input.replaceAll("\\s+", "");

        for (int i = 0; i < input.length(); i++) {

            char ch = Character.toLowerCase(input.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {

                continue;

            }

            if (ch >= 'a' && ch <= 'z') {

                sum += (ch - 'a' + 1);

            }

        }

        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");

        String str = sc.nextLine();

        System.out.println("Weight = " + weight(str));

        sc.close();

    }

}