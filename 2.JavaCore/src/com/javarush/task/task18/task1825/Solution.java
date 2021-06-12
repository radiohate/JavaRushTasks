package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<String> arrFiles = new ArrayList<>();
        while (!(s = br.readLine()).equals("end")){
            arrFiles.add(s);
        }
        br.close();

        ArrayList<Integer>arrNum = new ArrayList<>();
        for (int i = 0; i < arrFiles.size(); i++) {
            arrNum.add(getNum(arrFiles.get(i)));
        }

        Collections.sort(arrNum);
        if(isSeries(arrNum)){
            String name = arrFiles.get(0).substring(0,arrFiles.get(0).lastIndexOf("."));
            FileOutputStream os = new FileOutputStream(name,true);
            String currentname;

            for(Integer i: arrNum){
                currentname = name + ".part" + i.toString();
                FileInputStream is = new FileInputStream(currentname);
                byte[] arrB = new byte[is.available()];
                is.read(arrB);
                os.write(arrB);
                is.close();
            }
            os.close();
        }

        //for(Integer c: arrNum) System.out.println(c);
    }
    public static int getNum(String s){
        String numStr = s.substring(s.lastIndexOf(".")  + 5, s.length());
        return Integer.parseInt(numStr);
    }
    public static boolean isSeries(ArrayList<Integer> arr){
        boolean res = true;
        for (int i = 0; i < arr.size() -1; i++) {
            if(!arr.get(i).equals(arr.get(i+1) - 1)) res = false;
        }
        return res;
    }
}
