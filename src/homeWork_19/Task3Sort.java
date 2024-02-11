package homeWork_19;

import java.util.Arrays;
import java.util.Random;

public class Task3Sort {
    public static void sotrarray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int result = array[i];
                    array[i]= array[j];
                    array[j] = result;
                }
            }
        }
    }

    public static void main(String[] args) {
        int length = 8;
        int[] intArr = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            intArr[i] = random.nextInt(10) + 1;


        }
        System.out.println(Arrays.toString(intArr));
        sotrarray(intArr);
        System.out.println(Arrays.toString(intArr));

    }

}


