package JavaFundamentals.TopicstoLearn.Arrays;

import java.util.Arrays;

public class Assignment9 {
     public static void main(String[] args) {

        int[] arr={1,10,10,2};

        int[] result=new int[arr.length];

        int j=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=10)
                result[j++]=arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
