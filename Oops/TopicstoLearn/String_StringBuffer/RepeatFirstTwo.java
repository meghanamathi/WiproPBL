package Oops.TopicstoLearn.String_StringBuffer;

import java.util.Scanner;

public class RepeatFirstTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String first = str.substring(0, 2);

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += first;
        }

        System.out.println(result);

        sc.close();
    }
}
