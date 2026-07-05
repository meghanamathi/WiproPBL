package JavaFundamentals.TopicstoLearn.Arrays;

import java.util.LinkedHashSet;

public class Assignment7 {
     public static void main(String[] args) {

        int[] arr={12,34,12,45,67,89};

        LinkedHashSet<Integer> set=new LinkedHashSet<>();

        for(int x:arr)
            set.add(x);

        System.out.println(set);
    }
}
