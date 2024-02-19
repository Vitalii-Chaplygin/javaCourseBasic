package HomeWork_04;

public class Task3 {
    public static void main(String[] args) {
        /*
        **Задача 3.**
Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
Отдельно выведите на экран сумму скидки от этой покупки.
         */
        int A = 1000;
        int B = 500;
        int discount = 100;

        int discountedPrice  = A + B - discount;
        System.out.println("Ваша цена со скидкой: "+discountedPrice);

    }


}
