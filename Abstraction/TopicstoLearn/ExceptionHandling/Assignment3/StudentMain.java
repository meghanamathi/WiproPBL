package Abstraction.TopicstoLearn.ExceptionHandling.Assignment3;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];

        try {

            for (int i = 0; i < 2; i++) {

                System.out.println("Enter Student Name:");

                String name = sc.nextLine();

                int[] marks = new int[3];

                System.out.println("Enter Marks in 3 Subjects:");

                for (int j = 0; j < 3; j++) {

                    marks[j] = Integer.parseInt(sc.nextLine());

                    if (marks[j] < 0)

                        throw new NegativeMarksException(
                                "Negative Marks are not allowed.");

                    if (marks[j] > 100)

                        throw new OutOfRangeException(
                                "Marks should be between 0 and 100.");

                }

                students[i] = new Student(name, marks);

            }

            System.out.println();

            System.out.println("Student Averages");

            for (Student s : students) {

                System.out.println(s.name + " : " + s.calculateAverage());

            }

        }

        catch (NumberFormatException e) {

            System.out.println("NumberFormatException");

        }

        catch (NegativeMarksException e) {

            System.out.println(e.getMessage());

        }

        catch (OutOfRangeException e) {

            System.out.println(e.getMessage());

        }

        finally {

            sc.close();

        }

    }

}