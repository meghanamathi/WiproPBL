package JavaFundamentals.TopicstoLearn.Arrays;

public class Assignment11 {
      public static void main(String[] args) {

        int[] arr={1,4,1,4};

        boolean flag=true;

        for(int x:arr)
        {
            if(x!=1 && x!=4)
            {
                flag=false;
                break;
            }
        }

        System.out.println(flag);
    }
}
