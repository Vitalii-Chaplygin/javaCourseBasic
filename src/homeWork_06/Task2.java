package homeWork_06;

import lesson_06.code.lessoncode.scanner.UserInput;

public class Task2 {
    /*
    Задание №2
Введите 2 слова, используйте сканер.
Получить слово, состоящее из первой половины первого слова и второй половины второго слова.
Если количество букв в слове - нечетное, то среднюю букву в слове не учитывать.
Распечатать на консоль.

     */
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        String text1 = ui.inputText("Введите первое слово");

        String text2 = ui.inputText("Введите первое слово");
        System.out.println("получилась строка: " + text1 + " " + text2);

        int firstWordLength=text1.length();
        int secondWordLength=text2.length();
        System.out.println(firstWordLength);
        System.out.println(secondWordLength);

        int halfWord1=firstWordLength/2;
        int halfWord2=secondWordLength/2;
        if (firstWordLength%2!=0){
            halfWord1++;
        }

        if (secondWordLength%2!=0){
            halfWord2++;
        }
        String allwords = text1.substring(0,halfWord1) + text2.substring(halfWord2);
        System.out.println(allwords);
    }


}
