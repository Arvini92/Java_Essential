package com.example.java;

import com.example.java.utilities.MathHelper;

import java.util.Scanner;


/**
 * This is an <b>olive press</b> application, and its job is to <i>press olives</i>!!
 */
public class CreateClass {
    /**
     * The main method
     * @param args - an array of String values
     */
    public static void main(String[] args) {
        CreateClass calc = new CreateClass();
        calc.calculate();
    }

    protected void calculate() {
        InputHelper helper = new InputHelper();
        String s1 = helper.getInput("Enter a numeric value: ");
        String s2 = helper.getInput("Enter a numeric value: ");
        String op = helper.getInput("Choose an operation (+ - * /):*");

        double result = 0;

        try {
            switch(op) {
                case "+":
                    result = MathHelper.addValues(s1, s2);
                    break;
                case "-":
                    result = MathHelper.substractValues(s1, s2);
                case "*":
                    result = MathHelper.multiplyValues(s1, s2);
                case "/":
                    result = MathHelper.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Urecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }


    class InputHelper {
        private String getInput(String promt) {
            System.out.println(promt);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }
    }

}
