package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

/* 
Как назвали, так назвали
15.2.1988
d m y
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        int y = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
