package homeWork_19;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    /*
    Task
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]
    Отсортируйте массив по убыванию любым из алгоритмов.
     */
    public static void main(String[] args) {
        int length = 8;
        int[] intArr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            intArr[i] = random.nextInt(10)+1;

        }

        System.out.println(Arrays.toString(intArr));

    }
}
