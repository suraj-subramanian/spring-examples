package com.jpm.spring.currency;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value="exchangeService")
public class ExchangeServiceImpl implements ExchangeService {
	private double exchangeRate;
	public ExchangeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public ExchangeServiceImpl(double exchangeRate) {
		System.out.println("ExchangeServiceImpl()....instantiated");
		this.exchangeRate = exchangeRate;
	}
	@Value(value="70.33")
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() {
		System.out.println("getExchangeRate()....");
		return exchangeRate;
	}
}
