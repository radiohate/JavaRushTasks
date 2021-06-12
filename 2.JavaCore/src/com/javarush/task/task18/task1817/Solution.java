package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String name = args[0];
        FileInputStream is = new FileInputStream(name);

        int countSpace = 0;
        int countAll = 0;
        int a;

        while (is.available() > 0){
            a = is.read();
            countAll++;
            if(a == 32) countSpace++;
        }
        is.close();
        double res = (double) countSpace/ countAll * 100;
        DecimalFormat df = new DecimalFormat("#.##");
        res = Double.valueOf(df.format(res));
        System.out.println(res);
        //System.out.printf("%.2f", f);

    }
}
