package Abstraction.TopicstoLearn.Interfacenewfeatures.Assignment1;

public interface FourWheeler {

    default void message() {
        System.out.println("Inside FourWheeler");
    }

}