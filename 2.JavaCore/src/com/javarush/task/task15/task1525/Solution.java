package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        FileInputStream is = null;
        try {
            is = new FileInputStream(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String s;
            while ((s = br.readLine()) != null) {
                //что-то делаем с s
                lines.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
