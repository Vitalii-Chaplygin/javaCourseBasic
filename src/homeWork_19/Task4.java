package homeWork_19;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    /*
    Task4
    Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
   Выведите массивы на экран в двух отдельных строках
   Посчитайте среднее арифметическое элементов каждого массива и сообщите,
   для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
     */
    public static void main(String[] args) {
        int length1 = 5;
        int[] intArr = new int[length1];
        Random random = new Random();
        for (int i = 0; i < length1; i++) {
            intArr[i] = random.nextInt(5) + 1;
        }
        int length2 = 5;
        int[] intArr1 = new int[length2];
        Random random1 = new Random();
        for (int i = 0; i < length1; i++) {
            intArr1[i] = random1.nextInt(5 + 1);
        }
        System.out.println(Arrays.toString(intArr1));
        System.out.println("========================");
        System.out.println(Arrays.toString(intArr));

        for (int i = 0; i < intArr.length; i++) {
            double sumArr =0;

        }


    }


}



