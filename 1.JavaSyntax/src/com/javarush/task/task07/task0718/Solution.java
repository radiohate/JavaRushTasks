package com.javarush.task.task07.task0718;

import javax.management.MBeanRegistration;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        //Collections.addAll(list, "1","111", "11111",  "111", "111111");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i).length() > list.get(i+1).length()) {
                System.out.println(i+1);
                break;
            }
        }

        /*ArrayList<Integer> intList = new ArrayList<>();
        for (String s: list){
            intList.add(s.length());
        }
        Collections.sort(intList);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() != intList.get(i)){
                System.out.println(i + 1);
                break;
            }
        }*/


    }
}

