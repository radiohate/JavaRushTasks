package com.javarush.task.task08.task0801;

//import sun.text.resources.CollationData;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из растений
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Set<String> setList = new HashSet<>();
        Collections.addAll(setList, "арбуз", "банан", "вишня","груша","дыня","ежевика","женьшень","земляника","ирис", "картофель");
        //for(String s: setList) System.out.println(s);
        Iterator<String> iterator = setList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
