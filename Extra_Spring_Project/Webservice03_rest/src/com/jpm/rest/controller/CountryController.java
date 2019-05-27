/**
 * 
 */
package com.jpm.rest.controller;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jpm.rest.Country;
import com.jpm.rest.service.CountryServiceImpl;
import com.jpm.rest.service.ICountryService;

/**
 * @author Smita B Kumar
 *
 */
//In jaxrs we use @Path annotation to map 
//the request to the specific resource
// http://localhost:8080/rest/add
@Path(value="/countries")
public class CountryController {
	//Step 2:create Instance variable of Service Interface
		private ICountryService countryService;
	//Step 3: instantiate the service in constructor
		public CountryController() {
			countryService = new CountryServiceImpl();
			//or get the service object from the ServiceFactory
			//countryService = ServiceFactory.getServiceInstance();
		}
	//step 4: write method to invoke service 
//http://localhost:8080/Webservice03_rest/rest/countries/hello
		@GET
		@Path("/hello")
		@Produces(MediaType.TEXT_PLAIN)
		public String sayHello() {
			return "Hello From JAX-RS using jersy....";
		}
	//and map it to the specific HTTP request
//jersy,RestEasy,CFX,AXis,spring...many more ->Rest Provider
		//step 4: write method to invoke service 
		@GET
		@Path("/countryList")
		@Produces(MediaType.APPLICATION_JSON)
		public List<Country> getAllCountries(){
			List<Country> list = countryService.getAllCountries();
			return list;
		}
		//step 4: write method to invoke service 
		@POST
		@Path("/addCountry")	
		@Produces(MediaType.APPLICATION_JSON)
//@FormParam->fetching the form param named txtId and storing it in countryId
		public Country addNewCountry(@FormParam("txtId")int countryId,
				@FormParam("txtName")String countryName,
				@FormParam("txtPopulation")long population
				) {
			//fetching the input value of country from page
			//creating the country object
			Country country = 
					new Country(countryId, countryName, population);
			//invoke the service which will add the country record
			return countryService.addCountry(country);
			
		}
}












