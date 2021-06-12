package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());

            //System.out.println(list.get(i));
        }
        int min = list.get(0).length();
        int max = 0;
        int minInd = 0;
        int maxInd = 0;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > max) {
                max = list.get(i).length();
                maxInd = i;
                //System.out.println(maxInd + "Max: " + max + " :" + list.get(maxInd));
            }
            if(list.get(i).length() < min) {
                min = list.get(i).length();
                minInd = i;
                //System.out.println(minInd + "Min: " + min + " :" + list.get(minInd));
            }
        }

        //System.out.println(minInd + "Min: " + min + " :" + list.get(minInd));
        //System.out.println(maxInd + "Max: " + max + " :" + list.get(maxInd));

        if(minInd < maxInd) System.out.println(list.get(minInd));
        else System.out.println(list.get(maxInd));
    }
}
