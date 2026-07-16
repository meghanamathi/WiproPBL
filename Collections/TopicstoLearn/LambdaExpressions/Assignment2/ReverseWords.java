package Collections.TopicstoLearn.LambdaExpressions.Assignment2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("C");
        words.add("C++");
        words.add("HTML");
        words.add("CSS");
        words.add("SQL");
        words.add("Spring");
        words.add("React");
        words.add("Angular");

        Collections.reverse(words);

        System.out.println("Reverse Order");

        words.forEach(word -> System.out.println(word));

    }

}