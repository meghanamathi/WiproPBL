package JavaFundamentals.TopicstoLearn.Arrays;

import java.util.Arrays;

public class Assignment10 {
     public static void main(String[] args) {

        int[] arr={1,0,1,0,0,1,1};

        int[] result=new int[arr.length];

        int index=0;

        for(int x:arr)
            if(x%2==0)
                result[index++]=x;

        for(int x:arr)
            if(x%2!=0)
                result[index++]=x;

        System.out.println(Arrays.toString(result));
    }
}
