package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static class Thread2 extends Thread{
        @Override
        public void run() {
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("InterruptedException");
            }

        }
    }
    public static class Thread3 extends Thread{
        @Override
        public void run() {
            try {
                while (!isInterrupted()){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static class Thread4 extends Thread implements Message{
        @Override
        public void run() {
            while (!isInterrupted()){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }
    public static class Thread5 extends Thread{
        @Override
        public void run() {
            int sum = 0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                String s = null;
                try {
                    s = br.readLine();
                    if(s.equals("N")) break;
                    sum += Integer.parseInt(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(sum);
        }
    }
    public static List<Thread> threads = new ArrayList<>(5);
static {
    threads.add(new Thread1());
    threads.add(new Thread2());
    threads.add(new Thread3());
    threads.add(new Thread4());
    threads.add(new Thread5());
}

    public static void main(String[] args) {

        for(Thread t: threads){
            t.start();
        }
    }
}