package week6;

import week6.student.Student;
import week6.course.Course;

public class CollegeManagement {
    public static void main(String[] args) {

        Student s = new Student("Anvi", 101);
        Course c = new Course("Data Structures", "CSE201");

        s.displayStudent();

        System.out.println();

        c.displayCourse();
    }
}
