package tranningJava.practicLesson30;

import java.util.Set;
import java.util.TreeSet;

public class PersonDemo {
    public static void main(String[] args) {
        Set<Person> people = new TreeSet<>();
        people.add(new Person("Vasya","Pupkin"));
        people.add(new Person("Ivan","Sanin"));
        people.add(new Person("Peetya","Papkin"));
        people.add(new Person("Oleg","Sidorov"));
        people.add(new Person("Evgeniy","Lermontov"));

        System.out.println(people);
    }


}
