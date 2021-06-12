package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getCountryName() {
                return "Canada";
            }
        };
        Contact contact = new Contact() {
            @Override
            public String getName() {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber() {
                //+38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567
                return "+38(050)123-45-67";
            }
        };
        DataAdapter adapter = new DataAdapter(customer, contact);
        System.out.println(adapter.getCountryCode());
        System.out.println(adapter.getCompany());
        System.out.println(adapter.getContactFirstName());
        System.out.println(adapter.getContactLastName());
        System.out.println(adapter.getDialString());

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String countryName =  customer.getCountryName();
            String countryCode = "";
            for (Map.Entry<String, String> pair : countries.entrySet()) {
                if(pair.getValue().equals(countryName))
                    countryCode = pair.getKey();
            }
            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {

            return contact.getName().substring(contact.getName().indexOf(" ") + 1);

        }

        @Override
        public String getContactLastName() {
            String name = contact.getName();
            return name.substring(0,name.indexOf(","));
        }

        @Override
        public String getDialString() {
            String phoneNum = contact.getPhoneNumber();
            String result = "callto://+";
            char[] arr = phoneNum.toCharArray();
            for (int i = 1; i < arr.length; i++) {
                if (isDigit(arr[i]))
                    result += arr[i];
            }
            return result;

        }
        public boolean isDigit (char symb){
            if(symb > 47 && symb < 58)
                return true;
            else
                return false;
        }

    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}