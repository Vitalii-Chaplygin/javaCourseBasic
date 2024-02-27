package homework_29.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> name = new HashSet<>();
        name.add("Oleg");
        name.add("Tom");
        name.add("Petia");
        name.add("Tomas");
        name.add("Vlad");
        name.add("Artem");
        name.add("John");
        name.add("Tom");
        name.add("Vasia");
        name.add("Oleg");
        int uniqName = name.size();
        System.out.println("Уникальных имен: " + uniqName);
        if (name.contains("John") == true) {
            System.out.println("Коллекция содержит имя John");
        } else {
            System.out.println("Такого имени нет");
        }


    }

}
