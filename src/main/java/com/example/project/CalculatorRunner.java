package com.example.project;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //test your program here
        //1. create an instance of the calculator class
        Calculator calculator = new Calculator("TI-84 CE");
        int x;
        int y;
        //2. call any methods of that class to test

        calculator.promptln("First value: ");
        x = scanner.nextInt();
        calculator.promptln("Second value: ");
        y = scanner.nextInt();
        calculator.promptln("What would you like to do with these two numbers?");
        calculator.promptln("| 1: Add");
        calculator.promptln("| 2: Subtract");
        calculator.promptln("| 3: Multiply");
        calculator.promptln("| 4: Divide");
        calculator.promptln("| 5: Abs Value");
        calculator.promptln("| 6: Plot");
        calculator.promptln("");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculator.promptln(x + " + " + y +" = " + (x+y));
                break;
        
            case 2:
                calculator.promptln(x + " - " + y  + " =" + (x-y));
                break;
            case 3:
                calculator.promptln(x + " x " + y + " = " + (x*y));
                break;
            case 4:
                if (!calculator.divisibleBy(x, y)) {
                    System.out.println("The first integer is not evenly divisible by the second integer");
                    return;
                } 
                calculator.promptln(x + " / " + y + " =" + (x/y));
                break;
            case 5:
                calculator.promptln("|" + x + " - " + y + "| = " + calculator.absoluteValue(x, y));
                break;
            case 6:
                calculator.promptln(calculator.coordinatePair(x, y));
                break;
            default:
                System.out.println("Illigal Operation");
                break;
        
        }
        
    }
}
