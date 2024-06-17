package org.py;
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
	        
	        for (int year = 1998; year <= 2020; year++) {
	            String ruler = rulers.get(year);
	            System.out.println(year + " - " + (ruler != null ? ruler : "No data available"));
	        }
	    }
	

	        }
	    


