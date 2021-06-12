package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 =  br.readLine();
        String name2 = br.readLine();
        String name3 = br.readLine();
        br.close();

        FileInputStream fis1 = new FileInputStream(name2);
        FileOutputStream fos1 = new FileOutputStream(name1);

        while (fis1.available() > 0){
            fos1.write(fis1.read());
        }
        fis1.close();
        fos1.close();

        FileInputStream fis2 = new FileInputStream(name3);
        FileOutputStream fos2 = new FileOutputStream(name1, true);

        while (fis2.available() > 0){
            fos2.write(fis2.read());
        }
        fis2.close();
        fos2.close();

    }
}
