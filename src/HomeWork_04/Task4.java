package HomeWork_04;

public class Task4 {
    public static void main(String[] args) {
        /*
**Задача 4.**
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
Вычислите среднюю температуру за неделю и выведете ее на печать.
         */
        int fri = 7;
        int sat = 4;
        int sun = -1;
        int mon = -6;
        int tue = -4;
        int wed = -1;
        int thu = -2;
        int sumTemp = fri+sat+sun+mon+tue+wed+thu;
        System.out.println(sumTemp);
        double averageTemperature = sumTemp / 7;
        System.out.println("Средняя температура за неделю - " + averageTemperature);

    }
}
