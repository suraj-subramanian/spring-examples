package com.jpm.spring.currency;

public class ExchangeServiceImpl implements ExchangeService {
	private double exchangeRate;
	
	public ExchangeServiceImpl(double exchangeRate) {
		System.out.println("ExchangeServiceImpl()....instantiated");
		this.exchangeRate = exchangeRate;
	}
	public double getExchangeRate() {
		System.out.println("getExchangeRate()....");
		return exchangeRate;
	}
}
