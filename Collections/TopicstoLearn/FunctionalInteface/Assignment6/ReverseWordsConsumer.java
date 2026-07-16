package Collections.TopicstoLearn.FunctionalInteface.Assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Java",
                "Python",
                "Spring",
                "Oracle",
                "SQL",
                "React",
                "Angular",
                "HTML",
                "CSS",
                "Wipro"
        ));

        Consumer<ArrayList<String>> reverseWords = list -> {

            for (int i = 0; i < list.size(); i++) {

                String reverse = new StringBuilder(list.get(i))
                        .reverse()
                        .toString();

                list.set(i, reverse);

            }

        };

        reverseWords.accept(words);

        System.out.println("Updated ArrayList");

        words.forEach(System.out::println);

    }

}