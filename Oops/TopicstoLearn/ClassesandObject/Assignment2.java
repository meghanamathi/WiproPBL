package Oops.TopicstoLearn.ClassesandObject;

class Calculator {

    // Static method to calculate power of two integers
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method to calculate power of a double value
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class Assignment2 {

    public static void main(String[] args) {

        int result1 = Calculator.powerInt(5, 3);

        double result2 = Calculator.powerDouble(4.5, 2);

        System.out.println("5 power 3 = " + result1);
        System.out.println("4.5 power 2 = " + result2);
    }
}
