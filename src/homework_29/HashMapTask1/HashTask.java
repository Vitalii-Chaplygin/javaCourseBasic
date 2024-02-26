package homework_29.HashMapTask1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTask {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("monday", "понедельник");
        dictionary.put("tuesday", "вторник");
        dictionary.put("wednesday", "среда");
        dictionary.put("thursday", "четверг");
        dictionary.put("friday", "пятница");
        System.out.println(dictionary);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введитие день недели на английском ");
        String dayInEnglish = scanner.nextLine();
        String tranRu = dictionary.get(dayInEnglish);
        if (tranRu != null) {
            System.out.println("Вы ввели: "+ tranRu);
        }else {
            System.out.println("такого дня недели в словаре нет ");
        }
            dictionary.remove("monday");
        System.out.println("Словарь после удаления дня:");
        System.out.println(dictionary);
    }
}
