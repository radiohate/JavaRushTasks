package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    //private FileInputStream is;


    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }



    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        TxtInputStream txt = new TxtInputStream("1");
    }
}

