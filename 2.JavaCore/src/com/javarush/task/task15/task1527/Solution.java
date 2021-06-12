package com.javarush.task.task15.task1527;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String param = "";
        s = s.substring(s.indexOf("?")+1);

        String[] arrStr = s.split("&");
        boolean objExistDouble = false;
        boolean objExistString = false;
        String s1;
        Double valueDouble = 0.0;
        String valueStr = "";
        for (int i = 0; i < arrStr.length; i++) {
            if(arrStr[i].contains("obj")){
                objExistString = true;
                valueStr = arrStr[i].substring(arrStr[i].indexOf("=")+1);
                try{
                    valueDouble = Double.parseDouble(valueStr);
                    objExistDouble = true;
                }catch(NumberFormatException e){

                }
            }
            if(arrStr[i].contains("=")){
                s1 = arrStr[i].substring(0,arrStr[i].indexOf("="));
            } else s1 = arrStr[i];
            param += s1 + " ";
        }
        System.out.println(param);
        if(objExistString){
            if(objExistDouble) alert(valueDouble);
            else{
                alert(valueStr);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
