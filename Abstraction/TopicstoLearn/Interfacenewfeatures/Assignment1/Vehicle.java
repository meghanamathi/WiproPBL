package Abstraction.TopicstoLearn.Interfacenewfeatures.Assignment1;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }

}
