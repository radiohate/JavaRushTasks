package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> listFNames = new ArrayList<>();
        List<String> listCities = new ArrayList<>();
        while (true) {
            String city= reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            listFNames.add(family);
            listCities.add(city);
        }

        // Read the house number
        //int houseNumber = Integer.parseInt(reader.readLine());
        String familyCity = reader.readLine();


        if (listCities.contains(familyCity)) {
            String familyName = listFNames.get(listCities.indexOf(familyCity));
            System.out.println(familyName);
        }
    }
}
