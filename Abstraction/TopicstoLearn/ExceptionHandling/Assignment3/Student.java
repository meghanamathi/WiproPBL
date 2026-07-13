package Abstraction.TopicstoLearn.ExceptionHandling.Assignment3;

public class Student {

    String name;

    int[] marks = new int[3];

    public Student(String name, int[] marks) {

        this.name = name;

        this.marks = marks;

    }

    public double calculateAverage() {

        int sum = 0;

        for (int mark : marks) {

            sum += mark;

        }

        return (double) sum / 3;

    }

}
