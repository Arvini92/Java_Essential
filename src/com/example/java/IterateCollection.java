package com.example.java;

import java.util.*;

public class IterateCollection {
    public static void main(String[] args) {

        System.out.println("Ordered data");
        List<String> list = new ArrayList<>();
        list.add("California");
        list.add("Oregon");
        list.add("Washington");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String> iteerator = list.iterator();
        while(iteerator.hasNext()) {
            String value = iteerator.next();
            System.out.println(value);
        }

        System.out.println("");

        System.out.println("ArrayList ForEach");
        for(String value : list) {
            System.out.println(value);
        }

        System.out.println("");

        System.out.println("Java 8 method reference");
        list.forEach(System.out::println);

        System.out.println("");

        System.out.println("Unordered data");
        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);
        System.out.println("");

        System.out.println("HashMap Iterator");
        Set<String> keys = map.keySet();
        Iterator<String> iteerator1 = keys.iterator();
        while(iteerator1.hasNext()) {
            String key = iteerator1.next();
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.println("");

        System.out.println("HashMap ForEach");
        for(String key : keys) {
            System.out.println("The capitol of " + key + " is " + map.get(key));
        }
        System.out.println("");
    }
}
