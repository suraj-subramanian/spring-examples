package com.jpm.spring.currency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {
//Spring IOC Container
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("context.xml");
		CurrencyConverter curr = 
				(CurrencyConverter) context.getBean("conObj");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
