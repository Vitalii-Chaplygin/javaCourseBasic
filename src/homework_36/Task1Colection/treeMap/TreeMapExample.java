package homework_36.Task1Colection.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        String string = "Наиболее используемая имплементация интерфейса Map — это HashMap.";
        Integer stringSize = string.length();


        Map<String, Integer> stringStrMap = new TreeMap<>();
        stringStrMap.put(string, stringSize);
        System.out.println(stringStrMap);
    }
}
