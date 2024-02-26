package homework_29.HashMapTask2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashTask2 {
    public static void main(String[] args) {
        Map<String,Double> studentInformation = new HashMap<>();
        studentInformation.put("Oleg",27.4);
        studentInformation.put("Petya",45.9);
        studentInformation.put("Vasya",33.7);
        studentInformation.put("Sasha",28.4);
        studentInformation.put("Vadim",31.4);
        System.out.println(studentInformation);

        Double maxValue = Collections.max(studentInformation.values());
        System.out.println("Максимальное значение: "+maxValue);
        studentInformation.put("Vasya",11.1);
        System.out.println(studentInformation);


        }

    }



