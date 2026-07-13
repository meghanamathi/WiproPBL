package Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.fourwheeler;
import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.Vehicle;

public class Logan extends Vehicle {

    // Default Constructor
    public Logan() {

    }

    // Parameterized Constructor
    public Logan(String modelName, String registrationNumber, String ownerName) {
        super(modelName, registrationNumber, ownerName);
    }

    // Overriding abstract method
    @Override
    public int getSpeed() {
        return 140;
    }

    // Logan specific method
    public int gps() {
        return 1;
    }
}
