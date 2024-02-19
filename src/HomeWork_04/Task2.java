package HomeWork_04;

public class Task2 {
    public static void main(String[] args) {
        /*
 **Задача 2.**
Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
Распечатайте её через println. Сколько программа отбросила в дробной части?
         */

        int i0 = 0;
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;
        int i6 = 6;
        int i7 = 7;
        int i8 = 8;
        int i9 = 9;
        int summa = (i0 + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9) / 10;
        System.out.println("среднее арифметическое: "+summa);
        int frction = summa%10;
        System.out.println("программа отбросила в дробной части: "+frction);
    }
}
