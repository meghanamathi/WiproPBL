package Collections.TopicstoLearn.LambdaExpressions.Assignment3;

import java.util.ArrayList;

public class OddLengthWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("C");
        words.add("Spring");
        words.add("HTML");
        words.add("React");
        words.add("CSS");
        words.add("Oracle");
        words.add("SQL");
        words.add("Angular");

        System.out.println("Words with Odd Length");

        words.stream()
                .filter(word -> word.length() % 2 != 0)
                .forEach(System.out::println);

    }

}
