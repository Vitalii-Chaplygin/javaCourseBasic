package lesson_28.code.lessoncode.practice;

import java.util.ArrayList;

public class CompanyApp {
    public static void main(String[] args) {
        EmploeeСотрудник emploeeСотрудник1=new EmploeeСотрудник(1,"Vasya");
        EmploeeСотрудник emploeeСотрудник2=new EmploeeСотрудник(1,"Sasha");
        EmploeeСотрудник emploeeСотрудник3=new EmploeeСотрудник(1,"Petya");
        EmploeeСотрудник emploeeСотрудник4=new EmploeeСотрудник(1,"Oleg");
        EmploeeСотрудник emploeeСотрудник5=new EmploeeСотрудник(1,"Olga");

        Department department1 = new Department("IT",emploeeСотрудник1);
        Department department3 = new Department("IT",emploeeСотрудник1);


        Department department2 = new Department("Acaunting",emploeeСотрудник2);
        ArrayList<Department> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);
        System.out.println(departments);





    }
}
