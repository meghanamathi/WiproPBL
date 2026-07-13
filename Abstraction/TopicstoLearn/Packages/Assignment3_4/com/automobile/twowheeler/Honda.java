package Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.twowheeler;

import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.Vehicle;

public class Honda extends Vehicle {

    // Default Constructor
    public Honda() {

    }

    // Parameterized Constructor
    public Honda(String modelName, String registrationNumber, String ownerName) {
        super(modelName, registrationNumber, ownerName);
    }

    // Implementing abstract method
    @Override
    public int getSpeed() {
        return 100;
    }

    // Honda specific method
    public void cdplayer() {
        System.out.println("Honda CD Player is ON.");
    }
}
