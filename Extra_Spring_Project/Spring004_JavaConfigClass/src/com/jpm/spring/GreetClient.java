/**
 * 
 */
package com.jpm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Smita B Kumar
 *
 */
public class GreetClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new
			AnnotationConfigApplicationContext(SpringJavaConfig.class);
		
		IGreetings g1 = (IGreetings) context.getBean("greeting");
		System.out.println(g1.greet("Smita"));

	}

}
