package Collections.TopicstoLearn.FunctionalInteface.Assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam",
                "java",
                "level",
                "radar",
                "hello",
                "malayalam",
                "apple",
                "refer",
                "racecar",
                "wipro"
        ));

        Predicate<String> palindrome = word -> {

            String reverse = new StringBuilder(word).reverse().toString();

            return word.equalsIgnoreCase(reverse);

        };

        System.out.println("Palindrome Words");

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);

    }

}
