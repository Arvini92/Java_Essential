package com.example.java;

import com.example.java.model.*;

import java.util.ArrayList;
import java.util.List;

public class InstanceVariables {
    public static void main(String[] args) {
        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());

       Press press = new OlivePress();
       press.setOil(5);
       press.getOil(olives);
       int totalOil = press.getOil(olives);
       System.out.println("Total olive oil: " + totalOil);

//       Press p2 = new Press() {
//           @Override
//           public int getOil(List<Olive> olives) {
//               return 0;
//           }
//
//           @Override
//           public void setOil(int oil) {
//
//           }
//       }
    }
}
