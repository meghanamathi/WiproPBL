package Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.main;
import Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.bean.Student;
import Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.service.StudentReport;
import Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.service.StudentService;

public class StudentMain {

    public static void main(String[] args) {

        Student[] data = new Student[4];

        data[0] = new Student("Sekar", new int[] { 85, 75, 95 });
        data[1] = new Student(null, new int[] { 11, 22, 33 });
        data[2] = new Student("Manoj", null);
        data[3] = null;

        StudentReport report = new StudentReport();

        System.out.println("Student Grades");

        System.out.println("------------------------");

        for (Student s : data) {

            System.out.println(report.findGrades(s));
        }

        StudentService service = new StudentService();

        System.out.println();

        System.out.println("Null Objects : "
                + service.findNumberOfNullObjects(data));

        System.out.println("Null Names : "
                + service.findNumberOfNullName(data));

        System.out.println("Null Marks Arrays : "
                + service.findNumberOfNullMarksArray(data));

    }
}