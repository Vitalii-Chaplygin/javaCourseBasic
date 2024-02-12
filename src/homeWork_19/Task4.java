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
        int length = 5;
        int[] intArr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            intArr[i] = random.nextInt(5) + 1;
        }

        int[] intArr1 = new int[length];
        Random random1 = new Random();
        for (int i = 0; i < length; i++) {
            intArr1[i] = random1.nextInt(5 + 1);
        }
        System.out.println("Массив intArr1: " + Arrays.toString(intArr1));
        System.out.println("========================");
        System.out.println("Массив intArr1: " + Arrays.toString(intArr));

        double sumArr1 = 0;
        double sumArr = 0;
        for (int i = 0; i < intArr.length; i++) {
            sumArr = (sumArr + intArr[i]);
        }
        for (int i = 0; i < intArr1.length; i++) {
            sumArr1 = sumArr1 + intArr1[i];
        }

        System.out.println("средние арифметическое значение intArr: "+sumArr / intArr.length);
        System.out.println("средние арифметическое значение intArr1: "+sumArr1 / intArr1.length);
        if (sumArr == sumArr1) {
            System.out.println("средние арифметические значения равны");
        }

        if (sumArr < sumArr1) {
            System.out.println("средние арифметическое значение intArr1 > intArr");
        } else {
            System.out.println("средние арифметическое значение intArr1 < intArr");
        }
    }
}



