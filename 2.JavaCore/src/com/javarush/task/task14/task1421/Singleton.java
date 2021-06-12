package com.javarush.task.task14.task1421;

public class Singleton {

    private Singleton() {
        //Singleton singleton = new Singleton();
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){

        return instance;
    }
}
