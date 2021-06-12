package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileInputStream is = new FileInputStream(name);
        byte[] arr = new byte[is.available()];
        while(is.available() > 0){
            is.read(arr);
        }
        is.close();

        HashSet<Byte> arrUniq = new HashSet<Byte>();
        for(byte b: arr)arrUniq.add(b);

        ArrayList<Byte> array = new ArrayList<>();
        array.addAll(arrUniq);

        Collections.sort(array);

        for (byte b: array) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(b == arr[j])
                    count++;
            }
            System.out.println((char) b + " " + count);
        }
        //for(byte b: array) System.out.println((char) b);


    }
}
