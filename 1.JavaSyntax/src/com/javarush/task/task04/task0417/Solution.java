package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int z = Integer.parseInt(br.readLine());
        equalsNum(x, y, z);

    }

    public static void equalsNum(int x, int y, int z) {
        if (x == y && x == z) System.out.println(x + " " + y + " " + z);
        else if (x == y) System.out.println(x + " " + y);
        else if (x == z) System.out.println(x + " " + z);
        else if (y == z) System.out.println(y + " " + z);
        else ;

    }
}