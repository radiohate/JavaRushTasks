package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String key;
        ArrayList<String> arr = new ArrayList<>();
        while (true){
            key = br.readLine();
            arr.add(key);
            if(key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller")){}
                else break;
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
        for(String s: arr){

            Movie movie = MovieFactory.getMovie(s);
            if(movie != null)
                System.out.println(movie.getClass().getSimpleName());
        }


    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))  movie = new SoapOpera();
            //напишите тут ваш код, пункты 5,6
            if ("cartoon".equals(key))  movie = new Cartoon();
            if ("thriller".equals(key))  movie = new Thriller();
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Thriller extends Movie {
    }
    static class Cartoon extends Movie {
    }
}
