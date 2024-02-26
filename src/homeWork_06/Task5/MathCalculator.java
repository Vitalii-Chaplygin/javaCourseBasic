package homeWork_06.Task5;

import lesson_06.code.lessoncode.scanner.UserInput;

import java.util.Scanner;

public class MathCalculator {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        double numb1 = userInput.inputDouble("первое число");

        double numb2 = userInput.inputDouble("второое числоо");

        ArithmeticOperations result = new ArithmeticOperations();

        System.out.println("Sub: "+ result.subtraction(numb1,numb2));

        System.out.println("Add: "+result.addition(numb1,numb2));

        System.out.println("Div: "+result.division(numb1,numb2));

        System.out.println("Mult: "+result.multiplication(numb1,numb2));

    }
}
