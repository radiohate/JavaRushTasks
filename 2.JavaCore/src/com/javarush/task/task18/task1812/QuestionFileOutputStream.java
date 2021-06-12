package com.javarush.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {



    private AmigoOutputStream example;
    public QuestionFileOutputStream(AmigoOutputStream e){
        this.example = e;
    }

    @Override
    public void flush() throws IOException {
        example.flush();
    }

    @Override
    public void write(int b) throws IOException {
        example.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        example.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        example.write(b,off,len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String arg = br.readLine();
        br.close();
        if(arg.equals("Д")) example.close();
    }
}

