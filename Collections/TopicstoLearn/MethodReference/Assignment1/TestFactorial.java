package Collections.TopicstoLearn.MethodReference.Assignment1;

public class TestFactorial {

    public static void main(String[] args) {

        Factorial factorial = new Factorial();

        FactorialInterface fi = factorial::factorial;

        System.out.println("Factorial = " + fi.calculate(5));

    }

}