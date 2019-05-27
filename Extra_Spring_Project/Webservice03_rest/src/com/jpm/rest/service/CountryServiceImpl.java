/**
 * 
 */
package com.jpm.rest.service;

import java.util.List;

import com.jpm.rest.Country;
import com.jpm.rest.dao.CountryDaoImpl;
import com.jpm.rest.dao.ICountryDao;

/**
 * @author Smita
 *
 */
public class CountryServiceImpl implements ICountryService {
//step 1 : create instance var of dao interface
			private ICountryDao countryDao;
//step 2 : create the object of dao class in contructor
			public CountryServiceImpl() {
				countryDao = new CountryDaoImpl();
				//ServiceFactory.getCountryDao();
			}
//step 3 : invoke dao layer method in each method of service
//step 4: cross verify , no method should return null /0	
	@Override
	public List<Country> getAllCountries() {
		return countryDao.getAllCountries();
	}	
	@Override
	public Country getCountry(int countryId) {
		return countryDao.getCountry(countryId);
	}	
	@Override
	public Country addCountry(Country country) {
		return countryDao.addCountry(country);
	}	
	@Override
	public Country deleteCountry(int countryId) {
		return countryDao.deleteCountry(countryId);
	}	
	@Override
	public Country updateCountry(Country country) {
		return countryDao.updateCountry(country);
	}
}
