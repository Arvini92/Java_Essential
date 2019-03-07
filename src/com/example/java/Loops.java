package com.example.java;

public class Loops {
    public static void main(String[] args) {

       String[] months = {"January", "February", "March",
               "April", "May", "June",
               "July", "August", "September",
               "October", "November", "December"};

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[1]);
        }

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[1]);
        }

        for (String month: months) {
            System.out.println(month);
        }

        int counter = 0;
        while (counter < months.length) {
            System.out.println(months[counter]);
            counter++;
        }

        counter = 0;
        do {
            System.out.println(months[counter]);
            counter++;
        } while (counter < months.length);
    }
}
