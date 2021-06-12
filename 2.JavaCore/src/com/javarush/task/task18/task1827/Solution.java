package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы
id productName price quantity
-c productName price quantity

id - 8 символов, productName - название товара, 30 символов,
price - цена, 8 символов, quantity - количество, 4 символа.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        if(args.length > 0 && args[0].equals("-c")){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        bufferedReader.close();

        String productName = args[1]; //30
        String price = args[2]; //8
        String quantity = args[3]; //4

        //ArrayList<Integer> arrID = new ArrayList<>();
        int max = 0;
        Integer i;

            FileInputStream is = new FileInputStream(name);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String s;
            while ((s = br.readLine()) != null) {
                i = Integer.valueOf(deleteSpaces(s.substring(0,8)));
                if(i > max) max = i;
            }
            is.close();
            br.close();
            i = max + 1;

            s = addSpaces(i.toString(), 8) + addSpaces(productName, 30) + addSpaces(price, 8) + addSpaces(quantity, 4);
            //System.out.println(s);

            FileOutputStream os = new FileOutputStream(name, true);
            os.write(10);
            os.write(s.getBytes());
            os.close();
        } else ;

    }
     public static String addSpaces (String s, int length){
        for (int i = s.length(); i < length; i++) {
            s+=" ";
        }
        return s;
    }
    public static String deleteSpaces(String s){
        return s.contains(" ") ? s.substring(0, s.indexOf(" ")): s;
    }

}
