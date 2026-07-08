package JavaFundamentals.TopicstoLearn.FlowControl;

import java.util.Scanner;

public class Assignment15 {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(n<=0)
        {
            System.out.println("Please enter an integer number");
            return;
        }

        int num=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }

       sc.close();
    }
}
