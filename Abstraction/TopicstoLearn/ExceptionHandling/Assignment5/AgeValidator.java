package Abstraction.TopicstoLearn.ExceptionHandling.Assignment5;

public class AgeValidator {

    // Method to validate age
    public static void validateAge(String name, int age)
            throws InvalidAgeException {

        if (age < 18 || age >= 60) {
            throw new InvalidAgeException(
                    "Age should be greater than or equal to 18 and less than 60.");
        }

        System.out.println("Welcome " + name + ". Age is valid.");
    }

    public static void main(String[] args) {

        try {

            // Check number of command-line arguments
            if (args.length != 2) {
                System.out.println("Usage: java AgeValidator <Name> <Age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            validateAge(name, age);

        }

        catch (NumberFormatException e) {

            System.out.println("Age should be a valid integer.");

        }

        catch (InvalidAgeException e) {

            System.out.println(e.getMessage());

        }

        catch (Exception e) {

            System.out.println("Invalid input.");

        }

    }
}