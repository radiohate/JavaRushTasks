package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;

/* 
Прайсы 2
-u id productName price quantity
-d id
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        bufferedReader.close();

        if(args.length > 0 && args[0].equals("-d")){

            String id = addSpaces(args[1], 8);
            ArrayList<String> arrayList = new ArrayList<>();
            FileInputStream is = new FileInputStream(name);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String s;
            while ((s = br.readLine()) != null) {
                //System.out.println(s + " " + s.startsWith(id));
                if(!s.startsWith(id)) arrayList.add(s);
            }
            is.close();
            br.close();

            FileOutputStream os = new FileOutputStream(name, false);
            for(String q: arrayList){
                //System.out.println(q);
                os.write(q.getBytes());
                os.write(10);
            }
            os.close();
        }
        ///////////////////////////////////////////////////////

        if(args.length > 0 && args[0].equals("-u")){
            //-u id productName price quantity

            String id = addSpaces(args[1], 8);
            String productName = addSpaces(args[2], 30);
            String price = addSpaces(args[3], 8);
            String quantity = addSpaces(args[4], 4);

            String replaceStr = id+productName+price+quantity;

            ArrayList<String> arrayList = new ArrayList<>();

            FileInputStream is = new FileInputStream(name);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String s;
            while ((s = br.readLine()) != null) {
                //System.out.println(s + " " + s.startsWith(id));
                if(!s.startsWith(id)) arrayList.add(s);
                else arrayList.add(replaceStr);
            }
            is.close();
            br.close();

            FileOutputStream os = new FileOutputStream(name, false);
            for(String q: arrayList){
                //System.out.println(q);
                os.write(q.getBytes());
                os.write(10);
            }
            os.close();
        }

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

