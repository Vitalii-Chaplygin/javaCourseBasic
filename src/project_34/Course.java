package project_34;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Course {
    private String courceName;

 private    List<Student> studentList ;

    public Course(String courceName, List<Student> studentList) {
        this.courceName = courceName;
        this.studentList = studentList;
    }

    public String getCourceName() {
        return courceName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courceName, course.courceName) && Objects.equals(studentList, course.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courceName, studentList);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courceName='" + courceName + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
