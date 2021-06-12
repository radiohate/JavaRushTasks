package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] arr1 = new int[5];
        int[] arr2 = new int[2];
        int[] arr3 = new int[4];
        int[] arr4 = new int[7];
        int[] arr5 = new int[0];
        //ArrayList<int[]> arrayList = new ArrayList(Arrays.asList(arr1, arr2, arr3, arr4, arr5));
        arrayList.add(arr1);
        arrayList.add(arr2);
        arrayList.add(arr3);
        arrayList.add(arr4);
        arrayList.add(arr5);
        for (int[] array : arrayList){
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }
        }
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
