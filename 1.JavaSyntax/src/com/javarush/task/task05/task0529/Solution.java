package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        int i = 0;
        int sum = 0;
        while (true){
            s = br.readLine();
            if(s.equals("сумма")) break;
            i = Integer.parseInt(s);
            sum += i;
        }
        System.out.println(sum);
    }
}
