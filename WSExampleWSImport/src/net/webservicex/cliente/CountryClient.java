package net.webservicex.cliente;

import net.webservicex.GetCitiesByCountryResponse;

public class CountryClient{

	public static void main(String[] args) {

		GetCitiesByCountryResponse countryResponse = new GetCitiesByCountryResponse();
		countryResponse.setGetCitiesByCountryResult("Mexico");
		
		System.out.println(countryResponse.getGetCitiesByCountryResult());

    }

}