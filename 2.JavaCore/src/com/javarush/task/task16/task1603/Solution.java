package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread sp1 = new SpecialThread();
        SpecialThread sp2 = new SpecialThread();
        SpecialThread sp3 = new SpecialThread();
        SpecialThread sp4 = new SpecialThread();
        SpecialThread sp5 = new SpecialThread();
        Thread t1 = new Thread(sp1);
        Thread t2 = new Thread(sp2);
        Thread t3 = new Thread(sp3);
        Thread t4 = new Thread(sp4);
        Thread t5 = new Thread(sp5);
        Collections.addAll(list, t1,t2,t3,t4,t5);
        /*for(Thread t: list){
            t.start();
        }*/

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
