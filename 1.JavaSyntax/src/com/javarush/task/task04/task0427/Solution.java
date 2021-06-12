package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        printTypeNum(br.readLine());

    }
    public static void printTypeNum (String sA){
        int a = Integer.parseInt(sA);
        int l = sA.length();
        String even = "";
        String digitQty = "";
        if(a > 0 && a < 1000){
        if(a % 2 == 0) {
            even = "четное ";
            switch (l) {
                case 1:
                    digitQty = "однозначное ";
                    break;
                case 2:
                    digitQty = "двузначное ";
                    break;
                case 3:
                    digitQty = "трехзначное ";
                    break;
            }
        } else {
            even = "нечетное ";
            switch (l) {
                case 1:
                    digitQty = "однозначное ";
                    break;
                case 2:
                    digitQty = "двузначное ";
                    break;
                case 3:
                    digitQty = "трехзначное ";
                    break;
            }
        }
        System.out.println(even + digitQty + "число");
    }
    }
}
