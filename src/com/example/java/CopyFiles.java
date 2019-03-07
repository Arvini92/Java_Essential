package com.example.java;

import java.io.*;

public class CopyFiles {
    public static void main(String[] args) {

        String sourceFile = "files/loremipsum.txt";
        String targetFile = "files/target.txt";

        try(
                FileReader fReader = new FileReader(sourceFile);
                BufferedReader bReader = new BufferedReader(fReader);
                FileWriter writter = new FileWriter(targetFile)
        ) {

            while(true) {
                String line = bReader.readLine();
                if (line == null) {
                    break;
                } else {
                    writter.write(line + "\n");
                }
            }

            System.out.println("File copied!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
