package HomeWork_04;

public class Task1 {
    /*
 Напишите программу, которая выводит на экран информацию о вас (или выдуманном персонаже) в три строчки:
```console
"Меня зовут ..."
"Мне ... лет"
"Я из ..."
```
**На месте многоточий должны использоваться данные, которые предварительно были записаны в переменные!**

     */
    public static void main(String[] args) {
        String name = "Vitalii";
        int year = 39;
        String whereAreYouFrom = "Kharkov, Ukraine ";
        System.out.println("Меня зовут: " + name);
        System.out.println("Мне " + year + " лет");
        System.out.println("Я из " + whereAreYouFrom);
    }

}
