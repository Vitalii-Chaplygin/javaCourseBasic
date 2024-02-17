package homeWork_14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task2 {

    /*
    №2
1. Создайте массив из всех нечётных чисел от 1 до 99.
2. Выведите его на экран в строку в обратном порядке
     */

    public static void main(String[] args) {
        int[] array = new int[99];
        int counter = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0)
                counter++;
            // Определили размер массива
        }
        System.out.println(counter);


    }
}




