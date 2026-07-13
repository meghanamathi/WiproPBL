package Abstraction.TopicstoLearn.ExceptionHandling.Assignment5;

public class InvalidAgeException extends Exception {

    // Default Constructor
    public InvalidAgeException() {
        super();
    }

    // Parameterized Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}