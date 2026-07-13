package Abstraction.TopicstoLearn.ExceptionHandling.Assignment4;

public class InvalidCountryException extends Exception {

    // Default Constructor
    public InvalidCountryException() {
        super();
    }

    // Parameterized Constructor
    public InvalidCountryException(String message) {
        super(message);
    }

}
