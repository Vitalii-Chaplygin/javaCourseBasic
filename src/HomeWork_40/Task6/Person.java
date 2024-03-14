package HomeWork_40.Task6;


import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

public class Person {
   private String name;
  private   int age;
  private List<String> programmingLanguages;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.programmingLanguages = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", programmingLanguages=" + programmingLanguages +
                '}';


    }
    public void addLanguagesProgramming(String programLang){
        this.programmingLanguages.add(programLang);
    }
}

