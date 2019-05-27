/**
 * 
 */
package com.jpm.rest.dao;

import java.util.HashMap;

import com.jpm.rest.Country;

/**
 * @author Smita
 *
 */
public class CountryDb {
	static HashMap<Integer, Country> countryMapId
	=getCountryMapId();
	
	static {
		if(countryMapId==null) {
			countryMapId = new HashMap<>();
			Country in = new Country(1, "India", 100000);
			Country ch = new Country(2, "China", 200000);
			Country usa = new Country(3, "USA", 8000);
			Country uk = new Country(4, "UK", 5000);
			
			countryMapId.put(1, in);countryMapId.put(2, ch);
			countryMapId.put(3, usa);countryMapId.put(4, uk);
		}
	}

	public static HashMap<Integer, Country> getCountryMapId() {
		// TODO Auto-generated method stub
		return countryMapId;
	}
	
}
