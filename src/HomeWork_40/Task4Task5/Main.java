package HomeWork_40.Task4Task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Bill", 2022, 10.9));
        studentList.add(new Student("Sam", 2020, 11.5));
        studentList.add(new Student("Scot", 2021, 8.0));
        studentList.add(new Student("Frank", 2023, 11.3));
        studentList.add(new Student("Leo", 2024, 12.7));
        studentList.add(new Student("John", 2022, 8.4));
        List<Student> studentList1 = studentList.stream()

                .sorted(Comparator.comparingDouble(Student::getGrade).reversed())
                .sorted(Comparator.comparingInt(Student::getYearOfAdmission))
                .limit(3)
                .toList();
        System.out.println(studentList1);
        studentList1.forEach(student -> System.out.println(student.getName()+" "+ student.getYearOfAdmission()));

    }
}
