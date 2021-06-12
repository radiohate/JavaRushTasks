package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        //Collections.addAll(list, 5, 10, 16, 17, 9, 3, 4, 46, 97, 89, 12, 45, 98, 111, 42, 99, 98, 9, 71, 150);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        ArrayList<Integer> listMulty3 = new ArrayList<Integer>();
        ArrayList<Integer> listMulty2 = new ArrayList<Integer>();
        ArrayList<Integer> listAllTheRest = new ArrayList<Integer>();

        for (Integer n:list) {
            if(n % 3 ==0) listMulty3.add(n);
            if (n % 2 == 0) listMulty2.add(n);
            if(n % 2 != 0 && n % 3 != 0) listAllTheRest.add(n);
        }
        printList(listMulty3);
        printList(listMulty2);
        printList(listAllTheRest);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
