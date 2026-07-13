package Abstraction.TopicstoLearn.ExceptionHandling.Assignment2;

public class MathOperation {

    public static void main(String[] args) {

        try {

            if (args.length != 5) {
                System.out.println("Please enter exactly 5 integers.");
                return;
            }

            int[] numbers = new int[5];

            int sum = 0;

            for (int i = 0; i < 5; i++) {

                numbers[i] = Integer.parseInt(args[i]);

                sum += numbers[i];

            }

            double average = (double) sum / numbers.length;

            System.out.println("Sum = " + sum);

            System.out.println("Average = " + average);

        }

        catch (NumberFormatException e) {

            System.out.println("NumberFormatException : Please enter only integers.");

        }

        catch (ArithmeticException e) {

            System.out.println("ArithmeticException");

        }

        catch (Exception e) {

            System.out.println(e);

        }

    }

}