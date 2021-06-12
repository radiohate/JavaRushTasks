package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        printTypeOfNum(a);

    }
    public static void printTypeOfNum (int a){
        if(a == 0) System.out.println("ноль");
        else if (a % 2 == 0){
            if (a > 0) System.out.println("положительное четное число");
            else System.out.println("отрицательное четное число");
        } else if (a > 0) System.out.println("положительное нечетное число");
        else System.out.println("отрицательное нечетное число");

    }
}
