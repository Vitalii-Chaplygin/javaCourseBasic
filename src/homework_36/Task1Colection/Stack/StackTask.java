package homework_36.Task1Colection.Stack;

import java.util.Stack;

public class StackTask {
    public static void main(String[] args) {
        Stack<String> stringStack= new Stack<>();
        stringStack.push("one");
        stringStack.push("two");
        stringStack.push("fife");
        stringStack.push("six");
        System.out.println(stringStack.search("fife"));// находит элемент и выводит его глубину от вершины
        //если элемента нет, то выводит -1



    }
}
