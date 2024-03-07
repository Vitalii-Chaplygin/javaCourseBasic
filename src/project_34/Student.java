package project_34;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String nameStudent;
    private String lastNameStudent;
    private Integer studentIdNumber;
    private List<Course> courseList;

    public Integer getStudentIdNumber() {
        return studentIdNumber;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public Student(String nameStudent, String lastNameStudent, Integer studentIdNumber) {
        this.nameStudent = nameStudent;
        this.lastNameStudent = lastNameStudent;
        this.studentIdNumber = studentIdNumber;
        this.courseList= new ArrayList<>();
    }


    public void addCourse(Course course){
        courseList.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", lastNameStudent='" + lastNameStudent + '\'' +
                ", studentIdNumber=" + studentIdNumber +
                ", courseList=" + courseList +
                '}';
    }
}



