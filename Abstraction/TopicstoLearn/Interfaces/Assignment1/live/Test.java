package Abstraction.TopicstoLearn.Interfaces.Assignment1.live;

import Abstraction.TopicstoLearn.Interfaces.Assignment1.music.Playable;
import Abstraction.TopicstoLearn.Interfaces.Assignment1.music.string.Veena;
import Abstraction.TopicstoLearn.Interfaces.Assignment1.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        // Part A
        System.out.println("Veena Object");

        Veena veena = new Veena();

        veena.play();

        System.out.println();

        // Part B
        System.out.println("Saxophone Object");

        Saxophone saxophone = new Saxophone();

        saxophone.play();

        System.out.println();

        // Part C
        System.out.println("Using Interface Reference");

        Playable p;

        p = veena;

        p.play();

        p = saxophone;

        p.play();

    }

}
