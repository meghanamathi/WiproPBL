package Collections.TopicstoLearn.MethodReference.Assignment2;

public class TestDigitCount {

    public static void main(String[] args) {

        DigitInterface di = DigitCount::digitCount;

        System.out.println("Number of Digits = " + di.count(123456));

    }

}