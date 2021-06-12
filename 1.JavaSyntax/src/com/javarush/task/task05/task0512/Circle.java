package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
centerX, centerY, radius, width и color
initialize
*/

public class Circle {
    //напишите тут ваш код
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    //centerX, centerY, radius и инициализирующий соответствующие переменные класса
    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    //centerX, centerY, radius, width и инициализирующий соответствующие переменные класса
    public void initialize(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    //centerX, centerY, radius, width, color и инициализирующий соответствующие переменные класса
    public void initialize(int centerX, int centerY, int radius, int width, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
