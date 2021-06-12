package com.javarush.task.task18.task1826;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        String fileOutputName;

        switch (args[0]){
            case "-e":
                fileName = args[1];
                fileOutputName = args[2];
                FileInputStream is = new FileInputStream(fileName);
                FileOutputStream os = new FileOutputStream(fileOutputName);
                while (is.available() > 0){
                    os.write(is.read() + 1);
                }
                is.close();
                os.close();
                break;
            case "-d":
                fileName = args[1];
                fileOutputName = args[2];
                FileInputStream is1 = new FileInputStream(fileName);
                FileOutputStream os1 = new FileOutputStream(fileOutputName);
                while (is1.available() > 0){
                    os1.write(is1.read() - 1);
                }
                is1.close();
                os1.close();
                break;
        }

    }

}
