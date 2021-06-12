package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        reader.close();
        String s;

        BufferedReader br1 = new BufferedReader(new FileReader(name1));
        while ((s = br1.readLine()) != null) {
            allLines.add(s);
        }
        br1.close();

        BufferedReader br2 = new BufferedReader(new FileReader(name2));
        while ((s = br2.readLine()) != null) {
            forRemoveLines.add(s);
        }
        br2.close();
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else{
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}
