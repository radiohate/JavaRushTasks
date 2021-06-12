package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //File file = new File("/home/radiokate/Desktop/1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        int i;
        while((i = inputStream.read())!= -1){

            System.out.print((char)i);
        }
        br.close();
        inputStream.close();
    }
}