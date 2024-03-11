package homework_36.Task1Colection.heshMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Integer integer = 3;
        Integer squaredouble = integer * integer;
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        integerHashMap.put(integer, squaredouble);
        System.out.println(integerHashMap);
    }
}
