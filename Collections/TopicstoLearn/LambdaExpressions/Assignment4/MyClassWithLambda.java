package Collections.TopicstoLearn.LambdaExpressions.Assignment4;

import java.util.Scanner;

public class MyClassWithLambda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");

        String input = scanner.nextLine();

        WordCount wordCount = (str) -> {

            if (str.trim().isEmpty()) {
                return 0;
            }

            return str.trim().split("\\s+").length;

        };

        System.out.println("Number of Words : " + wordCount.count(input));

        scanner.close();

    }

}
