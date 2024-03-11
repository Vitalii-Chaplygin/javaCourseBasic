package homework_36.Task1Colection;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetExample2 {
    public static void main(String[] args) {

        HashSet<Integer> integerHashSet=new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(4);
        integerHashSet.add(2);
        integerHashSet.add(8);
        System.out.println(integerHashSet);
        LinkedList<Integer> linkedList=new LinkedList<>(integerHashSet);
        for (Integer element :linkedList){
            System.out.println(element);
        }


    }
}
