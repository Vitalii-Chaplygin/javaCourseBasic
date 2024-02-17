package homeWork_14;

/*
№1.

Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n . Найдите недостающий элемент.

input:
arr[] = {1,2,3,5}
out: 4

arr[] = {6,1,2,8,3,4,7,10,5}
out: 9
 */



/*
1 создаем массивы
arr1[] = {1,2,3,5}
arr2[] = {6,1,2,8,3,4,7,10,5}
2 узнаем формулу арифметической прогрессии n*(n+1)/2 эта формула действует при условии,
что массив заполнен полностью числами от 1 до n
Что бы получить число N нам нужно от суммы арифм прогрессии отнять сумму чисел массива
3   узнаем длину массива
    создаем переменную числа n и говорим что n будет равно длине массива плюс один,
    где + 1 это плюс недостающий элемент
4   узнаем сумму элементов массива через цикл for
     создаем переменную суммы чисел массива  int sumOfArrayNumbers которая изначальна равна 0

 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("длина массива: " + arr1.length);
        int n = arr1.length + 1;
        int sumOfArithmeticProgression = n * (n + 1) / 2;
        System.out.println("Сумма ариф. прогресии: " + sumOfArithmeticProgression);

        int sumOfArrayNumbers = 0;
        for (int i = 0; i < arr1.length; i++) {

            sumOfArrayNumbers = sumOfArrayNumbers + arr1[i];
            System.out.println(sumOfArrayNumbers);
        }
        int missingElement = sumOfArithmeticProgression - sumOfArrayNumbers;
        System.out.println("недостающий элемент: " + missingElement);
    }

}







