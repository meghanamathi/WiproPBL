package Oops.TopicstoLearn.StringJoiner;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Assignment1 {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names:");

        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);

        sc.close();
    }
}
