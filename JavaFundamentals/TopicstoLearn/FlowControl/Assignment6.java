package JavaFundamentals.TopicstoLearn.FlowControl;

import java.util.Scanner;

public class Assignment6 {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        char gender=sc.next().charAt(0);
        int age=sc.nextInt();

        if((gender=='F'||gender=='f') && age>=1 && age<=58)
            System.out.println("8.2%");
        else if((gender=='F'||gender=='f') && age>=59 && age<=100)
            System.out.println("9.2%");
        else if((gender=='M'||gender=='m') && age>=1 && age<=58)
            System.out.println("8.4%");
        else if((gender=='M'||gender=='m') && age>=59 && age<=100)
            System.out.println("10.5%");

        sc.close();
    }
}
