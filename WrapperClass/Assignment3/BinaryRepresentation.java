package WrapperClass.Assignment3;

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");

        int number = sc.nextInt();

        if (number < 1 || number > 255) {

            System.out.println("Please enter a number between 1 and 255.");

        }

        else {

            String binary = Integer.toBinaryString(number);

            binary = String.format("%8s", binary).replace(' ', '0');

            System.out.println("Binary Representation : " + binary);

        }

        sc.close();

    }

}