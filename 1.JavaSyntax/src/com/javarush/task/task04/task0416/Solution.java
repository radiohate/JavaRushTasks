package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());
        lightColor(t);

    }
    public static void lightColor (double t){
        int i = (int)t/5;
        double d = t - i*5;
        if(d < 3) System.out.println("зелёный");
        else if (d < 4) System.out.println("жёлтый");
        else System.out.println("красный");
    }
}