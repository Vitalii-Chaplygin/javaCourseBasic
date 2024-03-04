package homework_34.Task1;

public class ArrayUtils {
    public static int[] addElement(int[] array, int element) {
        // Создаем новый массив на один элемент больше и копируем в него все элементы из исходного массива
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        // Добавляем новый элемент в конец нового массива
        newArray[newArray.length - 1] = element;
        // Возвращаем новый массив с добавленным элементом
        return newArray;
    }

    public static void main(String[] args) {
        int[] originalArray = {};
        int elementToAdd = 8;
        int[] newArray = addElement(originalArray, elementToAdd);
        // Выводим новый массив после добавления элемента
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }
}
