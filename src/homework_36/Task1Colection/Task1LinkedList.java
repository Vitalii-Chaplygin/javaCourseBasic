package homework_36.Task1Colection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Task1LinkedList {
    public static void main(String[] args) {
//создаем и заполняем List элементами
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");
        stringList.add("six");
        stringList.add("seven");
        stringList.add("eighth");
        stringList.add("nine");
        stringList.add("ten");

        System.out.println(stringList);


        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(7);
        integerSet.add(3);
        integerSet.add(9);
        integerSet.add(4);
        System.out.println(integerSet);

        LinkedList<Integer> indexDellit = new LinkedList<>();
        for (int indexDel : integerSet) {
            if (indexDel < stringList.size()) {
                indexDellit.add(indexDel);
            } else {
                System.out.println("Такого индекса " + indexDel + " нет");
            }
        }
        System.out.println(indexDellit);


        for (int i = indexDellit.size() - 1; i >= 0; i--) {
            int index = indexDellit.get(i);
            stringList.remove(index);
        }
        System.out.println(stringList);
    }


}