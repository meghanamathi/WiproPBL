package Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.service;

import Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.bean.Student;
import Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.exception.NullMarksArrayException;
import Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.exception.NullNameException;
import Abstraction.MiniProjects.StudentGradeCalculation.com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student s)
            throws NullStudentObjectException,
            NullNameException,
            NullMarksArrayException {

        if (s == null) {
            throw new NullStudentObjectException();
        }

        if (s.getName() == null) {
            throw new NullNameException();
        }

        if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student s) {

        try {

            validate(s);

            int total = 0;

            int[] marks = s.getMarks();

            for (int mark : marks) {

                if (mark < 35) {
                    s.setGrade("F");
                    return "F";
                }

                total += mark;
            }

            if (total < 150)
                s.setGrade("C");

            else if (total < 200)
                s.setGrade("B");

            else if (total < 250)
                s.setGrade("A");

            else
                s.setGrade("A+");

            return s.getGrade();

        } catch (Exception e) {

            return e.getMessage();
        }
    }
}
