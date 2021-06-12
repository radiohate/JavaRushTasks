package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {

    public class NotGoodForNODExcertion extends Exception{
        public NotGoodForNODExcertion(String message) {
            super(message);
        }
    }
    public static void main(String[] args) throws Exception {
        int a = 0;
        int b = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            Solution s = new Solution();
            System.out.println(s.NOD(a,b));

            }

    public int NOD(int a, int b) throws NotGoodForNODExcertion {
        int min = 0;
        int NOD = 1;
        if(a<b) min = a; else min = b;
        if(a <= 0 || b <= 0){throw new NotGoodForNODExcertion("Оба числа должны быть положительные и больше 0");}
        else {
            for (int i = min; i >0 ; i--) {
            if(a%i == 0 && b%i == 0) {
                NOD = i;
                break;
            }
            }
        }
        return NOD;
    }
}
