package com.example.java;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /):*");

        double result = 0;

        try {
            switch(op) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = substractValues(s1, s2);
                case "*":
                    result = multiplyValues(s1, s2);
                case "/":
                    result = divideValues(s1, s2);
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

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return  d1 + d2;
    }

    private static double substractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return  d1 - d2;
    }

    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return  d1 * d2;
    }

    private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return  d1 / d2;
    }

    private static String getInput(String promt) {
        System.out.println(promt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
