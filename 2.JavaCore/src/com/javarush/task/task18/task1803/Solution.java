package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Самые частые байты
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
        //for(int i: arrUniq) System.out.println(i);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        int max = 0;
        for(int i: arrUniq){
            count = 0;
            for(int j: arrBytes){
                if(i == j)count++;
            }
            if(count>max) max = count;
            map.put(i, count);
        }
        for(Map.Entry<Integer, Integer> pair: map.entrySet()){
            if(pair.getValue() == max) System.out.print(pair.getKey() + " ");
        }
    }
}
