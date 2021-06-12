package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();   //создание списка
        Collections.addAll(list, "мама","мыла","раму");
        String s = "именно";
        //int c = list.size();
        for (int i = 0; i < list.size(); i+=2) {
            list.add(i+1, s);
            //i++;
        }
        for(String str: list) System.out.println(str);
    }
}
