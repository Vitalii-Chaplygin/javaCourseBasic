package homework_36.Task2colection.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;



public class Main {
    public static void main(String[] args) {
        ElementPriority elementPriority1 = new ElementPriority("John", 10);
        ElementPriority elementPriority2 = new ElementPriority("Bill", 2);
        ElementPriority elementPriority3 = new ElementPriority("Mark", 20);
        ElementPriority elementPriority4 = new ElementPriority("Sam", 6);
        PriorityQueue<ElementPriority> priorityPriorityQueue = new PriorityQueue<>();
        priorityPriorityQueue.add(elementPriority1);
        priorityPriorityQueue.add(elementPriority2);
        priorityPriorityQueue.add(elementPriority3);
        priorityPriorityQueue.add(elementPriority4);


    }

    }
