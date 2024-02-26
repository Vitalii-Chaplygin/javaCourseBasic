package homework_29.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg");
        Student student2 = new Student("Anton");
        Student student3 = new Student("Olga");
        Student student4 = new Student("Viktor");
        Student student5 = new Student("Stanislav");
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        System.out.println("Начальный список: " + listStudent);
       // Collections.reverse(listStudent);
       // System.out.println("Список в обратном направлении через встроенный метод : " + listStudent);
        System.out.print("Список в обратном направлении через цикл: ");

        for (int i = listStudent.size() - 1; i >= 0; i--) {
            System.out.print( listStudent.get(i).getName() + ", ");
        }

        System.out.println();
        listStudent.remove(2);
        System.out.println("Список после удаления элемента под inx 2: " + listStudent);
    }
}
