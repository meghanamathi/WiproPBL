package Abstraction.TopicstoLearn.Interfacenewfeatures.Assignment1;

public class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {

        // Calling Vehicle interface default method
        Vehicle.super.message();

        System.out.println("Inside Car");

    }

}
