package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(br.readLine());
       int b = Integer.parseInt(br.readLine());
       int c = Integer.parseInt(br.readLine());

        if(a <= b){
            if(a >= c) System.out.println(a);
            else if(b <= c) System.out.println(b);
            else System.out.println(c);
        } else if(b >= c){
            System.out.println(b);
        } else if(c <= a) System.out.println(c);
        else System.out.println(a);

    }
}
