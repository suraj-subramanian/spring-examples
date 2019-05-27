/**
 * 
 */
package com.jpm.rest.service;
import java.util.List;

import com.jpm.rest.Country;
/**
 * @author Smita
 *
 */
public interface ICountryService {
	public List<Country> getAllCountries();
	public Country getCountry(int countryId);
	public Country addCountry(Country country);
	public Country deleteCountry(int countryId);
	public Country updateCountry(Country country);
}
