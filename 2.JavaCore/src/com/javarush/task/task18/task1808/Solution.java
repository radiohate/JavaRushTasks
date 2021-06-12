package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String name1 = br.readLine();
        String name2 = br.readLine();
        br.close();

        FileInputStream is = new FileInputStream(name);


        FileOutputStream fos1 = new FileOutputStream(name1);
        FileOutputStream fos2 = new FileOutputStream(name2);

        if (is.available() > 0){
            byte[] buffer = new byte[is.available()];
            int count = is.read(buffer);
            int ind = count%2 == 0? count/2 : count/2+1;
            fos1.write(buffer, 0, ind);
            for (int i = ind; i < count; i++) {
                fos2.write(buffer[i]);
            }
        }
        is.close();
        fos1.close();
        fos2.close();

    }
}
