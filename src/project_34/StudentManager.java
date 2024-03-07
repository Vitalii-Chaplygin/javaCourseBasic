package project_34;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {
    public Course getStudentsOnCoursecourse;
    private Map<Integer, Student> studentMap ;

    public StudentManager() {
        this.studentMap = new HashMap<>();
    }

    public void addStudentMap(Student student) {
        studentMap.put(student.getStudentIdNumber(), student);
    }

    public void removeStudent(Integer studentIdNumber) {
        studentMap.remove(studentIdNumber);
    }
    public Student findStudent(Integer studentIdNumber){
        return studentMap.get(studentIdNumber);
    }
    public void addCourseToStudent(Integer  studentIdNumber,Course course){
        Student student = studentMap.get(studentIdNumber);
        if (student != null){
            student.addCourse(course);
        }


    }
    public List<Student> getStudentsOnCourse(String curseName){
        List<Student> studentListOnCourse= new ArrayList<>();
        for (Student student:studentMap.values()){
            for (Course course: student.getCourseList()){
                if (course.getCourseName().equals(curseName)){
                    studentListOnCourse.add(student);
                }
            }
        }
        return studentListOnCourse;
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "getStudentsOnCoursecourse=" + getStudentsOnCoursecourse +
                ", studentMap=" + studentMap +
                '}';
    }
}
