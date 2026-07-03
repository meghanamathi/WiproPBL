package JavaFundamentals.TopicstoLearn.FlowControl;

import java.util.Scanner;

public class Assignment17 {
      public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int temp=n;
        int rev=0;

        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }

        if(n==rev)
            System.out.println(n+" is a palindrome");
        else
            System.out.println(n+" is not a palindrome");

        sc.close();
    }
}
