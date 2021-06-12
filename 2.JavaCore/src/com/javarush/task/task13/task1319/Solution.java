package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public Solution() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        String s;
        ArrayList<String> list = new ArrayList<>();
        while (true){
            s = br.readLine();
            list.add(s + "\n");
            if(s.equals("exit")) {break;}
        }

        BufferedWriter writter = new BufferedWriter(new FileWriter(name));
        for (String str : list) {
            writter.write(str);
        }
        br.close();
        writter.close();

    }




}
