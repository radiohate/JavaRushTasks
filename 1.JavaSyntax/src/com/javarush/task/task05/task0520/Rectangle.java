package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
 top, left, width и height
*/


public class Rectangle {
    //напишите тут ваш код
    int top;
    int left;
    int width;
    int height;

    //- ширина/высота не задана (оба равны 0)
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    //- высота не задана (равно ширине) создаём квадрат

    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    //- создаём копию другого прямоугольника
    public Rectangle(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    //int top, int left, int width, int height
    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
