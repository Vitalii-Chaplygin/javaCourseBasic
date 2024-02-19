package homeWork_06;

public class Task1String {
    /*
    ## 1. Задание №1
1 Создайте строку через new - I study Basic Java!
2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
3 Распечатать последний символ строки. Используем метод String.charAt().
4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
5 Заменить все символы “а” на “о”.
6 Преобразуйте строку к верхнему регистру.
7 Преобразуйте строку к нижнему регистру.
8 Вырезать строку Java c помощью метода String.substring().
     */
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");
        System.out.println( "Последний символ строки: "+str.charAt(str.length() - 1));
        if (str.contains("Java")){
            System.out.println("Подстрока Java есть");
        }else {
            System.out.println("подстроки Java нет");
        }

        System.out.println(str.replace("a","o"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

      //  System.out.println(str.indexOf('J'));
        System.out.println(str.substring(14,str.length()-1));
    }


}