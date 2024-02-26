package tranningJava.practicLesson30;

import java.util.Objects;

public class Person implements Comparable<Person> {
   private String name;
   private String sureName;

    public Person(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(sureName, person.sureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sureName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person personObj) {
        int rezComparer = name.compareTo(personObj.getName());
        if (rezComparer==0){
            rezComparer= sureName.compareTo(personObj.getSureName());
        }




        return rezComparer;
    }
}
