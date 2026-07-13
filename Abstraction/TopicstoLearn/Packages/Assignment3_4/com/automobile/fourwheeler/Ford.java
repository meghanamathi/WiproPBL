package Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.fourwheeler;

import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.Vehicle;

public class Ford extends Vehicle {

    // Default Constructor
    public Ford() {

    }

    // Parameterized Constructor
    public Ford(String modelName, String registrationNumber, String ownerName) {
        super(modelName, registrationNumber, ownerName);
    }

    // Overriding abstract method
    @Override
    public int getSpeed() {
        return 180;
    }

    // Ford specific method
    public String tempControl() {
        return "Automatic Climate Control Enabled";
    }
}
