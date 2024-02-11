package homeWork_19;

import java.util.Arrays;

/*
Task1
Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
 Не используйте дополнительный массив для хранения результатов.
 */
public class Task1 {
    public static void main(String[] args) {
        String[] arrString = new String[]{"My", "name", "is", "Vitalii"};
        System.out.println(Arrays.toString(arrString));
        System.out.print("[");
        for (int i = arrString.length - 1; i >= 0; i--) {
            System.out.print(arrString[i] + ((i > 0) ? "," : "]"));

        }


    }

}
