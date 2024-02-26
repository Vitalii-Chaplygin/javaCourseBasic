package homework_29.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkListInteger {
    public static void main(String[] args) {

        List<Integer> integerList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int integer = random.nextInt(100) + 1;
            integerList.add(integer);

        }
        System.out.println("Заполненный список случайными числами");
        System.out.print("[");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + (i < integerList.size() - 1 ? ", " : "]\n"));
        }

        int max = integerList.get(0);
        int min = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++) {
            if (max < integerList.get(i)) {
                max = integerList.get(i);
            }
            if (min > integerList.get(i)) {
                min = integerList.get(i);
            }

        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

        System.out.println("Отсортированный список в порядке возрастания");
        Collections.sort(integerList);
        System.out.println(integerList);
    }
}



