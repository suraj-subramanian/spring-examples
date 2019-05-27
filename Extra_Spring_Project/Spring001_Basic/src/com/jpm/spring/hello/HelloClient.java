/**
 * 
 */
package com.jpm.spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

/**
 * @author Smita B Kumar
 *
 */
public class HelloClient {

	public static void main(String[] args) {
		//HelloWorld hello = new HelloWorld();
		//Spring IOC container
		ApplicationContext context=
					new ClassPathXmlApplicationContext("context.xml");
		IGreeting h1 =(IGreeting) context.getBean("helloObj");//Object		
		System.out.println(h1.greet());
		
		h1= (IGreeting) context.getBean("helloObj1");
		System.out.println(h1.greet());

	}

}
