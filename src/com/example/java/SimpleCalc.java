package com.example.java;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numeric value: ");
        String input = sc.nextLine();
        double d1 = Double.parseDouble(input);

        System.out.println("Enter a numeric value: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);

        double result = d1 + d2;
        System.out.println("The answer is " + result);
    }
}
