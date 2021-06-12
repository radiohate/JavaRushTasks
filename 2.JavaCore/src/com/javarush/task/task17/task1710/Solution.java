package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        String name;
        Sex sex;
        Date bd;
        Person p = null;
        int id;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        if (args[0].equals("-c")){
            name = args[1];
            sex = args[2] == "м"? Sex.MALE: Sex.FEMALE;
            bd = format.parse(args[3]);
            if(sex == Sex.MALE){
                p = Person.createMale(name, bd);
            }
            else {
                p = Person.createFemale(name, bd);
            }
            allPeople.add(p);
            System.out.println(allPeople.indexOf(p));
        }
        if(args[0].equals("-u")){
            id = Integer.parseInt(args[1]);
            name = args[2];
            sex = (args[3] == "м") ? Sex.MALE : Sex.FEMALE;
            bd = format.parse(args[4]);
            p = allPeople.get(id);
            p.setName(name);
            p.setSex(sex);
            p.setBirthDate(bd);
        }

        if(args[0].equals("-d")){
            id = Integer.parseInt(args[1]);
            p = allPeople.get(id);
            p.setSex(null);
            p.setBirthDate(null);
            p.setName(null);
        }
        if(args[0].equals("-i")){
            // name sex (м/ж) bd (формат 15-Apr-1990)
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            id = Integer.parseInt(args[1]);
            p = allPeople.get(id);
            //bd = format.parse(p.getBirthDate());
            String sBD = (p.getSex() == Sex.MALE) ? "м" : "ж";
            System.out.println(p.getName() + " " + sBD + " " + format1.format(p.getBirthDate()));
        }
    }
}
