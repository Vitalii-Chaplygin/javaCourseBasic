package HomeWork_40.Task2Task3;

import java.util.ArrayList;
import java.util.List;

public class Task2Main {
    /*
2) коллекция String  - получить коллекцию элементов у которых нечетное количество символов

3) коллекция String - получить строку содержащую все элементы этой коллекции
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        // System.out.println(list);
        List<String> stringList = list.stream()
                .filter(e -> e.length() % 2 != 0)
                .toList();
        System.out.println(stringList);


//получили строку, содержащую все элементы коллекции
        list.forEach(System.out::print);



    }
}