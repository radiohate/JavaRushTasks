package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Среднее арифметическое
Если пользователь ввел -1, вывести на экран среднее арифметическое всех чисел и завершить программу.
-1 не должно учитываться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double average = 0;
        int sum = 0;
        int num = 0;
        int i = 0;
        while (true){
            num = Integer.parseInt(br.readLine());
            if(num == -1)break;
            i++;
            sum = sum + num;
            average = (double)sum/i;
            //System.out.println("Undecisive result (" + sum + ") : " + average);
        }
        System.out.println(average);
    }
}

