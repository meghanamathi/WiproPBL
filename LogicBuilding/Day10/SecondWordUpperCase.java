package LogicBuilding.Day10;

import java.util.Scanner;

public class SecondWordUpperCase {

    public static String getSecondWord(String input) {

        String[] words = input.trim().split("\\s+");

        if (words.length < 2) {

            return "LESS";

        }

        return words[1].toUpperCase();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Sentence: ");

        String sentence = sc.nextLine();

        System.out.println(getSecondWord(sentence));

        sc.close();

    }

}