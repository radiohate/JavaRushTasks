package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        isBissex(year);

    }
    public static void isBissex(int year){
        String yes = "количество дней в году: 366";
        String no = "количество дней в году: 365";
        if(year%400 == 0) System.out.println(yes);
        else if(year%100 == 0) System.out.println(no);
        else if(year%4 == 0) System.out.println(yes);
        else System.out.println(no);
    }
}