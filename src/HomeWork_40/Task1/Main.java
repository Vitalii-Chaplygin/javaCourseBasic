package HomeWork_40.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bill", 19, 5.0));
        studentList.add(new Student("Sam", 23, 3.5));
        studentList.add(new Student("John", 20, 4.0));
        studentList.add(new Student("Leo", 18, 4.7));
        List<Student> filterList = studentList.stream()
                .filter(student -> student.getAge() > 16)
                .filter(student -> student.getAvgGrade() > 4.5)
                .collect(Collectors.toList());
        System.out.println(filterList);

    }
}
