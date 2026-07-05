package JavaFundamentals.TopicstoLearn.Arrays;

import java.util.Scanner;

public class Assignment3 {
     public static void main(String[] args) {

        int[] arr = {1,4,34,56,7};

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int index = -1;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                index=i;
                break;
            }
        }

        System.out.println(index);

        sc.close();
    }
}
