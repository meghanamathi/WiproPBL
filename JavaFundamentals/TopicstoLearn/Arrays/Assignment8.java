package JavaFundamentals.TopicstoLearn.Arrays;

public class Assignment8 {
     public static void main(String[] args) {

        int[] arr={10,3,6,1,2,7,9};

        int sum=0;
        boolean ignore=false;

        for(int x:arr)
        {
            if(x==6)
            {
                ignore=true;
                continue;
            }

            if(ignore)
            {
                if(x==7)
                    ignore=false;
            }
            else
            {
                sum+=x;
            }
        }

        System.out.println(sum);
    }
}
