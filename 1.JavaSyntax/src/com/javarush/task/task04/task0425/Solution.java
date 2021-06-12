package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Цель установлена!
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        printQuart(x, y);
    }
    public static void printQuart (int x, int y){
        if(x > 0 && y > 0) System.out.println(1);
        if(x < 0 && y > 0) System.out.println(2);
        if(x < 0 && y < 0) System.out.println(3);
        if(x > 0 && y < 0) System.out.println(4);
    }
}
