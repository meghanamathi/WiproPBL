package Collections.TopicstoLearn.StreamAPI.Assignment3;

import java.util.ArrayList;

public class StudentFilter {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Meghana", 78));
        students.add(new Student(2, "Rahul", 45));
        students.add(new Student(3, "Anjali", 85));
        students.add(new Student(4, "Harish", 50));
        students.add(new Student(5, "Kiran", 38));

        long count = students.stream()
                .filter(student -> student.getMark() >= 50)
                .count();

        System.out.println("Number of Students Passed : " + count);

    }

}