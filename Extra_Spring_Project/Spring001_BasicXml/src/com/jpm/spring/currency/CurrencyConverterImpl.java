package com.jpm.spring.currency;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	private double exchangeRate;
	
	public double getExchangeRate() {
		System.out.println("getExchangeRate()");		
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		System.out.println("setExchangeRate()");		
		this.exchangeRate = exchangeRate;
	}

	public double dollarsToRupees(double dollars) {
		System.out.println("dollarsToRupees()");		
		return dollars * exchangeRate;
	}
};