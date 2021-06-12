package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br.readLine();
        String name2 = br.readLine();
        br.close();

        FileInputStream is = new FileInputStream(name1);
        FileOutputStream fos = new FileOutputStream(name2);
        if(is.available() > 0){
            byte[] buf = new byte[is.available()];
            is.read(buf);
            for (int i = 0; i < buf.length; i++) {
                fos.write(buf[buf.length - i-1]);
            }
        }

        is.close();
        fos.close();


    }
}
