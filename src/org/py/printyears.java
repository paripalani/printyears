package org.py;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class printyears {

    public static void main(String[] args) {
        Map<Integer, String> rulers = new HashMap<>();
        
        // Data about who ruled India (Prime Ministers) during the specified period
        rulers.put(1998, "Atal Bihari Vajpayee");
        rulers.put(1999, "Atal Bihari Vajpayee");
        rulers.put(2000, "Atal Bihari Vajpayee");
        rulers.put(2001, "Atal Bihari Vajpayee");
        rulers.put(2002, "Atal Bihari Vajpayee");
        rulers.put(2003, "Atal Bihari Vajpayee");
        rulers.put(2004, "Atal Bihari Vajpayee");
        rulers.put(2005, "Manmohan Singh");
        rulers.put(2006, "Manmohan Singh");
        rulers.put(2007, "Manmohan Singh");
        rulers.put(2008, "Manmohan Singh");
        rulers.put(2009, "Manmohan Singh");
        rulers.put(2010, "Manmohan Singh");
        rulers.put(2011, "Manmohan Singh");
        rulers.put(2012, "Manmohan Singh");
        rulers.put(2013, "Manmohan Singh");
        rulers.put(2014, "Manmohan Singh");
        rulers.put(2015, "Narendra Modi");
        rulers.put(2016, "Narendra Modi");
        rulers.put(2017, "Narendra Modi");
        rulers.put(2018, "Narendra Modi");
        rulers.put(2019, "Narendra Modi");
        rulers.put(2020, "Narendra Modi");
        rulers.put(2021, "Narendra Modi");
        rulers.put(2022, "Narendra Modi");
        rulers.put(2023, "Narendra Modi");
        rulers.put(2024, "Narendra Modi");

        // Data about people born between 1990 and 2010 and their DOB
        Map<String, LocalDate> dobMap = new HashMap<>();
        dobMap.put("Person A", LocalDate.of(1990, 5, 15));
        dobMap.put("Person B", LocalDate.of(1995, 7, 22));
        dobMap.put("Person C", LocalDate.of(2000, 1, 5));

        // Iterate over the years 1998 to 2024
        for (int year = 1998; year <= 2024; year++) {
            String ruler = rulers.get(year);
            System.out.println(year + " - " + (ruler != null ? ruler : "No data available"));
            
            // Calculate and print ages for each person
            for (Map.Entry<String, LocalDate> entry : dobMap.entrySet()) {
                String name = entry.getKey();
                LocalDate dob = entry.getValue();
                
                // Calculate age only if the person was born on or before the current year
                if (dob.getYear() <= year) {
                    int age = calculateAge(dob, year);
                    System.out.println("  " + name + " was " + age + " years old in " + year);
                }
            }
        }
    }

    private static int calculateAge(LocalDate dob, int year) {
        LocalDate currentDate = LocalDate.of(year, 1, 1);
        return Period.between(dob, currentDate).getYears();
    }
}
