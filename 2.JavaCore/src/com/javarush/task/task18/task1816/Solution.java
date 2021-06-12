package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileInputStream is = new FileInputStream(name);
        //ArrayList<Integer> arr = new ArrayList<>();
        int b;
        int count = 0;
        while (is.available() > 0){
            b = is.read();
            if((b > 64 && b < 91) || (b > 96 && b < 123)) count++;
        }
        is.close();
        System.out.println(count);
    }
}
