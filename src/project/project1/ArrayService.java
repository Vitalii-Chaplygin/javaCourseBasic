package project.project1;

import java.util.Arrays;

public class ArrayService {
    /*
    Задание: Создайте класс ArrayService, содержащий метод sort,
который принимает массив целых чисел и сортирует его по убыванию.

Добавьте метод createArrayFromUserInput для чтения размера
массива и его создания.

Добавьте метод fillArrayFromUserInput для заполнения
массива элементами от пользователя, возвращая созданный
массив как ссылку.

Добавьте метод printArray для вывода отсортированного массива.

Реализуйте класс ArraySortDemo для демонстрации работы программы.
     */
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int result = array[i];
                    array[i] = array[j];
                    array[j] = result;

                }
            }
            System.out.println(array[i]);
        }

    }
    public int[] createArrayFromUserInput(  ){
        return createArrayFromUserInput();
    }

}
