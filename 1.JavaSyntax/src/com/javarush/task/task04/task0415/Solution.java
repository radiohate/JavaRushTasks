package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        isTriangle(a, b, c);

    }
    public static void isTriangle (int a, int b, int c){
        if((a+b) > c && (a+c) > b && (b+c) > a) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}