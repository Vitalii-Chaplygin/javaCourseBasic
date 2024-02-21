package homeWork_06.Task3Pizza;

public class PizzaDemo {
    public static void main(String[] args) {
    Pizza pizza1=new Pizza(24,40);
    Pizza pizza2=new Pizza(28,40);

     double rezultCalories = pizza2.calcCalories()- pizza1.calcCalories();
        System.out.println("В пицце диаметром: "+pizza1.diameter+" - "+pizza1.calcCalories()+" калорий");
        System.out.println("Если мы купим пиццу диаметром: "+pizza2.diameter+", то съедим больше на "+rezultCalories+" калорий");
    }
}
