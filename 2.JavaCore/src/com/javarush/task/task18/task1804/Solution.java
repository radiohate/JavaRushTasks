package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        br.close();
        ArrayList<Integer> arrBytes = new ArrayList<>();
        FileInputStream is = new FileInputStream(name);

        while (is.available() > 0){
            arrBytes.add(is.read());
        }
        is.close();

        HashSet<Integer> arrUniq = new HashSet<>();
        arrUniq.addAll(arrBytes);

        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        int min =  2147483647;
        for(int i: arrUniq){
            count = 0;
            for(int j: arrBytes){
                if(i == j)count++;
            }
            if(count<min) min = count;
            map.put(i, count);
        }
        for(Map.Entry<Integer, Integer> pair: map.entrySet()){
            if(pair.getValue() == min) System.out.print(pair.getKey() + " ");
        }
    }
}
