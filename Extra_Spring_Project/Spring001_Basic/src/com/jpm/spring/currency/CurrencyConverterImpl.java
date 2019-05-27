package com.jpm.spring.currency;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	private ExchangeService exchangeService;
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl instantiated.......");	
	}
	
	@Override
	public double dollarsToRupees(double dollars) {
		// TODO Auto-generated method stub
		return exchangeService.getExchangeRate() * dollars;
	}

	public ExchangeService getExchangeService() {
		return exchangeService;
	}

	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("In CurrencyConverter ...Injecting exchangeService ......");
		this.exchangeService = exchangeService;
	}	
};