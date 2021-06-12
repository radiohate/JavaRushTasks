package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.ArrayList;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        bufferedReader.close();

        Integer par = Integer.parseInt(args[0]);

        ArrayList<String> arr = new ArrayList<>();
        FileInputStream is = new FileInputStream(name);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String str;
        while ((str = br.readLine()) != null) {
            //что-то делаем с s
            arr.add(str);
        }
        br.close();
        is.close();

        for(String s: arr){
            String s1 = s.substring(0,s.indexOf(" "));
            Integer i = Integer.parseInt(s1);
            //System.out.println(s1 + " // " + s.indexOf(" "));
            if(i.equals(par)) System.out.println(s);
        }
     

    }
}
