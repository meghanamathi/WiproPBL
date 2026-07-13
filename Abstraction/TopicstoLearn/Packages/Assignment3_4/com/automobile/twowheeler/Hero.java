package Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.twowheeler;


import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.Vehicle;

public class Hero extends Vehicle {

    // Default Constructor
    public Hero() {

    }

    // Parameterized Constructor
    public Hero(String modelName, String registrationNumber, String ownerName) {
        super(modelName, registrationNumber, ownerName);
    }

    // Implementing abstract method
    @Override
    public int getSpeed() {
        return 80;
    }

    // Hero specific method
    public void radio() {
        System.out.println("Hero Bike Radio is ON.");
    }
}
