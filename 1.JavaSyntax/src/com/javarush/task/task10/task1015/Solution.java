package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] mass = new ArrayList[3];
        for (int i = 0; i < mass.length; i++) {
            ArrayList<String> arr = new ArrayList<>();
            mass[i] = arr;
            for (int j = 0; j < i+3; j++) {
                String s = "";
                mass[i].add(s+j);
                //System.out.println(i + 1 + "-й список " + (j + 1) + "- й элемент: " + mass[i].get(j));
            }
        }

        return mass;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String string : list) {
                System.out.println(string);
            }
        }
    }
}