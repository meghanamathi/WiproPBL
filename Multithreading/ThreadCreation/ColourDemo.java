package Multithreading.ThreadCreation;

import java.util.Random;

class ColourDisplay implements Runnable {

    String[] colours = {
        "white", "blue", "black", "green", "red",
        "yellow", "orange", "purple", "pink", "brown",
        "gray", "cyan", "magenta", "lime", "teal",
        "violet", "indigo", "gold", "silver", "maroon",
        "navy",
        "lavender", "crimson", "chocolate", "peach"
    };

    public void run() {
        Random r = new Random();

        while (true) {
            int index = r.nextInt(colours.length);
            System.out.println(colours[index]);

            if (colours[index].equalsIgnoreCase("red")) {
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ColourDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new ColourDisplay());
        t.start();
    }
}