package com.example.java;

import java.text.NumberFormat;

public class PrimitivesToString {
    public static void main(String[] args) {
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        NumberFormat formater = NumberFormat.getNumberInstance();
        String formatted = formater.format(longValue);
        System.out.println(formatted);
    }
}
