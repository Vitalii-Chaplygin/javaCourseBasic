package homeWork_19;

import java.util.Arrays;
import java.util.Scanner;

/*
Task2
Напишите программу, которая определит, сколько слов Вы ввели с консоли.
 */
public class Task2 {
    public static void main(String[] args) {
        // Через Scanner просим пользователя ввести текст и формируем массив из этого текста
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text message: ");
        String textMessage = scanner.nextLine();
        System.out.println("Your text is: " + textMessage);
        String[] stringArr = new String[]{textMessage};
        System.out.println(Arrays.toString(stringArr));


        // создаем переменную которая будет содержать в себе количество слов в строке . говорим что текущее количество слов равна 0
        int counterSting = 0;
        // Проверяем сначала ввел ли пользователь хотя бы одно слово
        if (textMessage.length() != 0) { // если строка не пуста(ввели хотя бы одно слово) , то увеличиваем ее на 1
            counterSting++;
            // проходим в цикле по всей строке
            for (int i = 0; i < textMessage.length(); i++) {
                // определяем есть ли в строке символ пробел, если (i) является пробелом, то переменную counterSting увеличиваем на 1, таким образом мы будем обнаруживать есть ли в строке еще слова после пробела
                if (textMessage.charAt(i) == ' ') {
                    counterSting++;
                }
            }

        }

        System.out.println("Количество слов в строке: "+counterSting);
    }
}
