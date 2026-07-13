package Abstraction.TopicstoLearn.Packages.Assignment2.ShipCompartment;

public class Compartment {

    private double height;
    private double width;
    private double breadth;

    // Default Constructor
    public Compartment() {

    }

    // Parameterized Constructor
    public Compartment(double height, double width, double breadth) {

        this.height = height;
        this.width = width;
        this.breadth = breadth;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public void display() {

        System.out.println("Ship Compartment Details");
        System.out.println("------------------------");
        System.out.println("Height  : " + height);
        System.out.println("Width   : " + width);
        System.out.println("Breadth : " + breadth);

    }

}
