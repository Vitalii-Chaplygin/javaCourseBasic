package homework_36.Task2colection.PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) {
        PriorityQueue<ElementsPriority> elementsPriorities = new PriorityQueue<>();
        elementsPriorities.offer(new ElementsPriority("Bill", 10));
        elementsPriorities.offer(new ElementsPriority("Poll", 3));
        elementsPriorities.offer(new ElementsPriority("Samm", 20));

        elementsPriorities.stream().forEach(val-> System.out.println(elementsPriorities));


    }

}
