package homework_36.Task1Colection.PriorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {


        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        integerPriorityQueue.add(50);
        integerPriorityQueue.add(4);
        integerPriorityQueue.add(2);
        integerPriorityQueue.add(45);
        integerPriorityQueue.add(10);
        integerPriorityQueue.add(100);
        integerPriorityQueue.add(18);
        integerPriorityQueue.add(3);
        integerPriorityQueue.add(20);
        integerPriorityQueue.add(5);

        System.out.println(integerPriorityQueue);

        System.out.println(integerPriorityQueue.peek());
        integerPriorityQueue.add(1);
        System.out.println(integerPriorityQueue);

        System.out.println(integerPriorityQueue.peek());
    }
}