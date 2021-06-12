package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Double d;
        int i;
        short sh;

        ArrayList<String> arr = new ArrayList<>();
        //d = Double.parseDouble(br.readLine());
        while (true){
            String s = br.readLine();
            if(s.equals("exit")) break;
            arr.add(s);
        }
        for(String s: arr){
            try{
                if(s.contains("."))
                {
                    d = Double.parseDouble(s);
                    print(d);
                } else {
                    i = Integer.parseInt(s);
                    if(i > 0 && i < 128){
                        sh = (short) i;
                        print(sh);
                    } else{
                        print(i);
                    }
                }

            }catch (NumberFormatException e){
                print(s);
            }
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
