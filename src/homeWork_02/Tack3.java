package homeWork_02;

public class Tack3 {
    public static void main(String[] args) {
        /*
 Дано трехзначное число (произвольное).
Создать три переменные в которые с помощью математических действий
присвоить цифры этого числа
Вывести на экран все переменные (не напечатать цифры, а именно
получить значения переменных).
Пример: 345
Вывод в консоль: Число 345 -> 3, 4, 5
         */
        int number = 345;
        int numResult1 = number / 100;
        int numberResult2 = (number % 100) / 10;
        int numberResult3 = (number % 100) % 10;


        System.out.print(numResult1 + ", " + numberResult2 + ", " + numberResult3);


    }
}
