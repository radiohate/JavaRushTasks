package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;
    //public static int sec = 1;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
       Thread.sleep(3500);
       clock.interrupt();

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            //int sec = 0;
            while(numSeconds != 0 && !isInterrupted()) {

                System.out.print(numSeconds + " ");

                try {
                    Thread.sleep(1000);
                    numSeconds--;


                } catch (InterruptedException e) {
                    System.out.print("Прервано!");
                    interrupt();
                }
                if(numSeconds == 0) System.out.println("Марш!");

            }
        }
    }
}
