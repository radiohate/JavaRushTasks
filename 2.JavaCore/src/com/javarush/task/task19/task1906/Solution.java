package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("c:/data.txt");
        FileWriter writer = new FileWriter("c:/result.txt");

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            reader.read();

            int data = reader.read(); //читаем один символ (char будет расширен до int)
            writer.write(data); //пишем один символ (int будет обрезан/сужен до char)
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();
    }
}
