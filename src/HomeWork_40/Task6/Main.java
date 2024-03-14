package HomeWork_40.Task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Bill", 18);
        person1.addLanguagesProgramming("Java");
        person1.addLanguagesProgramming("JavaScript");

        Person person2 = new Person("Tom", 27);
        person2.addLanguagesProgramming("Php");
        person2.addLanguagesProgramming("C++");

        Person person3 = new Person("Rajan", 26);
        person3.addLanguagesProgramming("Php");
        person3.addLanguagesProgramming("C#");


        Person person4 = new Person("Fill", 28);
        person4.addLanguagesProgramming("CssHtml");
        person4.addLanguagesProgramming("WordPress");


        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

        System.out.println(personList);

        Set<String> stringSet= personList.stream()
                .filter(person -> person.getAge()>25)
                .flatMap(person -> person.getProgrammingLanguages().stream())
                .collect(Collectors.toSet());
        System.out.println(stringSet);
                stringSet.forEach(System.out::println);







    }
}
