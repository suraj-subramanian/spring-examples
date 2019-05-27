package com.jpm.spring.currency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String args[]) throws Exception {
		/*Resource res = new ClassPathResource("currencyconverter.xml");
		BeanFactory factory = new XmlBeanFactory(res);*/
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("currencyconverter.xml");
		CurrencyConverter curr = (CurrencyConverter) context.getBean("currencyConverter");
		double rupees = curr.dollarsToRupees(50.0);
		System.out.println("50 $ is "+rupees+" Rs.");
	}
}
