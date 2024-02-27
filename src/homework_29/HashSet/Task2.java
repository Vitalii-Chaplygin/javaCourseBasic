package homework_29.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Java");
        stringList.add("JavaScript");
        stringList.add("JavaScript");
        stringList.add("Php");
        stringList.add("Python");
        stringList.add("Python");
        stringList.add("C++");

        Set<String> hashSet =new HashSet<>(stringList);
        System.out.println(hashSet);
            hashSet.add("C#");
            hashSet.add("Css");
        System.out.println(hashSet);
        List<String> liststr= new ArrayList<>(hashSet);
        liststr.add("HTML"); // Для проверки добавил элемент
        System.out.println(liststr);
    }


}
