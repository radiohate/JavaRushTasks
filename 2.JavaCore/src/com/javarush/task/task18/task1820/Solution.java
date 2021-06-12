package com.javarush.task.task18.task1820;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String name1 = br1.readLine();
        String name2 = br1.readLine();
        br1.close();

        FileInputStream is = new FileInputStream(name1);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str;
        String res = "";
        while ((str = br.readLine()) != null) {
            //что-то делаем с s
            res+=str;
        }
        br.close();
        is.close();

        String[] arr = res.split(" ");
        String fin = "";
        double d;
        int i;
        int i1;
        //DecimalFormat decimalFormat = new DecimalFormat( "#" );

        for(String s: arr){
            d = Double.parseDouble(s);
            //fin+=decimalFormat.format(d) + " ";
            i = (int) d;
            if(d > 0) {
                i1 = (d - i) < 0.5? i : i + 1;
            } else{
                i1 = (-1 * (d - i)) <= 0.5? i: i - 1;
            }
            //i1 = (int)Math.round(Math.floor(d+0.5));
            fin += i1 + " ";
        }

        FileOutputStream fos = new FileOutputStream(name2);
        fos.write(fin.getBytes());
        fos.close();

    }
}
