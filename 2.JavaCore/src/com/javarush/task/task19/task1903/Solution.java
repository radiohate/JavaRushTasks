package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;
//UA Ukraine
//RU Russia
//CA Canada

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
                countries.put("UA", "Ukraine");
                countries.put("RU", "Russia");
                countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
       /* IncomeData myData = new InData();
        IncomeDataAdapter adapter = new IncomeDataAdapter(myData);
        System.out.println(adapter.getCompanyName());
        System.out.println(adapter.getCountryName());
        System.out.println(adapter.getName());
        System.out.println(adapter.getPhoneNumber());*/

    }

    public static class IncomeDataAdapter implements Contact, Customer {

        private IncomeData data;
        public IncomeDataAdapter(IncomeData data){
            this.data = data;
        }
        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String key = data.getCountryCode();
            return countries.get(key);
        }

        @Override
        public String getName() {
            //Ivanov, Ivan
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            //+38(050)123-45-67
            //38 501234567
            Integer code = data.getCountryPhoneCode();
            Integer number = data.getPhoneNumber();
            String fullNumber = number.toString();
            if(fullNumber.length() == 10);
            else
            while (fullNumber.length() < 10){
               fullNumber = "0" + fullNumber;
           }
            String result = "+" + code.toString() + "(" + fullNumber.substring(0,3) + ")" + fullNumber.substring(3,6) +
                    "-" + fullNumber.substring(6,8) + "-" + fullNumber.substring(8);
            return result;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }
/*    public static class InData implements IncomeData{

        @Override
        public String getCountryCode() {
            return "CA";
        }

        @Override
        public String getCompany() {
            return "Tesla";
        }

        @Override
        public String getContactFirstName() {
            return "Carl";
        }

        @Override
        public String getContactLastName() {
            return "Petrovich";
        }

        @Override
        public int getCountryPhoneCode() {
            return 88;
        }

        @Override
        public int getPhoneNumber() {
            return 123;
        }
    }*/

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}