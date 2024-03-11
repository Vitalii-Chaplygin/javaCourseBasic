package homework_36.Task2colection.ArrayList;

import java.util.Comparator;

public class StudentCompaire implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравнение по полю "grade" (оценка)
        //Проверка, равны ли оценки двух студентов.
        if (student1.getGrade()==student2.getGrade())
           // Если оценки равны, сравниваем их по имени в алфавитном порядке.
            return student1.getName().compareTo(student2.getName());
       // Если оценка первого студента больше, возвращаем 1.
        if (student1.getGrade()>student2.getGrade())return 1;
       // Если оценка второго студента больше, возвращаем -1.
        return -2;
    }}
