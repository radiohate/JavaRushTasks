package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.ArrayList;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        br.close();

        FileInputStream fis = new FileInputStream(name1);

        byte[] b1 = new byte[fis.available()];
        int count1 = 0;
        while (fis.available() > 0){
            count1 = fis.read(b1);
        }
        fis.close();
        //for(byte q: b1) System.out.println((char)q + " " + count1 + " " + b1.length);

        FileOutputStream fos = new FileOutputStream(name1);
        FileInputStream fis2 = new FileInputStream(name2);

        byte[] b2 = new byte[fis2.available()];
        int count2 = 0;
        while (fis2.available() > 0){
            count2 = fis2.read(b2);
        }
        fis2.close();

        //for(byte q: b2) System.out.println((char)q + " " + count2 + " " + b2.length);

        byte[] b = new byte[b1.length + b2.length];
        for (int i = 0; i < b2.length; i++) {
            b[i] = b2[i];
        }
        for (int i = 0; i < b1.length; i++) {
            b[b2.length+i] = b1[i];
        }
        //for(byte q: b) System.out.println((char)q  + " " + b.length);
        fos.write(b);
        fos.close();

    }
}
