package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; true; i++) {
            String s = br.readLine();
            if (s.equals("end")) break;
            else list.add(s);
        }
        for(String s: list) System.out.println(s);
    }
}