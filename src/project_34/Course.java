package project_34;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private  List<Student> studentList;

    public Course(String courceName) {
        this.courseName = courceName;
        this.studentList = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
public void addStudent(Student student){
        studentList.add(student);
}

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}

