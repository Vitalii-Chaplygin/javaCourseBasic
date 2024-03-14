package HomeWork_40.Task8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Poll", 18, "male", 2500);
        Person person2 = new Person("Sara", 28, "female", 3500);
        Person person3 = new Person("Julia", 19, "female", 200);
        Person person4 = new Person("Bill", 35, "male", 1800);
        Person person5 = new Person("John", 21, "male", 3000);
        Person person6 = new Person("Scot", 42, "male", 2700);

        List<Person> personList = Arrays.asList(person1, person2, person3, person4, person5, person6);
        System.out.println(personList);

        personList = personList.stream()
                .filter(person -> person.getGender().equals("male"))
                .filter(person -> person.getAge() > 25 && person.getAge() < 45)
                .collect(Collectors.toList());
        System.out.println(personList);
        double averageSalary = personList.stream()
                .mapToDouble(Person::getSalary)
                .average()
                .orElse(0.0);
        System.out.println(averageSalary);
    }

}
