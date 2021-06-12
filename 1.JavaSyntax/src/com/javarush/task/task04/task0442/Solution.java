package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int sum = 0;
        while (n != -1){
            n = Integer.parseInt(br.readLine());
            sum = sum + n;
            //System.out.println(n +" - " + sum);
        }

        System.out.println(sum);

    }
}
