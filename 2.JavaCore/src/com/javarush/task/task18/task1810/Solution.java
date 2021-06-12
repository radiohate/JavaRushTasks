package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream is = new FileInputStream(br.readLine());
            if(is.available() < 1000){
                br.close();
                //System.out.println("br.close()");
                is.close();
                //System.out.println("is.close()");
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
