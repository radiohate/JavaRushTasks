package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        Pair<Integer, Integer> pair;
        //= new Pair<Integer, Integer>(null, null);
        if (inputArray == null || inputArray.length == 0) {
            pair = new Pair<Integer, Integer>(null, null);
            return pair;
        }
        //pair = new Pair<Integer, Integer>(inputArray[0], inputArray[0]);

        int min = inputArray[0];
        int max = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] > max) max = inputArray[i];
            if(inputArray[i] < min) min = inputArray[i];
        }

        // напишите тут ваш код

        return new Pair<Integer, Integer>(min, max);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
