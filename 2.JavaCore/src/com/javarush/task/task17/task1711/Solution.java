package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createFemale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        //name - имя, String
        //sex - пол, "м" или "ж", одна буква
        //bd - дата рождения в следующем формате 15/04/1990
        String name;
        Sex sex;
        Date bd;
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person p;

        //-с - добавляет всех людей с заданными параметрами в конец allPeople,
        // выводит id (index) на экран в соответствующем порядке

        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                    int count = 0;
                    for (int i = 0; i < (args.length-1); i+=3) {
                        name = args[i + 1];
                        sex = args[i + 2].equals("м")? Sex.MALE : Sex.FEMALE;
                        bd = sdf1.parse(args[i + 3]);
                        p = sex == Sex.MALE? Person.createMale(name, bd) : Person.createFemale(name,bd);
                        allPeople.add(p);
                        count++;

                    }
                    for (int i = (allPeople.size() - count ); i < allPeople.size(); i++) {
                        System.out.println(i);
                    }
                }

                break;

               //-u - обновляет соответствующие данные людей с заданными id
            //-u id1 name1 sex1 bd1 id2 name2 sex2 bd2
            case "-u":
                //for (Person pp: allPeople) System.out.println(pp.getName() + " " + pp.getSex() + " " + pp.getBirthDate());
                synchronized (allPeople){
                    for (int i = 0; i < (args.length-1); i+=4) {
                        p = allPeople.get(Integer.parseInt(args[i + 1]));
                        name = args[i+2];
                        sex = args[i+3].equals("м")? Sex.MALE: Sex.FEMALE;
                        bd = sdf1.parse(args[i+4]);
                        p.setName(name);
                        p.setSex(sex);
                        p.setBirthDate(bd);
                    }
                }

                //System.out.println();
                //for (Person pp: allPeople) System.out.println(pp.getName() + " " + pp.getSex() + " " + pp.getBirthDate());
        break;
                //-d id1 id2 id3 id4
            case "-d":
                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        p = allPeople.get(Integer.parseInt(args[i]));
                        p.setName(null);
                        p.setSex(null);
                        p.setBirthDate(null);
                    }
                }
                //for (Person pp: allPeople) System.out.println(pp.getName() + " " + pp.getSex() + " " + pp.getBirthDate());

                //for (Person pp: allPeople) System.out.println(pp.getName() + " " + pp.getSex() + " " + pp.getBirthDate());
                break;
                //-i id1 id2 id3 id4
            case "-i":
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

                synchronized (allPeople){
                    for (int i = 1; i < args.length; i++) {
                        p = allPeople.get(Integer.parseInt(args[i]));
                        String sSex = p.getSex() == Sex.MALE? "м": "ж";
                        bd = p.getBirthDate();
                        System.out.println(p.getName() + " " + sSex + " " + sdf2.format(bd));

                    }
                }



        }

    }
}
