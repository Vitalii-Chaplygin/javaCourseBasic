package homework_36.Task2colection.ArrayList;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("John", 13));
        studentArrayList.add(new Student("Bill", 10));
        studentArrayList.add(new Student("Samm", 25));
        System.out.println(studentArrayList);
        studentArrayList.sort(new StudentCompaire());
        System.out.println(studentArrayList);
    }

    }

