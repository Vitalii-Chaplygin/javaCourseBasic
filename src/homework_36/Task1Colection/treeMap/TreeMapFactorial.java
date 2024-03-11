package homework_36.Task1Colection.treeMap;

public class TreeMapFactorial {
    public static void main(String[] args) {
       System.out.println(factorialGet(3));


    }
    public static Integer factorialGet(Integer n){
        Integer factorial = 1;
        for (int i =1 ; i <=n ; i++) {
            factorial=factorial*i;

        }
        return factorial;
    }
}
