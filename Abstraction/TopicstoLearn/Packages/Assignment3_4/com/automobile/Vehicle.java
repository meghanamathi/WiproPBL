package Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile;

public abstract class Vehicle {

    // Instance Variables
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    // Default Constructor
    public Vehicle() {

    }

    // Parameterized Constructor
    public Vehicle(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    // Getter for Model Name
    public String getModelName() {
        return modelName;
    }

    // Setter for Model Name
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter for Registration Number
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Setter for Registration Number
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    // Getter for Owner Name
    public String getOwnerName() {
        return ownerName;
    }

    // Setter for Owner Name
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Abstract Method
    public abstract int getSpeed();

}