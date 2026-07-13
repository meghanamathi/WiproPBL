package Abstraction.TopicstoLearn.Packages.Assignment3_4.com;

import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.twowheeler.Hero;
import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.twowheeler.Honda;
import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.fourwheeler.Logan;
import Abstraction.TopicstoLearn.Packages.Assignment3_4.com.automobile.fourwheeler.Ford;

public class TestVehicle {

    public static void main(String[] args) {

        // Hero Object
        Hero hero = new Hero(
                "Hero Splendor",
                "AP39AB1234",
                "Meghana");

        System.out.println("===== HERO =====");
        System.out.println("Model Name        : " + hero.getModelName());
        System.out.println("Registration No   : " + hero.getRegistrationNumber());
        System.out.println("Owner Name        : " + hero.getOwnerName());
        System.out.println("Speed             : " + hero.getSpeed() + " km/h");
        hero.radio();

        System.out.println();

        // Honda Object
        Honda honda = new Honda(
                "Honda Shine",
                "TS09CD5678",
                "Rahul");

        System.out.println("===== HONDA =====");
        System.out.println("Model Name        : " + honda.getModelName());
        System.out.println("Registration No   : " + honda.getRegistrationNumber());
        System.out.println("Owner Name        : " + honda.getOwnerName());
        System.out.println("Speed             : " + honda.getSpeed() + " km/h");
        honda.cdplayer();

        System.out.println();

        // Logan Object
        Logan logan = new Logan(
                "Renault Logan",
                "AP28EF4321",
                "Anjali");

        System.out.println("===== LOGAN =====");
        System.out.println("Model Name        : " + logan.getModelName());
        System.out.println("Registration No   : " + logan.getRegistrationNumber());
        System.out.println("Owner Name        : " + logan.getOwnerName());
        System.out.println("Speed             : " + logan.getSpeed() + " km/h");
        System.out.println("GPS               : " + logan.gps());

        System.out.println();

        // Ford Object
        Ford ford = new Ford(
                "Ford EcoSport",
                "TS10GH9876",
                "Kiran");

        System.out.println("===== FORD =====");
        System.out.println("Model Name        : " + ford.getModelName());
        System.out.println("Registration No   : " + ford.getRegistrationNumber());
        System.out.println("Owner Name        : " + ford.getOwnerName());
        System.out.println("Speed             : " + ford.getSpeed() + " km/h");
        System.out.println("Temperature       : " + ford.tempControl() + " °C");
    }
}
