package homework_36.homeTask;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1ArrayList {
    public static void main(String[] args) {


        ArrayList arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10 ; i++) {
          int ranNumb = random.nextInt(100);
          arrayList.add(ranNumb);
        }
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        }
}