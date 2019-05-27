package com.jpm.spring.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jpm.spring.currency.CurrencyConverter;

public class HelloClient {

	public static void main(String args[]) throws Exception {
		/*Resource res = new ClassPathResource("currencyconverter.xml");
		BeanFactory factory = new XmlBeanFactory(res);*/
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		HelloWorld hello = (HelloWorld) context.getBean("hello");
		System.out.println(hello.greet());
	}
}
