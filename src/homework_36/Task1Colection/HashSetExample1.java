package homework_36.Task1Colection;

import java.util.HashSet;

public class HashSetExample1 {
    public static void main(String[] args) {
        HashSet<String> stringSet = new HashSet<>();
        stringSet.add("Конструкция contains в HashSet используется для проверки наличия элемента в данном наборе.");
        stringSet.add("Java – широко используемый язык программирования для написания интернет-приложений.");
        System.out.println(stringSet);
        if (stringSet.contains("Java – широко используемый язык программирования для написания интернет-приложений.")){
            System.out.println("Такая строка есть");
        }else {
            System.out.println("Нет такой строки");
        }
    }
}
