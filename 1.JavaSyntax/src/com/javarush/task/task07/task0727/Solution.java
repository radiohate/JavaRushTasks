package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) break;
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            if(s.length() % 2 == 0) resultStrings.add(s+ " " + s);
            else resultStrings.add(s + " " + s + " " + s);

            //resultStrings.add(string.toUpperCase());
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
