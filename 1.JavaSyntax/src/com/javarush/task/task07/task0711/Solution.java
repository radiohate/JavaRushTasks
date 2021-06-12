package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> array = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            array.add(br.readLine());
        }
        String sBuf;
        for (int i = 0; i < 13; i++) {
            sBuf = array.get(array.size()-1);
            array.remove(array.get(array.size()-1));
            array.add(0, sBuf);
        }
        for (String s: array) {
            System.out.println(s);
        }
    }
}
