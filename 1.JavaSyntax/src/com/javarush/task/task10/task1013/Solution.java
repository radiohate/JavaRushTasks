package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int q;
        private int w;
        private int e;
        private int a;
        private int s;
        private Human h;

        public Human(int q, int w, int e, int a, int s, Human h){
            this.q = q;
            this.w = w;
            this.e = e;
            this.a = a;
            this.s = s;
            this.h = h;
        }
        public Human(int q, int w, int e, int a, int s){
            this.q = q;
            this.w = w;
            this.e = e;
            this.a = a;
            this.s = s;
        }
        public Human(int q, int w, int e, int a){
            this.q = q;
            this.w = w;
            this.e = e;
            this.a = a;
        }
        public Human(int q, int w, int e){
            this.q = q;
            this.w = w;
            this.e = e;
        }
        public Human(int q, int w){
            this.q = q;
            this.w = w;
        }
        public Human(int q, Human h){
            this.q = q;
            this.h = h;
        }
        public Human(int q, int w, Human h){
            this.q = q;
            this.w = w;
            this.h = h;
        }
        public Human(int q, int w, int e, Human h){
            this.q = q;
            this.w = w;
            this.e = e;
            this.h = h;
        }
        public Human(int q, int w, int e, int a, Human h){
            this.q = q;
            this.w = w;
            this.e = e;
            this.a = a;
            this.h = h;

        }
        public Human(int q){

            this.q = q;
        }


        // Напишите тут ваши переменные и конструкторы
    }
}
