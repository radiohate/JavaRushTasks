package com.javarush.task.task19.task1904;

import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        System.out.println(new PersonScannerAdapter(new Scanner(new FileReader("1"))).read());

    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }
        @Override
        public Person read() throws IOException, ParseException {
            //Иванов Иван Иванович 31 12 1950
            String source = fileScanner.nextLine();
            String[] mas = source.split(" ");
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            String sDate = mas[mas.length -3] + "/" + mas[mas.length-2] + "/" + mas[mas.length-1];
            Date myDate = sdf1.parse(sDate);

            Person myPerson = new Person(mas[1], mas[2], mas[0], myDate);

            return myPerson;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();

        }
    }
}
