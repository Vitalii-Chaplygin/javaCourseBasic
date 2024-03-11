package homework_36.Task2colection.TreeMapp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Date, List<String>> dateListTreeMap = new TreeMap<>();
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("I study Java");
        stringLinkedList.add("I study Php");
        stringLinkedList.add("I study JavaScript");

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2024, Calendar.MARCH, 10);
        Date date1 = calendar1.getTime();
        dateListTreeMap.put(date1, stringLinkedList);
        System.out.println(dateListTreeMap);

        LinkedList<String> stringLinkedList1 = new LinkedList<>();
        stringLinkedList1.add("I dont study C++");
        stringLinkedList1.add("I dont study C#");

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2024, Calendar.FEBRUARY, 12);
        Date date2 = calendar2.getTime();
        dateListTreeMap.put(date2, stringLinkedList1);
        System.out.println(dateListTreeMap);

        for (Map.Entry<Date, List<String>> dateListEntryentry : dateListTreeMap.entrySet()) {
            System.out.println("Date: " + dateListEntryentry.getKey());
            System.out.println("Strings: " + dateListEntryentry.getValue());
        }
    }
}