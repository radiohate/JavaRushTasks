package com.javarush.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Задача по алгоритмам Ӏ Java Syntax: 8 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }

    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        boolean b = isGreaterThan("aa", "bb");
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < array.length; i++) {
            arr.add(array[i]);
        }
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
