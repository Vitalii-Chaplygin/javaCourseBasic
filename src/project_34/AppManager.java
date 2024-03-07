package project_34;

import java.util.Arrays;
import java.util.List;

public class AppManager {
    public static void main(String[] args) {

        Student student1 = new Student("Leo", "Messi", 1);
        Student student2 = new Student("Cristiano", "Ronaldo", 2);
        Student student3 = new Student("Killian", "Mbappe", 3);

        Course javaCourse = new Course("Java");
        Course phpCourse = new Course("PHP");
        javaCourse.addStudent(student1);
        javaCourse.addStudent(student2);
        phpCourse.addStudent(student3);

        StudentManager studentManager = new StudentManager();
        studentManager.addCourseToStudent(1, javaCourse);
        studentManager.addCourseToStudent(2, javaCourse);
        studentManager.addCourseToStudent(2, phpCourse);

        List<Student> studentList = studentManager.getStudentsOnCourse("Java");
        for (Student student : studentList) {
             System.out.println(student);

        }
    }
}
