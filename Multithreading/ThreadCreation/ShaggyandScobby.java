package Multithreading.ThreadCreation;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class ShaggyandScobby {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Shaggy");
        MyThread t2 = new MyThread("Scobby");

        t1.start();
        t2.start();
    }
}