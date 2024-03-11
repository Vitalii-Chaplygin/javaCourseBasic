package homework_36.Task1Colection.arrayDeque;

import java.util.ArrayDeque;

public class ArraqDequeTask1 {
    public static void main(String[] args) {
        ArrayDeque<Integer> integerQueue= new ArrayDeque<>();
        integerQueue.addLast(16);
        integerQueue.addFirst(10);
        integerQueue.addLast(1);
        integerQueue.addFirst(7);
        System.out.println(integerQueue);
        Integer firstElement= integerQueue.pollFirst();
        //Integer lastElement= integerQueue.pollLast();
        System.out.println(firstElement);
        //System.out.println(lastElement);
    }
}
