package homeWork_06.Task3Pizza;

public class Pizza {
    /*
    3. Задание №3
Напишите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.
     */
    int diameter;
    int caloriesInSmSquare;

    public Pizza(int diameter, int caloriesInSmSquare) {
        this.diameter = diameter;
        this.caloriesInSmSquare = caloriesInSmSquare;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "diameter=" + diameter +
                ", caloriesInSmSquare=" + caloriesInSmSquare +
                '}';
    }
//Пишем метод по вычислению общего количества калорий, который будет возвращать количество калорий

    public double calcCalories() {
        double pizzaArea = ((diameter * diameter / 4) * Math.PI); // определили площадь пиццы по диаметру (d*d : 4) × π
        double pizzaCall = pizzaArea * caloriesInSmSquare;
        return pizzaCall;
    }

}
