package homeWork_06.Task3Pizza;

public class PizzaDemo {
    public static void main(String[] args) {
    Pizza pizza1=new Pizza(24,40);
    Pizza pizza2=new Pizza(28,40);

     double rezultCalories = pizza2.calcCalories()- pizza1.calcCalories();
        System.out.println(rezultCalories);
    }
}
