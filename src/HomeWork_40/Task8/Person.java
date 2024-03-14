package HomeWork_40.Task8;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
   private int age;
    private String gender;
    private double salary;
    private List<Person>personList;

    public Person(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.personList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", personList=" + personList +
                '}';
    }
}
