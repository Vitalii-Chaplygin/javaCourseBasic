package HomeWork_04;

public class Task5 {
    public static void main(String[] args) {
        int numb10 = 10 ;
        int numb4 = 4 ;
        int numb3 = 3 ;
        int numb7 = 7 ;
        int numb8 = 8 ;

        int result1 = numb10 % 2;
        int result2 = numb3 % 2;
        int result3 = numb7 % 2;
        System.out.println("Остаток от деления 10/2 = " +result1);
        System.out.println("Остаток от деления 3/2 = " +result2);
        System.out.println("Остаток от деления 7/2 = " +result3);
        int results1 = numb10 % 3;
        int results2 = numb3 % 3;
        int results3 = numb8 % 3;
        System.out.println("Остаток от деления 10/3 = " +results1);
        System.out.println("Остаток от деления 3/3 = " +results2);
        System.out.println("Остаток от деления 7/3 = " +results3);
    }
}
