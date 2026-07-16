package Collections.TopicstoLearn.MethodReference.Assignment3;

public class TestPrime {

    public static void main(String[] args) {

        PrimeInterface pi = Prime::new;

        pi.check(17);

        pi.check(20);

    }

}
